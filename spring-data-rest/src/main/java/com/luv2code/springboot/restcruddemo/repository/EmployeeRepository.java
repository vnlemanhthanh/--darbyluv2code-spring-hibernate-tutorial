/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.restcruddemo.repository;

import com.luv2code.springboot.restcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
