
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class Facets {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "\nFacets{" +
                "additionalProperties=" + additionalProperties +
                '}';
    }
}
