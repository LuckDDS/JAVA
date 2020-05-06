package com.dy.dao;

import com.dy.model.DyUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:47 下午
 */
@Repository
public interface DyUserDao {
    /**
     * findAll:
     * @return
     * */
    List <DyUser> findAll();
    /**
     * 添加用户
     * @param user
     * */
    void addUser(DyUser user);
    /**
     * 删除用户
     * @param id
     */
    void deleteUser(String id);
    /**
     * 查找指定用户
     * @param id
     * @return 用户信息
     * */
    DyUser findUser(Integer id);

    /**
     * 更新用户信息
     * @param password
     * @param name
     * @param id
     * */
    void updateUser(@Param("id") Integer id, @Param("name") String name,@Param("password") String password);
}
