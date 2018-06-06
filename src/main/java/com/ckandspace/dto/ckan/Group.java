
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class Group {

    private String displayName;
    private String description;
    private String imageDisplayUrl;
    private String title;
    private String id;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageDisplayUrl() {
        return imageDisplayUrl;
    }

    public void setImageDisplayUrl(String imageDisplayUrl) {
        this.imageDisplayUrl = imageDisplayUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "\nGroup{" +
                "displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                ", imageDisplayUrl='" + imageDisplayUrl + '\'' +
                ", title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
