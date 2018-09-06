package com.eventsero.eventing.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Organiser {

    private Integer id;
    private String name;
    private String type;
    private String description;
    private Integer contactPerson;
    private String contactNumber;
    private String contactEmail;
    private String contactAddress;
    private Date cratedAt;
    private Boolean isActive;

    public Organiser() {
    }

    public Organiser(Integer id, String name, String type, String description, Integer contactPerson, String contactNumber, String contactEmail, String contactAddress, Date cratedAt, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
        this.contactAddress = contactAddress;
        this.cratedAt = cratedAt;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Integer contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Date getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(Date cratedAt) {
        this.cratedAt = cratedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
