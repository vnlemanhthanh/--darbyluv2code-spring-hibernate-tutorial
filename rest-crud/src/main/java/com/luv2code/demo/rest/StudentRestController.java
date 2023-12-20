/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Thanh", "LE"));
        students.add(new Student("Anh", "LE"));
        students.add(new Student("Khai", "LE"));
        return students;
    }
}
