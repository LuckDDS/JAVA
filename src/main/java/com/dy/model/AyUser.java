package com.dy.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 2:27 下午
 */
public class AyUser implements Serializable {
    private Integer id;
    @NotBlank(message = "姓名不能为空")
    private String name;

    @Length(min = 6,max = 12,message = "密码长度必须在6-12")
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
