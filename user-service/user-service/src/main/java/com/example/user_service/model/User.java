package com.example.user_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

// SIMPLE MODEL FOR TESTING THE USER SERVICE LOCALLY
public class User {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private String location;
    private String phoneNumber;

    public User(Long id, String userName, String email, String password, String location, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getLocation() {
        return location;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
