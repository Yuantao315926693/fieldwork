package com.example.demo.mapper;

import com.example.demo.model.person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.example.demo.model.person;
import java.util.ArrayList;

@Repository
public interface UserMapper {
    @Select("Select * From person WHERE id = #{id}")
    person selectUser(int id);//返回一个person对象

    @Select("Select * From person order by id")
    ArrayList<person> selectAllUser();//返回一个person对象
}
