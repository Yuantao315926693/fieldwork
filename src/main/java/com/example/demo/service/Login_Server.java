package com.example.demo.service;

import com.example.demo.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Login_Server {
//写好接口
      @Autowired
      public LoginMapper loginMapper;//创建一个对象


      //获取单个用户的信息
      public boolean ExistUser(String username,String passward){
          return loginMapper.Existguest(username, passward)!=null;
      }

      public boolean Exist_Username(String name,String username){
          return loginMapper.Exist_username(name,username) == null;
      }
      public int RegisterUser(String name,String username,String passward){
//          loginMapper.Insertguest(username, passward);
          return loginMapper.Insertguest(name,username, passward);
      }
//    //获取所有用户信息
//
//    public ArrayList<person> selectAllUser(){
//        return userMapper.selectAllUser();
//    }
}
