package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// handle alert boxes
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/Login.aspx");
        driver.findElement(By.id("txtLoginid")).sendKeys("jinia");
        driver.findElement(By.id("txtpassword")).sendKeys("jinia123");
        WebElement w =  driver.findElement(By.id("btnLogin"));
        w.click();
        Thread.sleep(3000);
        
        //to accept the pop up in the page and get back to login id
        driver.switchTo().alert().accept();
        driver.findElement(By.id("txtLoginid")).clear();
        driver.findElement(By.id("txtpassword")).clear();
	}

}
