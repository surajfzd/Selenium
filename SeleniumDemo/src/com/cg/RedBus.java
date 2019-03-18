package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Intex\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("src")).click();
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Bangalore(All Location)");
		driver.findElement(By.id("src")).click();
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		driver.findElement(By.id("dest")).click();
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Pune(All Location)");
		driver.findElement(By.id("dest")).click();
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		String month = "Apr 2019";
		String date = "28";
		String getMonth = driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']"))
				.getText();

		while (true) 
		{
			if (!(getMonth.equalsIgnoreCase(month))) 
			{
				driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='" + month
				+ "']/../..//td[text()='" + date + "']")).click();

		driver.findElement(By.id("search_btn")).click();

	}
}
