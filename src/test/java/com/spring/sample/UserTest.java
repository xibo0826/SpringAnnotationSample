package com.spring.sample;

import com.spring.sample.dao.impl.UserDaoImpl;
import com.spring.sample.domain.User;
import com.spring.sample.service.IUserService;
import config.SpringConfiguar;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Spring整合Junit
 * @RunWith:
 *       用Spring的Runner替换Junit的Runner
 * @ContextConfiguration:
 *       指定Ico容器初始化时的配置文件或者配置Class
 *    classes:配置Class
 *    locations:配置文件地址 如:classpath:context/bean.xml
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguar.class)
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {

        List<User> users = userService.findAll();
        for(User user : users) {
            System.out.println(user);
        }
    }
}
