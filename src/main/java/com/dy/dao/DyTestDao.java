package com.dy.dao;

import com.dy.model.DyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/5/11 2:58 下午
 * 动态sql
 */
public interface DyTestDao {
    /**
     * 通过姓名和密码查找用户
     * @param realname
     * @param password
     * @return
     */
    List<DyUser> findByNameAndPassword(@Param("realname") String realname, @Param("password") String password);

    /**
     * 更新用户信息
     * @param nick 昵称
     * @param phoneNum 手机号
     * @param userid 用户id
     * */
    void updateUserMessage(@Param("nickname") String nick,@Param("phone") String phoneNum,
                           @Param("id") String userid);

    /**
     * 查询多个用户
     * @param userList 用户id
     * @return 返回列表
     */
    List <DyUser> findUserByIds(@Param("userIdList") List<String> userList);

}
