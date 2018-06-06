
package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Community {

    private String uuid;
    private String name;
    private String handle;
    private String type;
    private List<String> expand = null;
    private Object logo;
    private Object parentCommunity;
    private String copyrightText;
    private String introductoryText;
    private String shortDescription;
    private String sidebarText;
    private Integer countItems;
    private List<Collection> collections = null;
    private String link;
    private List<Object> subcommunities = null;
    private Map<String, Object> additionalProperties;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Object getParentCommunity() {
        return parentCommunity;
    }

    public void setParentCommunity(Object parentCommunity) {
        this.parentCommunity = parentCommunity;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public String getIntroductoryText() {
        return introductoryText;
    }

    public void setIntroductoryText(String introductoryText) {
        this.introductoryText = introductoryText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSidebarText() {
        return sidebarText;
    }

    public void setSidebarText(String sidebarText) {
        this.sidebarText = sidebarText;
    }

    public Integer getCountItems() {
        return countItems;
    }

    public void setCountItems(Integer countItems) {
        this.countItems = countItems;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Object> getSubcommunities() {
        return subcommunities;
    }

    public void setSubcommunities(List<Object> subcommunities) {
        this.subcommunities = subcommunities;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
