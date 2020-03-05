package com.demo.ngboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ngboot.dao.EmployeeDao;
import com.demo.ngboot.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	public void addEmployee(Employee employee) {
		employeeDao.save(employee);
	}

	public void deleteEmployee(int empId) {
		employeeDao.deleteById(empId);
	}

	public Optional<Employee> findEmployeeById(int empId) {
		return employeeDao.findById(empId);
	}

}
