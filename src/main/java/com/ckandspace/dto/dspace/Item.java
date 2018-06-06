
package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {

    private String uuid;
    private String name;
    private String handle;
    private String type;
    private List<String> expand = null;
    private String lastModified;
    private Object parentCollection;
    private Object parentCollectionList;
    private Object parentCommunityList;
    private Bitstream bitstreams;
    private String archived;
    private String withdrawn;
    private String link;
    private List<Metadata> metadata;
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

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Object getParentCollection() {
        return parentCollection;
    }

    public void setParentCollection(Object parentCollection) {
        this.parentCollection = parentCollection;
    }

    public Object getParentCollectionList() {
        return parentCollectionList;
    }

    public void setParentCollectionList(Object parentCollectionList) {
        this.parentCollectionList = parentCollectionList;
    }

    public Object getParentCommunityList() {
        return parentCommunityList;
    }

    public void setParentCommunityList(Object parentCommunityList) {
        this.parentCommunityList = parentCommunityList;
    }

    public Bitstream getBitstreams() {
        return bitstreams;
    }

    public void setBitstreams(Bitstream bitstreams) {
        this.bitstreams = bitstreams;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(String withdrawn) {
        this.withdrawn = withdrawn;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
