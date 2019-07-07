package com.example.demo.service;

import com.example.demo.model.BobyTeacher;
import com.example.demo.model.Login_guest;

import java.util.List;

public interface UserServiceInterface {
    //育婴师增加
    void add(Login_guest bobyteacher);
    //编辑
    void edit(Login_guest bobyteacher);
    //删除
    void delete(String id);
    //查询单个
    Login_guest findone(String id);
    //查询所有
    List<Login_guest> findall();

}
