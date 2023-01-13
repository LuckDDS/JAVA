package com.dy.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:44 下午
 */
@Data
public class DyUser implements Serializable {
    private String id;
    private String realname;
    private String password;
    private String nickname;
    private String phone;
    private String gender;
    private String address;

//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setRealname(String name) {
//        this.realname = name;
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getRealname() {
//        return realname;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
}
