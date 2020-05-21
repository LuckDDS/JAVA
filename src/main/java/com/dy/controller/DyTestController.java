package com.dy.controller;

import com.dy.model.AyStudent;
import com.dy.model.AyUser;
import com.dy.model.DyUser;
import com.dy.service.DyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @author DongDeShuai
 * @Date :2020/4/26 3:41 下午
 */
@Controller
@RequestMapping(value = "/test")
public class DyTestController {
    @Resource
    private DyUserService dyUserService;

    public void getSingletonClass(){
        /*
          因为DySingleton的构造方法已经私有化了所以无法,调用构造方法
          只能通过getSingleton()获取对象
          这个是饿汉模式,启动项目就会有singleton对象
          */
        DySingleton singleton = DySingleton.getSingleton();
        /*
          懒加载模式,用时才会创建,加线程安全的
          */
        DySingleton dySingleton = DySingleton.getDySingleton();
        /*
        * 推荐写法
        * */
        DySingleton udySingleton = DySingleton.getMSingleton();

    }
    @GetMapping("/getUser")
    public String getUser(@RequestParam(value = "realname") String name,@RequestParam(value = "password") String password){
        List<DyUser> list = dyUserService.findByNameAndPassword(name,password);
        System.out.println(list);
        return "hello";
    }
    @PostMapping("/changeUserMessage")
    public String changeUserMessage(@RequestParam String n,@RequestParam String p,@RequestParam String i){
        dyUserService.updateUserMessage(n,p,i);
        return "hello";
    }

    /**
     * 使用 RequestBody注意需要在pom中配置jackson
     * RequestBody,将请求内容放到body中,传过来是什么格式用什么接收字典,数组等
     */
    @PostMapping("/getUserMessage")
    public String getUserMessages(@RequestBody(required = false) List<String> userList){
        List<DyUser> list = dyUserService.findUserByIds(userList);
        return "hello";
    }

    @PostMapping("/getById")
    public String getById(@RequestParam(value = "userId") Integer id){
        AyUser ayUser = dyUserService.findById(id);
        return "hello";
    }
    @GetMapping("/getStudentById")
    public String getStudent(@RequestParam(value = "id") String id){
        AyStudent ayStudent = dyUserService.findStudentById(id);
        return "hello";
    }
//不建议使用这种方法校验,麻烦
//    @PostMapping("/insert")
//    @ResponseBody
//    public String inserte(@RequestParam(value = "age") Integer num, Errors error){
//        AyUser ayUser = new AyUser();
//        ayUser.setAge(num);
//        ayUserValidator.validate(ayUser,error);
//        if (error.hasErrors()){
//            //将错误放到model
//            return "error";
//        }
//        return "success";
//    }
    //推荐数据校验方法
    @PostMapping("/insert")
    @ResponseBody
    public void insert(@RequestBody @Valid AyUser ayUser, BindingResult result){

        if (result.hasErrors()){
            System.out.println(result);
        }
        System.out.println(result);

    }
    @PostMapping("/testModel")
    public String testModel(@RequestBody AyUser ayUser){

        System.out.println(ayUser);

        return "hello";

    }

}
