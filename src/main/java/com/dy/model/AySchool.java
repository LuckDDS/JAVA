package com.dy.model;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 4:35 下午
 */
public class AySchool {
    private Integer id;
    private String name;
    private List<AyStudent> students;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<AyStudent> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudents(List<AyStudent> students) {
        this.students = students;
    }
}
