package com.spring.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.assignment.exception.RecordAlreadyPresentException;
import com.spring.assignment.exception.RecordNotFoundException;
import com.spring.assignment.model.Employee;
import com.spring.assignment.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo repo;
	
	@Override
    public ResponseEntity<?> addEmployee(Employee employee) {
        Optional<Employee> findById = repo.findById(employee.getID());
        try {
            if (!findById.isPresent()) {
            	repo.save(employee);
                return new ResponseEntity<Employee>(employee,HttpStatus.OK);
            } 
            else
                throw new RecordAlreadyPresentException(
                        "Airport with code : " + employee.getID() + " already present");
             }
            catch(RecordAlreadyPresentException e)
            {
                return new ResponseEntity<Employee>(employee,HttpStatus.NOT_FOUND);
            }
        }


	
	@Override
	public List<Employee> viewAllEmployee() {
	    List<Employee> employee = new ArrayList<Employee>();
	    repo.findAll().forEach(employee1 -> employee.add(employee1));
	    return employee;
	}
		 
		
		
	@Override
	public Employee viewEmployee(int id) {
		Optional<Employee> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
			
		else
			throw new RecordNotFoundException("Employee with employee code: " + id + "not exists");
	    }
		
}
