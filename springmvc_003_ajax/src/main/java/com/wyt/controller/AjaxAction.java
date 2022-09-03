package com.wyt.controller;

import com.wyt.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxAction {

    @RequestMapping("/ajax")
    @ResponseBody // 确实是ajax的请求
    public List<Student> ajax(){
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("陈平安",34);
        Student student2 = new Student("宁姚",32);
        Student student3 = new Student("李宝瓶",24);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }
}
