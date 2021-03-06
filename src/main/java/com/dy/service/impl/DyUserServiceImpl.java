package com.dy.service.impl;

import com.dy.dao.AyStudentDao;
import com.dy.dao.AyUserDao;
import com.dy.dao.DyTestDao;
import com.dy.dao.DyUserDao;
import com.dy.model.AyStudent;
import com.dy.model.AyUser;
import com.dy.model.DyUser;
import com.dy.service.DyUserService;
import org.springframework.context.annotation.Bean;
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
    @Resource
    private DyTestDao dyTestDao;
    @Resource
    private AyUserDao ayUserDao;
    @Resource
    private AyStudentDao ayStudentDao;


    @Override
    public List<DyUser> findAll(){
        return dyUserDao.findAll();
    }

    @Override
    public void register(DyUser user) {
        dyUserDao.register(user);
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

    @Override
    public void updateUserMessage(DyUser user) {
        dyUserDao.updateUserMessage(user);
    }

    @Override
    public int countByName(String realName) {
        return dyUserDao.countByName(realName);
    }

    @Override
    public List<DyUser> findByNameAndPassword(String name, String pw) {
        return dyTestDao.findByNameAndPassword(name,pw);
    }

    @Override
    public void updateUserMessage(String nickName, String phoneN, String id) {
        dyTestDao.updateUserMessage(nickName,phoneN,id);
    }

    @Override
    public List<DyUser> findUserByIds(List<String> list) {
        return dyTestDao.findUserByIds(list);
    }

    @Override
    public AyUser findById(Integer id) {
        return ayUserDao.findById(id);
    }

    @Override
    public AyStudent findStudentById(String id) {
        return ayStudentDao.findById(id);
    }
}

