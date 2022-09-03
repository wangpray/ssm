package com.wyt;

import com.wyt.pojo.Users;
import com.wyt.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UsersTest {

    @Test
    public void testGetAll(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UsersService serviceImpl = (UsersService) ioc.getBean("usersServiceImpl");
        List<Users> list = serviceImpl.getAll();
        list.forEach(users -> System.out.println(users));
    }
    @Test
    public void testInsert(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UsersService one = (UsersService) ioc.getBean("usersServiceImpl");

        int num = one.insert(new Users(1,"zhangsna","1234"));
    }
}
