package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.Map;

public class CheckSum {

    private String value;
    private String checkSumAlgorithm;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCheckSumAlgorithm() {
        return checkSumAlgorithm;
    }

    public void setCheckSumAlgorithm(String checkSumAlgorithm) {
        this.checkSumAlgorithm = checkSumAlgorithm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}