package com.ckandspace.api;
import com.ckandspace.dto.ckan.CkanRepo;
import com.ckandspace.dto.ckan.Dataset;
import com.ckandspace.dto.ckan.Resource;
import com.ckandspace.dto.ckan.Result;
import com.ckandspace.dto.dspace.*;
import com.ckandspace.dto.dspace.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.apache.commons.io.FileUtils;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.glassfish.jersey.media.multipart.internal.MultiPartWriter;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class ApiUtils {
    private static String ckanAPI = "";
    private static String dspaceAPI = "";

    public static void setAPIS(Properties prop) {
        ckanAPI = prop.getProperty("apiCKAN");
        dspaceAPI = prop.getProperty("apiDSPACE");
    }

    public static void listA() {

        try {
            Client client = Client.create();

            WebResource webResource = client
                    .resource(ckanAPI + "/api/3/action/package_search");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            CkanRepo items = gson.fromJson(output, CkanRepo.class);

            System.out.println(gson.toJson(items));

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static void listB(String username, String password) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource(dspaceAPI + "/rest/login?email=" + username + "&password=" + password);

            ClientResponse response = webResource.type("application/json")
                    .post(ClientResponse.class);

            if ((response.getStatus() != 200)) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            List<NewCookie> cookies = response.getCookies();

             webResource = client
                    .resource(dspaceAPI + "/rest/communities");
             webResource.cookie(cookies.get(0));

             response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Community[] communities = gson.fromJson(output, Community[].class);

            for(int i = 0; i < communities.length; i ++) {

                webResource = client
                        .resource(dspaceAPI + "/rest/communities/" + communities[i].getUuid() + "/collections");
                webResource.cookie(cookies.get(0));

                response = webResource.accept("application/json")
                        .get(ClientResponse.class);

                if (response.getStatus() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + response.getStatus());
                }

                output = response.getEntity(String.class);

                Collection[] collections = gson.fromJson(output, Collection[].class);

                for(int j = 0; j < collections.length; j ++) {

                    webResource = client
                            .resource(dspaceAPI + "/rest/collections/"+ collections[j].getUuid() + "/items");
                    webResource.cookie(cookies.get(0));

                    response = webResource.accept("application/json")
                            .get(ClientResponse.class);

                    if (response.getStatus() != 200) {
                        throw new RuntimeException("Failed : HTTP error code : "
                                + response.getStatus());
                    }

                    output = response.getEntity(String.class);
                    Item[] items = gson.fromJson(output, Item[].class);

                    for(int k = 0; k < items.length; k ++) {
                        webResource = client
                                .resource(dspaceAPI + "/rest/items/"+ items[k].getUuid() + "/metadata");
                        webResource.cookie(cookies.get(0));

                        response = webResource.accept("application/json")
                                .get(ClientResponse.class);

                        if (response.getStatus() != 200) {
                            throw new RuntimeException("Failed : HTTP error code : "
                                    + response.getStatus());
                        }

                        output = response.getEntity(String.class);
                        Metadata[] metadata = gson.fromJson(output, Metadata[].class);
                        items[k].setMetadata(Arrays.asList(metadata));
                    }
                    collections[j].setItems(Arrays.asList(items));
                }
                communities[i].setCollections(Arrays.asList(collections));
            }

            System.out.println(gson.toJson(communities));
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static void migrate(String username, String password) {
        try {
            DefaultClientConfig clientConfig = new DefaultClientConfig();
            clientConfig.getClasses().add(MultiPartWriter.class);
            Client client = Client.create(clientConfig);

            WebResource webResource = client
                    .resource(ckanAPI + "/api/3/action/package_search");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            CkanRepo repo = gson.fromJson(output, CkanRepo.class);

            List<Dataset> results = repo.getResult().getResults();
             webResource = client
                    .resource(dspaceAPI + "/rest/login?email=" + username + "&password=" + password);

             response = webResource.type("application/json")
                    .post(ClientResponse.class);

            if ((response.getStatus() != 200)) {
                throw new RuntimeException("Failed LOGIN: HTTP error code : "
                        + response.getStatus());
            }

            List<NewCookie> cookies = response.getCookies();

            Map<String,String> organsToCommunities = new HashMap<String,String>();

            for(int i = 0; i < results.size(); i++) {

                if(!organsToCommunities.keySet().contains(results.get(i).getOrganization().getId())) {
                    WebResource webResource1 = client
                            .resource(dspaceAPI + "/rest/communities");


                    response = webResource1.cookie(new Cookie("JSESSIONID", cookies.get(0).getValue())).type("application/json")
                            .post(ClientResponse.class, gson.toJson(mapOrganisationToCommunity(results.get(i))));

                    if ((response.getStatus() != 200)) {
                        System.err.println("Failed COMMUNITY CREATION: HTTP error code : "
                                + response.getStatus());
                    } else {
                        System.out.println("Successfully created community: " + results.get(i).getOrganization().getName());
                    }


                    output = response.getEntity(String.class);

                    String[] uuidComp = output.split("<UUID>");
                    String[] uuidComp2 = uuidComp[1].split("</UUID>");

                    organsToCommunities.put(results.get(i).getOrganization().getId(), uuidComp2[0]);

                }

                WebResource webResource1 = client
                        .resource(dspaceAPI + "/rest/communities/" + organsToCommunities.get(results.get(i).getOrganization().getId()) + "/collections");

                response = webResource1.cookie(new Cookie("JSESSIONID", cookies.get(0).getValue())).type("application/json")
                        .post(ClientResponse.class, gson.toJson(mapDatasetToCollection(results.get(i))));

                if ((response.getStatus() != 200)) {
                    System.err.println("Failed COLLECTION CREATION: HTTP error code : "
                            + response.getStatus());
                } else {
                    System.out.println("Successfully created collection: " + mapDatasetToCollection(results.get(i)).getName());
                }

                output = response.getEntity(String.class);

                List<Resource> items = results.get(i).getResources();

                for(int j = 0; j < items.size(); j++) {
                    String[] uuidComp = output.split("<UUID>");
                    String[] uuidComp2 = uuidComp[1].split("</UUID>");

                    webResource1 = client
                            .resource(dspaceAPI + "/rest/collections/" + uuidComp2[0] + "/items");


                    response = webResource1.cookie(new Cookie("JSESSIONID", cookies.get(0).getValue())).type("application/json")
                            .post(ClientResponse.class, gson.toJson(mapResourceToItem(items.get(j), results.get(i))));

                    if ((response.getStatus() != 200)) {
                        System.err.println("Failed ITEM CREATION: HTTP error code : "
                                + response.getStatus());

                    } else {
                        output = response.getEntity(String.class);

                        String[] uuidComp1 = output.split("<UUID>");
                        String[] uuidComp12 = uuidComp1[1].split("</UUID>");


                        webResource1 = client
                                .resource(dspaceAPI + "/rest/items/" + uuidComp12[0] + "/metadata");

                        response = webResource1.cookie(new Cookie("JSESSIONID", cookies.get(0).getValue())).type("application/json")
                                .post(ClientResponse.class, gson.toJson(mapResourceToMetadata(results.get(i), items.get(j))));

                        if ((response.getStatus() != 200)) {
                            System.err.println("Failed METADATA CREATION: HTTP error code : "
                                    + response.getStatus());
                        } else {
                            System.out.println("Successfully created item: " + items.get(j).getName());
                        }


                        Bitstream bitstream = new Bitstream();
                        bitstream.setLink(items.get(j).getUrl().replaceAll("http://localckan.com", ckanAPI + ""));
                        bitstream.setName(items.get(j).getName());

                        URL url = new URL(items.get(j).getUrl().replaceAll("http://localckan.com", ckanAPI + ""));

                        String[] nameComp = items.get(j).getUrl().replaceAll("http://localckan.com", ckanAPI + "").split("/");

                        String name = nameComp[nameComp.length - 1];
                        String description = items.get(j).getDescription().replaceAll(" ", "%20");


                        File f = new File("a.jpg");
                        FileUtils.copyURLToFile(url, f);

                        FileDataBodyPart filePart = new FileDataBodyPart("file", f);
                        MultiPart entity = new FormDataMultiPart();

                        entity.bodyPart(filePart);

                        webResource1 = client
                                .resource(dspaceAPI + "/rest/items/" + uuidComp12[0] + "/bitstreams?name="+name+"&description="+description);

                        response = webResource1.cookie(new Cookie("JSESSIONID", cookies.get(0).getValue())).type("multipart/form-data")
                                .post(ClientResponse.class, entity);



                        if ((response.getStatus() != 200)) {
                            System.err.println("Failed ADDING BITSTREAM: HTTP error code : "
                                    + response.getStatus());
                        }
                    }


                }

            }


        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static Community mapOrganisationToCommunity(Dataset result) {
        Community community = new Community();

        community.setName(result.getOrganization().getTitle());
        community.setType(result.getOrganization().getType());
        community.setShortDescription(result.getOrganization().getDescription());
        community.setUuid(result.getOrganization().getId());
        return community;
    }

    public static Collection mapDatasetToCollection(Dataset result) {
        Collection collection = new Collection();
        collection.setType(result.getType());
        collection.setName(result.getName());
        collection.setSidebarText(result.getTitle());
        collection.setIntroductoryText(result.getNotes());
        collection.setCopyrightText(result.getLicenseTitle() + " : " + result.getLicenseUrl());
        collection.setLink(result.getUrl());
        collection.setNumberItems(result.getNumResources());
        return collection;
    }

    public static Item mapResourceToItem(Resource resource, Dataset dataset) {
        Item item = new Item();
        item.setName(resource.getName());
        if(item.getName().length() == 0)
            item.setName("asdf");

        /*if(resource.getLastModified() != null)
            item.setLastModified(resource.getLastModified().toString());
        else
            item.setLastModified(resource.getCreated());
        item.setLink(resource.getUrl().replaceAll("http://localckan.com", ckanAPI + ""));
        if(resource.getResourceType() != null)
            item.setType(resource.getResourceType().toString());*/
        return item;
    }

    public static List<Metadata> mapResourceToMetadata(Dataset dataset, Resource resource) {
        Metadata metadata = new Metadata();
        metadata.setKey("dc.title");
        metadata.setValue(resource.getName());

        Metadata metadata1 = new Metadata();
        metadata1.setKey("dc.date.issued");
        metadata1.setValue(resource.getCreated());

        Metadata metadata2 = new Metadata();
        metadata2.setKey("dc.creator");
        metadata2.setValue(dataset.getAuthor());

        Metadata metadata3 = new Metadata();
        metadata3.setKey("dc.format");
        metadata3.setValue(resource.getFormat());

        List<Metadata> metadatal = new ArrayList<>();
        metadatal.add(metadata);
        metadatal.add(metadata1);
        metadatal.add(metadata2);
        metadatal.add(metadata3);
        return metadatal;
    }
}
