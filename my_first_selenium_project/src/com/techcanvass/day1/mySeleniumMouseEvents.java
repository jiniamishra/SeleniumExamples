package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mySeleniumMouseEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Courses"));
		Thread.sleep(2000);
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		WebElement au = driver.findElement(By.linkText("Automation Testing Courses"));
		
		action.moveToElement(au).build().perform();
		Thread.sleep(2000);
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
