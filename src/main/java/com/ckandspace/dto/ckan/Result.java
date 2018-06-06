
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private Integer count;
    private String sort;
    private Facets facets;
    private List<Dataset> results = null;
    private SearchFacets searchFacets;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public List<Dataset> getResults() {
        return results;
    }

    public void setResults(List<Dataset> results) {
        this.results = results;
    }

    public SearchFacets getSearchFacets() {
        return searchFacets;
    }

    public void setSearchFacets(SearchFacets searchFacets) {
        this.searchFacets = searchFacets;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", sort='" + sort + '\'' +
                ", facets=" + facets +
                ", results=" + results +
                ", searchFacets=" + searchFacets +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
