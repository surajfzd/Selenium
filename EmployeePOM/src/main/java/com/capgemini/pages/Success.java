package com.capgemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class Success extends TestBase{
	
	@FindBy(xpath = "//*[@id=\"iamge1\"]")
	WebElement im;
	
	//Initializing the Page Objects:
	public Success(){
			PageFactory.initElements(driver, this);
	}
	
	public boolean validateImage()
	{
		return im.isDisplayed();
	}
	
}
