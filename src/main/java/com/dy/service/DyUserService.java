package com.dy.service;

import com.dy.dao.DyUserDao;
import com.dy.model.DyUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:49 下午
 */
public interface DyUserService  {
     List<DyUser> findAll();
}
