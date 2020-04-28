package com.dy.model;

import java.io.Serializable;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:44 下午
 */
public class DyUser implements Serializable {
    private Integer id;
    private String name;
    private String password;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
