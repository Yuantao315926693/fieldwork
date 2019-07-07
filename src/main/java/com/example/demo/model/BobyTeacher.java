package com.example.demo.model;

public class BobyTeacher {
    private String  name;
    private Integer age;
    private String  work_time;
    private String  image;

    @Override
    public String toString() {
        return "BobyTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work_time='" + work_time + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
