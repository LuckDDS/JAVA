package com.dy.dao;

import com.dy.model.AyUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 2:31 下午
 */
@Repository
public interface AyUserDao {
    /**
     * 查询用户
     * @param id
     * @return
     * */
    AyUser findById(@Param(value = "userId") Integer id);
}
