/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void updateStudent(Student student);

    void delete(Integer id);

    int deleteAll();
}
