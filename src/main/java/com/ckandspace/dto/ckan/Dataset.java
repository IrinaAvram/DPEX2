
package com.ckandspace.dto.ckan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dataset {

    private String licenseTitle;
    private String maintainer;
    private List<Object> relationshipsAsObject = null;
    private Boolean _private;
    private String maintainerEmail;
    private Integer numTags;
    private String id;
    private String metadataCreated;
    private String metadataModified;
    private String author;
    private String authorEmail;
    private String state;
    private String version;
    private String creatorUserId;
    private String type;
    private List<Resource> resources = null;
    private Integer numResources;
    private List<Tag> tags = null;
    private List<Group> groups = null;
    private String licenseId;
    private List<Object> relationshipsAsSubject = null;
    private Organization organization;
    private String name;
    private Boolean isopen;
    private String url;
    private String notes;
    private String ownerOrg;
    private List<Object> extras = null;
    private String licenseUrl;
    private String title;
    private String revisionId;
    private Map<String, Object> additionalProperties;

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public List<Object> getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    public void setRelationshipsAsObject(List<Object> relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    public Integer getNumTags() {
        return numTags;
    }

    public void setNumTags(Integer numTags) {
        this.numTags = numTags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMetadataCreated() {
        return metadataCreated;
    }

    public void setMetadataCreated(String metadataCreated) {
        this.metadataCreated = metadataCreated;
    }

    public String getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Integer getNumResources() {
        return numResources;
    }

    public void setNumResources(Integer numResources) {
        this.numResources = numResources;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public List<Object> getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    public void setRelationshipsAsSubject(List<Object> relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    public List<Object> getExtras() {
        return extras;
    }

    public void setExtras(List<Object> extras) {
        this.extras = extras;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "\nDataset{" +
                "licenseTitle='" + licenseTitle + '\'' +
                ", maintainer='" + maintainer + '\'' +
                ", relationshipsAsObject=" + relationshipsAsObject +
                ", _private=" + _private +
                ", maintainerEmail='" + maintainerEmail + '\'' +
                ", numTags=" + numTags +
                ", id='" + id + '\'' +
                ", metadataCreated='" + metadataCreated + '\'' +
                ", metadataModified='" + metadataModified + '\'' +
                ", author='" + author + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", state='" + state + '\'' +
                ", version='" + version + '\'' +
                ", creatorUserId='" + creatorUserId + '\'' +
                ", type='" + type + '\'' +
                ", resources=" + resources +
                ", numResources=" + numResources +
                ", tags=" + tags +
                ", groups=" + groups +
                ", licenseId='" + licenseId + '\'' +
                ", relationshipsAsSubject=" + relationshipsAsSubject +
                ", organization=" + organization +
                ", name='" + name + '\'' +
                ", isopen=" + isopen +
                ", url='" + url + '\'' +
                ", notes='" + notes + '\'' +
                ", ownerOrg='" + ownerOrg + '\'' +
                ", extras=" + extras +
                ", licenseUrl='" + licenseUrl + '\'' +
                ", title='" + title + '\'' +
                ", revisionId='" + revisionId + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
