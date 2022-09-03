package com.wyt.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MyDate {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    /*
    <form action="/myDate.action">

    */
    @RequestMapping("/myDate")
    public String myDate(
           // @DateTimeFormat(pattern = "yyyy-MM-dd") // 单个日期的注解
            Date selectDate,
           HttpServletRequest request
    ) {
        System.out.println(selectDate);
        System.out.println(sf.format(selectDate));

        request.setAttribute("primal", selectDate);
        request.setAttribute("format", sf.format(selectDate));
        return "main";
    }

    // 全局日期处理,请求域进来的日期是string,注册Date类进行自动转换
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sf, true));
    }
}
