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
     * 用户注册
     * @param user
     * */
    void register(DyUser user);
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
     * 更新用户信息,多个参数时使用Param修饰可以在mapper中的xml直接使用
     * @param password
     * @param name
     * @param id
     * */
    void updateUser(@Param("id") Integer id, @Param("name") String name,@Param("password") String password);
    /**
     * 更新用户信息
     * */
    void updateUserMessage(DyUser user);

    /**
     * 查询同名的用户的个数
     * @param name
     * @return 返回重名的个数
     */
    int countByName(String name);
}
