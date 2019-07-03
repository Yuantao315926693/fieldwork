package com.example.demo.service;

import com.example.demo.model.User;
//server写好接口
public interface login_service {
    User findUserByUsernameAndPassowrd(String username, String passward);

    boolean addUser(User U);
}
//6228480299029852975