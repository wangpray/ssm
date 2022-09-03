package com.wyt.controller;

import com.wyt.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class DataAction {
    @RequestMapping("/data")
    public String data(HttpServletRequest request,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap
                       ){
        Student stu = new Student("宁姚",30);
        request.setAttribute("requestStu",stu);
       // session.setAttribute("sessionStu", stu);
        model.addAttribute("modelStu",stu);
        map.put("mapStu", stu);
        modelMap.addAttribute("modelMapStu", stu);
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("陈平安",34);
        Student student2 = new Student("宁姚",32);
        Student student3 = new Student("李宝瓶",24);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        request.setAttribute("list", list);
        return "main";
    }
}
