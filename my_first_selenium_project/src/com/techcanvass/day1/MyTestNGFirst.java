package com.techcanvass.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MyTestNGFirst {
	WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");	
	  driver =  new ChromeDriver();
	  driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
  }

  @Test
  public void fillform() {
	 	 
	    driver.findElement(By.id("txtName")).sendKeys("Jinia Mishra");
		driver.findElement(By.id("txtEmail")).sendKeys("tak2prats@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9967338891");
		driver.findElement(By.id("txtMessage")).sendKeys("I have registered for selenium");
		driver.findElement(By.name("btnSubmit")).click();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
