package com.dy.service;

import com.dy.model.AyStudent;
import com.dy.model.AyUser;
import com.dy.model.DyUser;
import org.apache.ibatis.annotations.Param;

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
      * 用户注册
      * @param user
      * */
     void register(DyUser user);
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

     /**
      * 更新用户信息
      * @param user
      * */
     void updateUserMessage(DyUser user);

     /**
      * 查询重名用户的个数
      * @param realName
      * @return
      * */
     int countByName(String realName);
     /**
      * s
      * @param name
      * @param pw
      * @return
      */
     List<DyUser> findByNameAndPassword(String name,String pw);

     /**
      * 更新用户信息
      * @param nickName
      * @param id
      * @param phoneN
      */
     void updateUserMessage(String nickName,String phoneN,String id);
     /**
      * 查找多个用户的信息
      * @param list
      * @return
      */
     List<DyUser> findUserByIds(List<String> list);
     /**
      * 查询用户(关联查询)
      * @param id
      * @return
      */
     AyUser findById(Integer id);

     AyStudent findStudentById(String id);
}
