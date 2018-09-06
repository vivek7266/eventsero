package com.eventsero.eventing.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.FileInputStream;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    private Integer id;
    private String name;
    private String description;
    private Integer typeId;
    private FileInputStream image;
    private String location;
    private Double lat;
    private Double lng;
    private Date startDate;
    private Date endDate;
    private Integer organiserId;
    private String shortLink;
    private Date createdAt;
    private Boolean isActive;

    public Event() {
    }

    public Event(Integer id, String name, String description, Integer typeId, FileInputStream image, String location, Double lat, Double lng, Date startDate, Date endDate, Integer organiserId, String shortLink, Date createdAt, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.typeId = typeId;
        this.image = image;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organiserId = organiserId;
        this.shortLink = shortLink;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public FileInputStream getImage() {
        return image;
    }

    public void setImage(FileInputStream image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getOrganiserId() {
        return organiserId;
    }

    public void setOrganiserId(Integer organiserId) {
        this.organiserId = organiserId;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
