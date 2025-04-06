package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String userName;
    private String phone;

    List<Contact> contacts=new ArrayList<>();

    public User() {
    }

    public User(int userId, String userName, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.contacts = contacts;
    }

    public User(int userId, String userName, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
