package com.techcanvass.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNGContactUs {
	
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		
		  System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");	
		  driver =  new ChromeDriver();
		  driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	  }
	  @Test
	  public void fillform() {
		 	 
		  MyContactUsPage cPage = new MyContactUsPage();
		  cPage.SetName(driver, "Jinia");
		  cPage.setPhNo(driver, "900000001");
		  cPage.buttonClick(driver);
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
