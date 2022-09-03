package com.wyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *这是一个普通的类,相当于以前的servlet，
 * */
@Controller

public class OneAction {

    /**防守打法发生的
     *访问的权限是public
     *方法名自定义
     *方法返回值任意
     * 方法可有参数也可以没有参数
     * 使用requestmapping的注解一个客户端的访问名称
     */
    @RequestMapping(value = "/one")
   // @GetMapping
    public String one(){
        System.out.println("one请求转发成功了");
        return "main";
    }

    @RequestMapping(value = "/two")
   //@PostMapping
    public String two(){
        System.out.println("two的请求转发action被访问到");
        return "forward:/other.action";
    }

    @RequestMapping(value = "/three")
    // @GetMapping
    public String three(){
        System.out.println("three重定向转发");
        return "redirect:/admin/main.jsp";
    }


    @RequestMapping(value = "/four")
    //@PostMapping
    public String four(){
        System.out.println("four的重定向转发action被访问到");
        return "redirect:/other.action";
    }
}
