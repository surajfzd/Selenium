package com.capgemini.nextStepTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;

import com.capgemini.base.TestBase;
import com.capgemini.pages.Employee;
import com.capgemini.pages.NextStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NextStepsteps extends TestBase{
	
	static Employee employee;
	static NextStep nextStep;
	
	public NextStepsteps(){
		super();
		setUp();
	}
	
	public static void setUp(){
		initialization();
		nextStep = new NextStep(); 
	}

	@Given("^The nextStep page is opening$")
	public void userNameAndSalary() throws Throwable {
		
	}

	@When("^The nextStep page is open$")
	public void NameAndPercentage() throws Throwable {
		
	}

	@Then("^then the title of nextStep must be (.*)$")
	public void certifiedIncreaseSalary(String name) throws Throwable {
		employee = new Employee(); 
		nextStep = employee.login("1001", "vikash", "maharshtra", "pune");
		Thread.sleep(5000);
		assertEquals(nextStep.getTitle(), name);
		
	}
	
	@Then("^then show alert message (.*)$")
	public void alertMassegeValidation(String mes) throws Throwable {
		employee = new Employee(); 
		nextStep = employee.login("1001", "", "maharshtra", "pune");
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		assertEquals(mes,text); 
	} 


}
