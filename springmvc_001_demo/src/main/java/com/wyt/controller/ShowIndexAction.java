package com.wyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller

public class ShowIndexAction {
    @RequestMapping("/showIndex")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/showMain")
    public String showMain() {
        return "main";
    }


    @RequestMapping("/showLogin")
    public String showLogin() {
        return "login";
    }


    @RequestMapping("/login")
    public String login(String account, String password, HttpServletRequest request) {
        if ("123".equals(account) && "123".equals(password)) {
            request.getSession().setAttribute("flag", account);

            return "main";
        }
        request.setAttribute("fail", "登陆失败");
        return "login";
    }
}
