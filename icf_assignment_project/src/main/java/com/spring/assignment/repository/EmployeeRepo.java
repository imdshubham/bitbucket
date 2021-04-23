package com.spring.assignment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.assignment.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	public void deleteById(int id);

	public Optional<Employee> findById(int id);

	public Employee save(Employee employee);

}
