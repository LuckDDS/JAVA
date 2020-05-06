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
@Service
public class DyUserServiceImpl implements DyUserService {
    @Resource
    private DyUserDao dyUserDao;

    @Override
    public List<DyUser> findAll(){
        return dyUserDao.findAll();
    }

    @Override
    public void addUser(DyUser user) {
        dyUserDao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        dyUserDao.deleteUser(id);
    }

    @Override
    public DyUser findUser(Integer id) {
        return dyUserDao.findUser(id);
    }

    @Override
    public void updateUser(Integer id, String name, String password) {
        dyUserDao.updateUser(id, name, password);
    }
}

