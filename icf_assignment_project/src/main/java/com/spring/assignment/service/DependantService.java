package com.spring.assignment.service;

import org.springframework.http.ResponseEntity;

import com.spring.assignment.model.Dependant;
import com.spring.assignment.model.Employee;

public interface DependantService {
    public ResponseEntity<?> addDependant(Dependant dependant);

	
	  public Iterable<Dependant> viewAllDependant();
	  
	  public Dependant viewDependant(int id);
	  
	 
}