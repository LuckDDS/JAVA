package com.dy.controller;

import com.dy.model.DyUser;
import com.dy.service.DyUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/sayHello")
    public String sayHello(){
        //返回的字符串就是jsp的名称,hello.jsp因为前缀路径和后缀已经在spring-mvc.xml中配置好了
        return "hello";
    }

    @GetMapping("/home")
    public String home(@RequestParam(value = "name") String name) {
        return "home";
    }

    @PostMapping()
    public String home(){
        return "home";
    }

    @GetMapping("/findAll")
    public String findAll(){
        List<DyUser> dyUserList = dyUserService.findAll();
        for (DyUser dyUser : dyUserList){
            System.out.println("id:"+dyUser.getId());
            System.out.println("name:"+dyUser.getRealname());
            System.out.println("address:"+dyUser.getAddress());
        }
        return "hello";
    }

    @PostMapping("/register")
    public String register(@RequestParam String password,@RequestParam String phone){
        DyUser user = new DyUser();
        user.setPassword(password);
        user.setPhone(phone);
        dyUserService.register(user);
        return "hello";
    }

    @PostMapping("/changePassword")
    public String changePassword(@RequestParam(value = "password",required = false) String password,@RequestParam( value = "phone") String phone){
        DyUser user = new DyUser();
        user.setPassword(password);
        user.setPhone(phone);
        return "hello";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam(value = "id") String id){
        dyUserService.deleteUser(id);
        return "hello";
    }

    @GetMapping("/findUser")
    public String findUser(@RequestParam(value = "id") Integer id){
        DyUser user = dyUserService.findUser(id);
        System.out.println(user.getId()+user.getRealname()+user.getPassword());
        return "hello";
    }

    /**
     * 测试用的接口
     * */
    @GetMapping("/updateUser")
    public String updateUser(@RequestParam(value = "id") Integer id,@RequestParam(value = "name") String name
            ,@RequestParam(value = "password") String password){
        dyUserService.updateUser(id,name,password);
        return "hello";
    }

    @PostMapping("/updateUserMessage")
    public String updateUserMessage(@RequestParam(value = "realname") String realname,@RequestParam(value = "nickname") String nickname,
                                    @RequestParam(value = "gender") String gender, @RequestParam(value = "address") String address,
                                    @RequestParam(value = "id") String id){
        DyUser user = new DyUser();
        user.setRealname(realname);
        user.setNickname(nickname);
        user.setId(id);
        user.setAddress(address);
        user.setGender(gender);
        dyUserService.updateUserMessage(user);
        return "hello";
    }

    /**
     * ("name")中的name是xml中定义时需要用到的名称 #{name}
     * realName是接口中命名的参数
     * http://localhost:8080/dong/user/countByName?realName=完整
     * */
    @GetMapping("/countByName")
    public String countByName(@RequestParam(value = "name") String realName){
        int num = dyUserService.countByName(realName);
        System.out.println("重名的有:"+num);
        return "hello";
    }

}
