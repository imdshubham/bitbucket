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
import com.spring.assignment.model.Dependant;
import com.spring.assignment.model.Employee;
import com.spring.assignment.repository.DependantRepo;
import com.spring.assignment.repository.EmployeeRepo;

@Service
public class DependantServiceImpl implements DependantService {
	@Autowired
	DependantRepo repo;
	
	@Override
    public ResponseEntity<?> addDependant(Dependant dependant) {
        Optional<Dependant> findById = repo.findById(dependant.getId());
        try {
            if (!findById.isPresent()) {
            	repo.save(dependant);
                return new ResponseEntity<Dependant>(dependant,HttpStatus.OK);
            } 
            else
                throw new RecordAlreadyPresentException(
                        "Dependant with " + dependant.getId() + " already present");
             }
            catch(RecordAlreadyPresentException e)
            {
                return new ResponseEntity<Dependant>(dependant,HttpStatus.NOT_FOUND);
            }
        }


	
	@Override
	public List<Dependant> viewAllDependant() {
	    List<Dependant> dependant = new ArrayList<Dependant>();
	    repo.findAll().forEach(dependant1 -> dependant.add(dependant1));
	    return dependant;
	}
		 
		
		
	@Override
	public Dependant viewDependant(int id) {
		Optional<Dependant> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
			
		else
			throw new RecordNotFoundException("Dependant with  " + id + "not exists");
	    }
		

}

