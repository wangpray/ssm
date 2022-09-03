package com.wyt.controller;

import com.wyt.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.Oneway;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DataSubmitAction {
    /*编写方法
    *       姓名：<input type="text" name="name">
            年龄：<input name="age">
    * */
    @RequestMapping("/one")
    public String one(String name, int age){
        System.out.println("用户的姓名：" + name + ",年龄：" + age);
        return "main";
    }
    // 通过url的界面访问到
    @RequestMapping("/two")
    public String two(Users u){
        System.out.println(u);
        return "main";
    }
      /*
    *       姓名：<input name="name">
            年龄：<input name="age">
    * */
    @RequestMapping("/four")
    public String four(
            @RequestParam("name")
            String uname,
            @RequestParam("age")
            int uage){
        System.out.println("用户的姓名：" + uname + ",年龄：" + uage);
        return "main";
    }

    public String five(HttpServletRequest request){
        String name = request.getParameter("name");
        return "main";
    }

}
