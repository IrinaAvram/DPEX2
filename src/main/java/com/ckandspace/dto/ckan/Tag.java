
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class Tag {

    private Object vocabularyId;
    private String state;
    private String displayName;
    private String id;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(Object vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

}
