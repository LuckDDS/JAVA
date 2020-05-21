package com.dy.dao;

import com.dy.model.AyUserAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 2:32 下午
 */
@Repository
public interface AyUserAddressDao {
    /**
     * 查找
     * @param id
     * @return
     */
    AyUserAddress findById(@Param(value = "id") Integer id);
}
