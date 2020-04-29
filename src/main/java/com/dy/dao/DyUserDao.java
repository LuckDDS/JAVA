package com.dy.dao;

import com.dy.model.DyUser;
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
}
