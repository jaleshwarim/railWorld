package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.EmployeeRepository;

import com.example.demo.model.*;

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
	}
	
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
}
