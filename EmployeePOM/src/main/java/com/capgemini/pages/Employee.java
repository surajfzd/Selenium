package com.capgemini.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.base.TestBase;

public class Employee extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"div1\"]/form/input[1]")
	WebElement id;
	
	@FindBy(xpath = "//*[@id=\"fname\"]")
	WebElement name;
	
	@FindBy(xpath = "//*[@id=\"div1\"]/form/input[3]")
	WebElement state;
	
	@FindBy(xpath = "//*[@id=\"div1\"]/form/select")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"div1\"]/form/input[4]")
	WebElement nextStep;
	
	
	//Initializing the Page Objects:
	public Employee(){
			PageFactory.initElements(driver, this);
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public NextStep login(String empid, String EmpName, String sta, String cit)
	{
		
		id.sendKeys(empid);
		name.sendKeys(EmpName);
		state.sendKeys(sta);
		Select select = new Select(city);
		if(cit.equals("pune"))
			select.selectByVisibleText("pune");
		if(cit.equals("mumbai"))
			select.selectByVisibleText("mumbai");
		//nextStep.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", nextStep);
    	return new NextStep();
	}

}
