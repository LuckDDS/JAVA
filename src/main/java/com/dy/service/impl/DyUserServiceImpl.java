package com.dy.service.impl;

import com.dy.dao.DyUserDao;
import com.dy.model.DyUser;
import com.dy.service.DyUserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:51 下午
 */
//@Service
public class DyUserServiceImpl implements DyUserService {
    @Resource
    private DyUserDao dyUserDao;
    @Override
    public List<DyUser> findAll(){
        return dyUserDao.findAll();
    }

}
