package com.example.demo.mapper;

import com.example.demo.model.Login_guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Mapper

public interface LoginMapper {
    @Select("Select * From guest WHERE username = #{arg0} and password=#{arg1}")
    Login_guest Existguest(String username,String passward);

    @Select("Select * From guest WHERE name = #{arg1}")
    Login_guest Vertify_guestname(String Value);

    @Select("Select * From guest WHERE username = #{arg1}")
    Login_guest Vertify_guestusername(String Value);

    @Select("Select * From guest WHERE name = #{arg0} and username = #{arg1}")
    Login_guest Exist_username(String name,String username);

    @Insert("Insert guest(name,username,passward) Values(#{arg0},#{arg1},#{arg2})")
    int Insertguest(String name,String username,String passward);//返回受到影响的行数
}
