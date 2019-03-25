package com.capgemini.employeeTest;


import static org.testng.Assert.assertEquals;

import com.capgemini.base.TestBase;
import com.capgemini.pages.Employee;
import com.capgemini.pages.NextStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeTestSteps extends TestBase {
	
	static Employee employee;
	static NextStep nextStep;
	
	public EmployeeTestSteps(){
		super();
		setUp();
	}
	
	public static void setUp(){
		initialization();
		nextStep = new NextStep(); 
	}

	@Given("^The employee page is opening$")
	public void userNameAndSalary() throws Throwable {
		
	}

	@When("^The employee page is open$")
	public void NameAndPercentage() throws Throwable {
		
	}

	@Then("^then the title must be (.*)$")
	public void certifiedIncreaseSalary(String name) throws Throwable {
		employee = new Employee(); 
		String title = employee.getTitle();
		assertEquals(name, title);
	}

}
