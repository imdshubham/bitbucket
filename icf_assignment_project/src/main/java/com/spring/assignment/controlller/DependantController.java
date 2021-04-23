package com.spring.assignment.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.model.Dependant;
import com.spring.assignment.model.Employee;
import com.spring.assignment.service.DependantService;
import com.spring.assignment.service.EmployeeService;

@RestController
@RequestMapping("/auth")
public class DependantController {
    @Autowired(required = true)
    DependantService service;

    @GetMapping("/viewDependant/{id}")
    //@ExceptionHandler(RecordNotFoundException.class)
    public Dependant viewDependant(@PathVariable("id")int Id ){
        return service.viewDependant(Id);
    }
    
    @GetMapping("/allDependant")
    public Iterable<Dependant> viewAllDependant() {
        return service.viewAllDependant();
    }

    @PostMapping("/addDependant")
    //@ExceptionHandler(RecordAlreadyPresentException.class)
    public ResponseEntity<Dependant> addDependant(@RequestBody Dependant dependant) {
        
        return (ResponseEntity<Dependant>) service.addDependant(dependant);
    }
}


