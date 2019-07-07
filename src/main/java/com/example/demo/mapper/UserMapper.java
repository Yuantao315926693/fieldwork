package com.example.demo.mapper;

import com.example.demo.model.BobyTeacher;
import com.example.demo.model.Login_guest;
import com.example.demo.model.person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import com.example.demo.model.person;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserMapper {
      @Insert("Insert into guest(id,name,uesrname,password) Value(#{guest.id},#{guest.name},#{guest.uesrname},#{guest.password})")
      void insert(Login_guest guest);
      @Update("Update guest SET name=#{guest.name} WHERE id=#{guest.id}")
      void updateByPrimaryKey(Login_guest guest);
      @Delete("Delete From guest WHERE id = #{guest.id})")
      void deleteByPrimaryKey(Login_guest guest);
      @Select("Select * From guest Where id=#{arg0}")
      Login_guest findone(String id);
      @Select("Select * From guest")
      List<Login_guest> findall();
//    @Select("Select * From person WHERE id = #{id}")
//    person selectUser(int id);//返回一个person对象
//
//    @Select("Select * From person order by id")
//    ArrayList<person> selectAllUser();//返回一个person对象
}
