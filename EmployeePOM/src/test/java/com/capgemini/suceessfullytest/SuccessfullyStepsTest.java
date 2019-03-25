package com.capgemini.suceessfullytest;

import static org.junit.Assert.assertTrue;

import com.capgemini.base.TestBase;
import com.capgemini.pages.Employee;
import com.capgemini.pages.NextStep;
import com.capgemini.pages.Success;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuccessfullyStepsTest extends TestBase{
	
	static Employee employee;
	static NextStep nextStep;
	static Success success;
	
	public SuccessfullyStepsTest(){
		super();
		setUp();
	}
	
	public static void setUp(){
		initialization();
		nextStep = new NextStep(); 
		success = new Success();
	}

	@Given("^The Successfully page is opening$")
	public void userNameAndSalary() throws Throwable {
		
	}

	@When("^The successfully page is open$")
	public void NameAndPercentage() throws Throwable {
		
	}

	@Then("^then image will be displayed$")
	public void certifiedIncreaseSalary() throws Throwable {
		employee = new Employee(); 
		nextStep = employee.login("1001", "vikash", "maharshtra", "pune");
		Thread.sleep(5000);
		success = nextStep.nextStepSuccess("POM Example", "java");
		Thread.sleep(5000);
		assertTrue(success.validateImage());
	}


}
