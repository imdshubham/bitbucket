package com.spring.assignment.service;

import org.springframework.http.ResponseEntity;

import com.spring.assignment.model.Employee;

public interface EmployeeService {
    public ResponseEntity<?> addEmployee(Employee employee);

	
	  public Iterable<Employee> viewAllEmployee();
	  
	  public Employee viewEmployee(int id);
	  
	 
}
