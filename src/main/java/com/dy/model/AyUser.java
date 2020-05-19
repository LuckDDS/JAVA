package com.dy.model;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 2:27 下午
 */
public class AyUser {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private Integer addressId;
    /**
     * 用户和地址一一对应,即一个用户只有一个老家地址
     */
    private AyUserAddress ayUserAddress;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAyUserAddress(AyUserAddress ayUserAddress) {
        this.ayUserAddress = ayUserAddress;
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

    public Integer getAge() {
        return age;
    }

    public AyUserAddress getAyUserAddress() {
        return ayUserAddress;
    }
}
