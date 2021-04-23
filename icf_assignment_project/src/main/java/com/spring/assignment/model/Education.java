package com.spring.assignment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Education")
public class Education {
	
	/* Type, Start Date, End Date, Institution , Address, Percentage */ 

	@Id
	@Column(name = "Edu_ID")
	@NotEmpty(message = "education id should not be kept empty")
	private int eduId;
	
	@Column(name = "Institution")
	@NotEmpty(message = "Institution name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String institution;

	@Column(name = "percentage")
	private String percentage;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name = "address")
	@NotEmpty(message = "address should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String address;
	
	@Column(name = "Department")
	@NotEmpty(message = "department name should not be kept empty")
	@Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name")
	private String department;
	
	@Column(name = "Type")
	private String type;
	
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "education")
    private Employee employee;
	
	
	public Education() {
		
	}


	public Education(@NotEmpty(message = "education id should not be kept empty") int eduId,
			@NotEmpty(message = "Institution name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String institution,
			String percentage, String startDate, String endDate,
			@NotEmpty(message = "address should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String address,
			@NotEmpty(message = "department name should not be kept empty") @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{3,20}", message = "Minimum 3 chars required and enter a valid name") String department,
			String type, Employee employee) {
		super();
		this.eduId = eduId;
		this.institution = institution;
		this.percentage = percentage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.department = department;
		this.type = type;
		this.employee = employee;
	}











	public String getInstitution() {
		return institution;
	}



	public void setInstitution(String institution) {
		this.institution = institution;
	}



	public String getPercentage() {
		return percentage;
	}



	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}



	public String getStartDate() {
		return startDate;
	}



	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getType() {
		return type;
	}



	public int getEduId() {
		return eduId;
	}


	public void setEduId(int eduId) {
		this.eduId = eduId;
	}





	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Education [eduId=" + eduId + ", institution=" + institution + ", percentage=" + percentage
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", address=" + address + ", department="
				+ department + ", type=" + type + ", employee=" + employee + "]";
	}







}
