package com.wyt;

import com.wyt.pojo.User;
import com.wyt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class UserTest {
    @Autowired
    UserService userService;
    private static final int PAGE_SIZE = 5;

    @Test
    public void testSelectUserPage() {
        List<User> list = userService.selectUserPage(null, null, 1, PAGE_SIZE);
        list.forEach(user -> System.out.println(user));
    }
    @Test
    public void testGetRowCount() {
        int num = userService.getRowCount(null, "女");
        System.out.println(num);
    }
    @Test
    public void testDeleteUserById() {
        int i = userService.deleteUserById("createUser");
        System.out.println(i);

    }
    @Test
    public void testCreateUser() {
        User u = new User("15968162087363060","身份证", "111222333","张三","男",30,"程序员");
        int num = userService.createUser(u);
        System.out.println(num);

    }
    @Test
    public void testUpdateUserById() {
        User u = new User("15968162087363060","身份证", "111222333","张三","女",25,"程序员");

        int num = userService.updateUserById(u);
        System.out.println(num);
    }
}
