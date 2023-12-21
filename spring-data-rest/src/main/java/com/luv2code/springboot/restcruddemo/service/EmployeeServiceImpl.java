/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.restcruddemo.service;

import com.luv2code.springboot.restcruddemo.entity.Employee;
import com.luv2code.springboot.restcruddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @Override
    //@Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    //@Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
