package com.dy.model;
import lombok.Getter;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 4:34 下午
 */
public class AyStudent {
    private Integer id;
    private String name;
    private Integer age;
    private AySchool aySchool;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public AySchool getAySchool() {
        return aySchool;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAySchool(AySchool aySchool) {
        this.aySchool = aySchool;
    }
}
