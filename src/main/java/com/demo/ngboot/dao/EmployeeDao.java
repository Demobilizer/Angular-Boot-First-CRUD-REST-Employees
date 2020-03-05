package com.demo.ngboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ngboot.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
