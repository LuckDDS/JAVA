package com.dy;

import com.dy.dao.DyUserDao;
import com.dy.model.DyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/5/19 4:15 下午
 */
public class AyUserDaoTest extends BaseJunit4Test{
    @Resource
    private DyUserDao dyUserDao;
    @Test
    public void testPageHelper(){
        //分页请求的使用方法
        PageHelper.startPage(0,3);
        List<DyUser> userList = dyUserDao.findAll();
        PageInfo pageInfo = new PageInfo<>(userList);
        System.out.println(pageInfo);
    }
}
