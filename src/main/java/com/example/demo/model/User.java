package com.example.demo.model;


import javax.annotation.Generated;
import javax.persistence.*;

@Entity//标识这个实体类，并且绘制自动创建相应的表格
@Table(name="guset")//指向数据库的表名

public class User {
    @Id//标识主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//定义为自增长类型
    @Column(name = "id",insertable=false,nullable=false,updatable=false)
    private Integer id;

    @Column(name = "username")
    private String username;
    @Column(name = "passward")
    private String passward;
    public User(String username,String  passward){
        this.username = username;
        this.passward = passward;
    }
    public User(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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




}
