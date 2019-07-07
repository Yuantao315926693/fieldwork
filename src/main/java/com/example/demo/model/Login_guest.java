package com.example.demo.model;

import org.springframework.stereotype.Service;


public class Login_guest {


    private String id;
    private String username;
    private String passward;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
    @Override
    public String toString() {
        return "Login_guest{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }

}
