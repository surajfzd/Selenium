package com.capgemini.employeeTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class EmployeeTest {
	
}

































/*
import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.base.TestBase;
import com.capgemini.pages.Employee;
import com.capgemini.pages.NextStep;


public class EmployeeTest extends TestBase {

	
	static Employee employee;
	static NextStep nextStep;
	
	public EmployeeTest(){
		super();
	}
	
	@BeforeClass
	public static void setUp(){
		initialization();
		nextStep = new NextStep(); 
	}

	@Test
	public void titlevalidation(){
		employee = new Employee(); 
		String title = employee.getTitle();
		assertEquals("employee first step", title);
	} 
	@Test
	public void nextStepPageOpenedSuceessfully() throws InterruptedException{
		employee = new Employee(); 
		nextStep = employee.login("1001", "vikash", "maharshtra", "pune");
		Thread.sleep(5000);
		assertEquals("next step", nextStep.getTitle());
		
	} 

	@AfterClass
	public static void tearup()
	{
		driver.quit();
	}
	*/
