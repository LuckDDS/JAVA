package com.dy.service.impl;

import com.dy.dao.DyShopDao;
import com.dy.service.DyShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DongDeShuai
 * @Date:2020/5/13 3:40 下午
 */
@Service
public class DyShopServiceImpl implements DyShopService {
    @Resource
    DyShopDao dyShopDao;
    @Override
    public void createShop(String userId, String shopName) {
        dyShopDao.createShop(userId,shopName);
    }
}
