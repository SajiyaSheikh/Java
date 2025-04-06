package com.user.entity;

public class Contact {

    private int contactId;
    private String email;
    private String contactName;
    private int userId;

    public Contact(int contactId, String email, String contactName, int userId) {
        this.contactId = contactId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
