package com.dy.service;

import com.dy.model.DyUser;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:49 下午
 */
public interface DyUserService  {
     /**
      * 查询用户列表
      * @return 返回用户列表
      * */
     List<DyUser> findAll();

     /**
      * 添加用户信息
      * @param user
      * */
     void addUser(DyUser user);
     /**
      * 删除用户
      * @param id
      * */
     void deleteUser(String id);
     /**
      * 根据id查找用户
      * @param id
      * @return
      * */
     DyUser findUser(Integer id);
     /**
      * 更新用户信息
      * @param id
      * @param name
      * @param password
      * */
     void updateUser(Integer id,String name,String password);
}
