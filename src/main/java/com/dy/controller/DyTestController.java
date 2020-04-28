package com.dy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author DongDeShuai
 * @Date:2020/4/26 3:41 下午
 */
@Controller
@RequestMapping("/test")
public class DyTestController {
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
}
