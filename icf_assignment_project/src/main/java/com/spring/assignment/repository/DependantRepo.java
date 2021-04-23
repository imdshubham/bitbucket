package com.spring.assignment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.assignment.model.Dependant;

@Repository
public interface DependantRepo extends JpaRepository<Dependant, String> {

	Optional<Dependant> findById(int id);


}
