package com.example.contact_service.entity;

public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long userid;

    public Contact(Long cId, String email, String contactName, Long userid) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userid = userid;
    }

    public Contact() {


    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userid) {
        this.userid = userid;
    }
}