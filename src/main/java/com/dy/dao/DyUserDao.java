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
}
