package com.spring.sample;

import com.spring.sample.dao.impl.UserDaoImpl;
import com.spring.sample.domain.User;
import com.spring.sample.service.IUserService;
import config.SpringConfiguar;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    @Test
    public void testFindAll() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguar.class);
        IUserService userService = ac.getBean("userService", IUserService.class);

        List<User> users = userService.findAll();

        for(User user : users) {
            System.out.println(user);
        }
    }
}
