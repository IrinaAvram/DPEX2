
package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

    private String key;
    private String value;
    private String language;
    private String schema;
    private Object qualifier;
    private String element;
    private Map<String, Object> additionalProperties;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Object getQualifier() {
        return qualifier;
    }

    public void setQualifier(Object qualifier) {
        this.qualifier = qualifier;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
