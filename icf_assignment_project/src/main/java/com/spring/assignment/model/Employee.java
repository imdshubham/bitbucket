package com.spring.assignment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "employeeId_seq", sequenceName = "employeeIdsequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeId_seq")
	@NotEmpty(message = "employee id should not be kept empty")
	private int id;

	@Column(name = "First_Name")
	@NotEmpty(message = "first name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String firstName;

	@Column(name = "Last_Name")
	@NotEmpty(message = "last name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String lastName;
	
	@Column(name = "Employment_ID")
	@NotEmpty(message = "employment id should not be kept empty")
	private int employmentID;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "Designation")
	@NotEmpty(message = "designation should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String designation;
	
	@Column(name = "Department")
	@NotEmpty(message = "department name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String department;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "Reporting_Manager")
	@NotEmpty(message = "reporting manager should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String reportingManager;
	
	@Column(name = "Gender")
	@NotEmpty(message = "gender should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String gender;
	
	@Column(name = "Blood_Group")
	@NotEmpty(message = "blood group should not be kept empty")
	private String bloodGroup;
	
	@Column(name = "Address")
	@NotEmpty(message = "address should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String address;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "Edu_ID", nullable = false)
    private Education education;
	
	public Employee()
	{
		
	}


	public Employee(@NotEmpty(message = "employee id should not be kept empty") int id,
			@NotEmpty(message = "first name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String firstName,
			@NotEmpty(message = "last name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String lastName,
			@NotEmpty(message = "employment id should not be kept empty") int employmentID, String startDate,
			@NotEmpty(message = "designation should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String designation,
			@NotEmpty(message = "department name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String department,
			String endDate, String status, String dob,
			@NotEmpty(message = "reporting manager should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String reportingManager,
			@NotEmpty(message = "gender should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String gender,
			@NotEmpty(message = "blood group should not be kept empty") String bloodGroup,
			@NotEmpty(message = "address should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String address,
			Education education) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employmentID = employmentID;
		this.startDate = startDate;
		this.designation = designation;
		this.department = department;
		this.endDate = endDate;
		this.status = status;
		this.dob = dob;
		this.reportingManager = reportingManager;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.education = education;
	}


	public int getID() {
		return id;
	}

	public void setID(int iD) {
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

	public int getEmploymentID() {
		return employmentID;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setEmploymentID(int employmentID) {
		this.employmentID = employmentID;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Education getEducation() {
		return education;
	}


	public void setEducation(Education education) {
		this.education = education;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", employmentID="
				+ employmentID + ", startDate=" + startDate + ", designation=" + designation + ", department="
				+ department + ", endDate=" + endDate + ", status=" + status + ", dob=" + dob + ", reportingManager="
				+ reportingManager + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address
				+ ", education=" + education + "]";
	}

	
	
	
	
}

