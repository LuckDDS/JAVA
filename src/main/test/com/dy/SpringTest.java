package com.dy;

import com.dy.dao.AyUserDao;
import com.dy.dao.DyUserDao;
import com.dy.model.AyUser;
import com.dy.model.DyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *spring会自动扫描到@service注解的类,并把这些类纳入进Spring容器中管理.@Service表明该类是服务层类
 * @author dongdeshuai
 */
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //ApplicationContext容器是spring中较高级的容器,他可以加载配置文件中定义的Bean,
        // 并将所有的Bean集中在一起,当有请求时分配Bean
        //获取应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取springTest类
        SpringTest springTest = (SpringTest)applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();
    }
    public void sayHello(){
        System.out.println("hello dy:spring框架集成成功");
    }

}
