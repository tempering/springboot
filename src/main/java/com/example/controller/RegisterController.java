package com.example.controller;

import com.example.Mapper.UserMapper;
import com.example.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/addUser")
    public String register(HttpServletRequest request){
        String stuSno= request.getParameter("stuSno");
        String stuSname= request.getParameter("stuSname");
        String stuPassword= request.getParameter("stuPassword1");
        String stuPassword2=request.getParameter("stuPassword2");
        Student student =new Student();
        student.setStuSno(stuSno);
        student.setStuSname(stuSname);
        student.setStuPassword(stuPassword);
        userMapper.save(student);
        return "stu_log_in";
    }
}

