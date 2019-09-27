package com.qianfeng.controller;

import com.qianfeng.entity.Student;
import com.qianfeng.service.IStudentService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/insertStudent")
    @ResponseBody
    public String insertStudent(){
        System.out.println("进来了");
        Student student = new Student(null,"冰凌",520,520);
        studentService.insertStudent(student);
        return "添加成功";
    }
}
