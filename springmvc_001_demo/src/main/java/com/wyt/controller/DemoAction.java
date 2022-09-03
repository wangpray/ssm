package com.wyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *这是一个普通的类,相当于以前的servlet，
 * */
@Controller
@RequestMapping("/demo")
public class DemoAction {

    /**防守打法发生的
     *访问的权限是public
     *方法名自定义
     *方法返回值任意
     * 方法可有参数也可以没有参数
     * 使用requestmapping的注解一个客户端的访问名称
     */
   // @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @GetMapping
    public String get(){
        System.out.println("get请求被服务器访问到了");
        return "/WEB-INF/main.jsp";
    }
   // @RequestMapping(value = "/demo",method = RequestMethod.POST)
   @PostMapping
    public String post(){
        System.out.println("post被服务器被访问到了");
        return "/WEB-INF/main.jsp";
    }
}
