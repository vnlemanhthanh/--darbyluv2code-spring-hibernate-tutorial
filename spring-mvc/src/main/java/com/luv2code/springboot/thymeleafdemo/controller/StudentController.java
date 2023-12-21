/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {
        Student theStudent = new Student("ManhThanh", "LE");
        model.addAttribute("student", theStudent);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println(theStudent.getFirstName() + theStudent.getLastName());


        return "student-confirmation";
    }
}
