package com.spring.assignment.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.spring.assignment.model.Education;
import com.spring.assignment.model.Employee;
import com.spring.assignment.repository.EmployeeRepo;

import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class EmployeeDetailsTestCase {
/*
 * setup method
 */
	@Autowired
	EmployeeRepo dao;
	
    @Before
    public void initInput()
    {
        
    }
    
	
     @Test()
      public final void testEquals(Education education) throws NullPointerException {
         Employee f1=new Employee();
          assertNotNull(f1);
          Employee f2=null;
          Employee f3= new Employee(12, "Shubham", "Dodke", 1545,  "05/12/2020", "Headmster" ,  "Computer",  "05/12/2020", "Active" ,  "30/09/1998",  "Vedika" , "Male",  "A",  "Parveti", education);
          Employee f4= new Employee(12, "Shubham", "Dodke", 1545,  "05/12/2020", "Headmster" ,  "Computer",  "05/12/2020", "Active" ,  "30/09/1998",  "Vedika" , "Male",  "A",  "Parveti", education);
          assertTrue(f3.equals(f4));
          assertFalse(f3.equals(f2));
     }
    @Test()
    public void testBooking(Education education)
    {
        Employee employee=new Employee(12, "Shubham", "Dodke", 1545,  "05/12/2020", "Headmster" ,  "Computer",  "05/12/2020", "Active" ,  "30/09/1998",  "Vedika" , "Male",  "A",  "Parveti", education);
        assertEquals(12,employee.getId());
        assertEquals("Shubham",employee.getFirstName());
        assertEquals("Dodke",employee.getLastName());
        assertEquals(1545,employee.getEmploymentID());
        assertEquals("05/12/2020",employee.getStartDate());
        assertEquals("Headmster",employee.getDesignation());
        assertEquals("Computer",employee.getDepartment());
        assertEquals("05/12/2020",employee.getEndDate());
        assertEquals("Active",employee.getStatus());
        assertEquals("30/09/1998",employee.getDob());
        assertEquals("Vedika",employee.getReportingManager());
        assertEquals("Male",employee.getGender());
        
        assertEquals("A",employee.getBloodGroup());
        assertEquals("Parveti",employee.getAddress());
        assertEquals(education,employee.getEducation());
         
    }
 
    
    @Test
    @Rollback(false)
    public void testAddEmployee() {
        Education education = null ;
		Employee employee = dao.save(new Employee(12, "Shubham", "Dodke", 1545,  "05/12/2020", "Headmster" ,  "Computer",  "05/12/2020", "Active" ,  "30/09/1998",  "Vedika" , "Male",  "A",  "Parveti", education));
         
        Integer id = null;
		assertThat(employee.getId()).isGreaterThanOrEqualTo(id);
    }
}


