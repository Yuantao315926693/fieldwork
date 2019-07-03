package com.example.demo.model;

import org.springframework.stereotype.Service;


public class Login_guest {

    private String username;
    private String passward;

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
                "username='" + username + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }
}
