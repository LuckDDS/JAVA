package com.dy.controller;

import com.dy.model.DyUser;
import com.dy.service.DyUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/4/28 2:54 下午
 */
@Controller
@RequestMapping(value = "/user")
public class DyUserController {
    @Resource
    private DyUserService dyUserService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<DyUser> dyUserList = dyUserService.findAll();
        for (DyUser dyUser : dyUserList){
            System.out.println("id:"+dyUser.getId());
            System.out.println("name:"+dyUser.getName());
        }
        return "hello";
    }
    @PostMapping("/addUser")
    public String addUser(@Param("name") String name,@Param("id") int id,@Param("password") String password){
        DyUser user = new DyUser();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        dyUserService.addUser(user);
        return "hello";
    }
    @PostMapping("/deleteUser")
    public String deleteUser(@Param("id") String id){
        dyUserService.deleteUser(id);
        return "hello";
    }

    @GetMapping("/findUser")
    public String findUser(@Param("id") Integer id){
        DyUser user = dyUserService.findUser(id);
        System.out.println(user.getId()+user.getName()+user.getPassword());
        return "hello";
    }
}
