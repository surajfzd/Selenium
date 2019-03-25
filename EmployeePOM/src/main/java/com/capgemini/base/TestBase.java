package com.capgemini.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public static void initialization(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Intex\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("C:\\sun_3rdModule\\EmployeePOM\\WebContent\\employee.html");		
	}
}