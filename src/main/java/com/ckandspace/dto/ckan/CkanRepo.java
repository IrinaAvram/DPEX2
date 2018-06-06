
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class CkanRepo {

    private String help;
    private Boolean success;
    private Result result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "CkanRepo{" +
                "help='" + help + '\'' +
                ", success=" + success +
                ", result=" + result +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
