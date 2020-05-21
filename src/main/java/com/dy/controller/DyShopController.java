package com.dy.controller;

import com.dy.service.DyShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DongDeShuai
 * @Date:2020/5/13 3:30 下午
 */
@RestController
@RequestMapping("/shop")
public class DyShopController {
    @Resource
    DyShopService dyShopService;

    @PostMapping("/createShop")
    public String createShop(@RequestParam String userId,@RequestParam String shopName){
        dyShopService.createShop(userId,shopName);
        return "hello";
    }
}
