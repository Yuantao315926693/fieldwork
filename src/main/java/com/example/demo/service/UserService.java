package com.example.demo.service;

import com.example.demo.jpa.UserLogin;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.BobyTeacher;
import com.example.demo.model.Login_guest;
import com.example.demo.model.person;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Resource
    private UserMapper userMapper;

    //育婴师增加
    @Override
    public void add(Login_guest bobyteacher){

    }
    @Override
    //编辑
    public void edit(Login_guest bobyteacher){

    }
    @Override
    //删除
    public void delete(String id){

    }
    @Override
    //查询单个
    public Login_guest findone(String id){
        Login_guest guest = userMapper.findone(id);
        return guest;
    }
    @Override
    //查询所有
    public List<Login_guest> findall(){
        List<Login_guest> guest_group = userMapper.findall();
        return guest_group;
    }
    /*@Resource
    private UserLogin Ul;//直接调用UserLogin的所有方法

    @Override
    public User findUserByUsernameAndPassowrd(String username, String passward){
        return  Ul.findUserByusernameAndPassward(username, passward);
    }
    @Override
    public boolean addUser(User U){
        return Ul.save(U)!=null;
    }*/
//    @Override
//    public boolean Exist_guest(String username,String passward){
//
//    }
//    @Autowired
//    public UserMapper userMapper;//创建一个对象
//    //获取单个用户的信息
//    public person selectUser(int id){
//        return userMapper.selectUser(id);
//    }
//    //获取所有用户信息
//
//    public ArrayList<person> selectAllUser(){
//        return userMapper.selectAllUser();
//    }

}
