package com.capgemini;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Intex\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("soap");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),'Park Avenue Luxury Fragrant Soap, 125g (Pack Of 4)')]"))
                                        .click();

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("surajpratapsinghfdz@gmail.com");
        driver.findElement(By.cssSelector("input[id='continue']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("");
        driver.findElement(By.cssSelector("input[id='signInSubmit']")).sendKeys(Keys.ENTER);

}
}
