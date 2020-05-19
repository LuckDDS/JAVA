package com.dy.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author DongDeShuai
 * @Date:2020/5/13 3:45 下午
 */
@Repository
public interface DyShopDao {

    /**
     * 创建店铺
     * @param shopName
     * @param userId
     */
    @Insert("insert into dy_shop (user_id,shop_name) values (#{userId},#{shopName})")
    public void createShop(@Param("userId") String userId,@Param("shopName") String shopName);
}
