package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bitstream {

    private Integer id;
    private String name;
    private Object handle;
    private String type;
    private String link;
    private List<String> expand = null;
    private String bundleName;
    private String description;
    private String format;
    private String mimeType;
    private Integer sizeBytes;
    private Object parentObject;
    private String retrieveLink;
    private CheckSum checkSum;
    private Integer sequenceId;
    private Object policies;
    private Map<String, Object> additionalProperties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getHandle() {
        return handle;
    }

    public void setHandle(Object handle) {
        this.handle = handle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public Object getParentObject() {
        return parentObject;
    }

    public void setParentObject(Object parentObject) {
        this.parentObject = parentObject;
    }

    public String getRetrieveLink() {
        return retrieveLink;
    }

    public void setRetrieveLink(String retrieveLink) {
        this.retrieveLink = retrieveLink;
    }

    public CheckSum getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(CheckSum checkSum) {
        this.checkSum = checkSum;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Object getPolicies() {
        return policies;
    }

    public void setPolicies(Object policies) {
        this.policies = policies;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
