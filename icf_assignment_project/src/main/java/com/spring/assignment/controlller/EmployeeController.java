package com.spring.assignment.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.model.Employee;
import com.spring.assignment.service.EmployeeService;

@RestController
@RequestMapping("/rest")
public class EmployeeController {
    @Autowired(required = true)
    EmployeeService service;

    @GetMapping("/viewEmployee/{id}")
    //@ExceptionHandler(RecordNotFoundException.class)
    public Employee viewEmployee(@PathVariable("id")int id) {
        return service.viewEmployee(id);
    }
    
    @GetMapping("/allEmployee")
    public Iterable<Employee> viewAllEmployee() {
        return service.viewAllEmployee();
    }

    @PostMapping("/addEmployee")
    //@ExceptionHandler(RecordAlreadyPresentException.class)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        
        return (ResponseEntity<Employee>) service.addEmployee(employee);
    }
}

