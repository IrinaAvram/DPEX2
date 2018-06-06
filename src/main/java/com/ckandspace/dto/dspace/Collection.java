
package com.ckandspace.dto.dspace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    private String uuid;
    private String name;
    private String handle;
    private String type;
    private List<String> expand = null;
    private Object logo;
    private Object parentCommunity;
    private List<Community> parentCommunityList = null;
    private List<Item> items = null;
    private Object license;
    private String copyrightText;
    private String introductoryText;
    private String shortDescription;
    private String sidebarText;
    private Integer numberItems;
    private String link;
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

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Object getParentCommunity() {
        return parentCommunity;
    }

    public void setParentCommunity(Object parentCommunity) {
        this.parentCommunity = parentCommunity;
    }

    public List<Community> getParentCommunityList() {
        return parentCommunityList;
    }

    public void setParentCommunityList(List<Community> parentCommunityList) {
        this.parentCommunityList = parentCommunityList;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public String getIntroductoryText() {
        return introductoryText;
    }

    public void setIntroductoryText(String introductoryText) {
        this.introductoryText = introductoryText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSidebarText() {
        return sidebarText;
    }

    public void setSidebarText(String sidebarText) {
        this.sidebarText = sidebarText;
    }

    public Integer getNumberItems() {
        return numberItems;
    }

    public void setNumberItems(Integer numberItems) {
        this.numberItems = numberItems;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
