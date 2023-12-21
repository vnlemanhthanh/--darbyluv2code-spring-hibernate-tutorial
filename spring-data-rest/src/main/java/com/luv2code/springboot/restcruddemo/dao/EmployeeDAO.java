/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.restcruddemo.dao;

import com.luv2code.springboot.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
