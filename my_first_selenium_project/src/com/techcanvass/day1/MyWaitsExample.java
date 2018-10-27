package com.techcanvass.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWaitsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com");
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,40);
				
		WebElement ele =(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Courses")));
	
		action.moveToElement(ele).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement au = driver.findElement(By.linkText("Automation Testing Courses"));
		
		action.moveToElement(au).build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement se = driver.findElement(By.linkText("Selenium Training"));
		action.moveToElement(se).build().perform();
		se.click();
		
		if ("Selenium Training | Selenium Training in Mumbai".equals(driver.getTitle())){
			System.out.println("test pass");
		}else
		{
			System.out.println("test Fail");
		}
		
	}

}
