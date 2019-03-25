package com.capgemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class NextStep extends TestBase{
	
	@FindBy(name = "projectName")
	WebElement pName;
	
	@FindBy(name = "java")
	WebElement java;
	
	@FindBy(name = "python")
	WebElement python;
	
	@FindBy(name = "c#")
	WebElement c;
	
	@FindBy(xpath = "//*[@id=\"div1\"]/form/input[5]")
	WebElement sub;
	
	//Initializing the Page Objects:
		public NextStep(){
				PageFactory.initElements(driver, this);
		}
		
		
		public String getTitle()
		{
			return driver.getTitle();
		}
		
		public Success nextStepSuccess(String projectName, String lan)
		{
			pName.sendKeys(projectName);
			if(lan.equals("java"))
				java.click();
			if(lan.equals("python"))
				python.click();
			if(lan.equals("c#"))
				c.click();
			sub.click();
			return new Success();
		}
}
