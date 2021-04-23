package com.spring.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "Dependant")
public class Dependant {
	
	@Id
	@Column(name = "Id")
	@SequenceGenerator(name = "dependantId_seq", sequenceName = "dependantIdsequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dependantId_seq")
	@NotEmpty(message = "Dependant id should not be kept empty")
	private int id;
	
	@Column(name = "First_Name")
	@NotEmpty(message = "first name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String firstName;

	@Column(name = "Last_Name")
	@NotEmpty(message = "last name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String lastName;
	
	@Column(name = "Gender")
	@NotEmpty(message = "gender should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String gender;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "Relationship")
	@NotEmpty(message = "Relationship should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String relationship;
	
	public Dependant() 
	{
		
	}

	

	public Dependant(@NotEmpty(message = "Dependant id should not be kept empty") int id,
			@NotEmpty(message = "first name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String firstName,
			@NotEmpty(message = "last name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String lastName,
			@NotEmpty(message = "gender should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String gender,
			String dob,
			@NotEmpty(message = "Relationship should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String relationship) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.relationship = relationship;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		id = id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}



	@Override
	public String toString() {
		return "Dependant [Id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dob=" + dob + ", relationship=" + relationship + "]";
	}
	
	
}
