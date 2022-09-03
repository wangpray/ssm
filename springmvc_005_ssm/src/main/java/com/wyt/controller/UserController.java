package com.wyt.controller;

import com.wyt.pojo.User;
import com.wyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller 类中多有的action都是json对象的访问，可以使用rest注解
@RestController
@RequestMapping("/user")
@CrossOrigin // 跨域访问
public class UserController {
    @Autowired
    UserService userService;
    public static final int PAGE_SIZE = 5;

    /**
     * 根据条件分页获取分页数据
     *   url	/user/selectUserPage?userName=z&userSex=男&page=null
     */
    @RequestMapping("/selectUserPage")
    //@ResponseBody
    public List<User> selectUserPage(String userName,String userSex,Integer page){
        // 如果页数小于1 或者没有
        if (page == null) {
            page = 1;
        }
        return userService.selectUserPage(userName, userSex, page, PAGE_SIZE);
    }

    /**
     * 获取总行数
     * url	/user/getRowCount?userName=z&userSex=男
     */
    @RequestMapping("/getRowCount")
   // @ResponseBody
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName, userSex);
    }


    /**
     * 根据用户ID删除用户
     * url	/user/deleteUserById?userId= 15968162087363060
     */

    @RequestMapping("/deleteUserById")
    //@ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    /**
     * 增加用户
     * url	/user/createUser(User u)
     */
    @RequestMapping("/createUser")
    //@ResponseBody
    public int createUser(User user){
       // 手动编写id
        String userId = System.currentTimeMillis() + "";

        int num =(int) (Math.random() * 8999 + 1000);

        user.setUserId(num+userId);

        return userService.createUser(user);
    }

    /**
     * 更新用户
     * url	/user/updateUserById(参数见以下)
     */
    @RequestMapping("/updateUserById")
    //@ResponseBody
    public int updateUserById(User user){
        return userService.updateUserById(user);
    }



}
