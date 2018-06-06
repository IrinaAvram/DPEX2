
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class Resource {

    private Object mimetype;
    private Object cacheUrl;
    private String hash;
    private String description;
    private String name;
    private String format;
    private String url;
    private Object cacheLastUpdated;
    private String packageId;
    private String created;
    private String state;
    private Object mimetypeInner;
    private Object webstoreLastUpdated;
    private Object lastModified;
    private Integer position;
    private String revisionId;
    private Object webstoreUrl;
    private Object urlType;
    private String id;
    private Object resourceType;
    private Object size;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getMimetype() {
        return mimetype;
    }

    public void setMimetype(Object mimetype) {
        this.mimetype = mimetype;
    }

    public Object getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(Object cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(Object cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(Object mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    public Object getWebstoreLastUpdated() {
        return webstoreLastUpdated;
    }

    public void setWebstoreLastUpdated(Object webstoreLastUpdated) {
        this.webstoreLastUpdated = webstoreLastUpdated;
    }

    public Object getLastModified() {
        return lastModified;
    }

    public void setLastModified(Object lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public Object getWebstoreUrl() {
        return webstoreUrl;
    }

    public void setWebstoreUrl(Object webstoreUrl) {
        this.webstoreUrl = webstoreUrl;
    }

    public Object getUrlType() {
        return urlType;
    }

    public void setUrlType(Object urlType) {
        this.urlType = urlType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getResourceType() {
        return resourceType;
    }

    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
