package com.techcanvass.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNGContactUsPageFactory {
	
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		
		  System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");	
		  driver =  new ChromeDriver();
		  driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	  }
	  @Test
	  public void fillform() {
		 	 
		  MyContactUsPageFactory cPage ;
		  cPage = PageFactory.initElements(driver,MyContactUsPageFactory.class );
		  cPage.SetName("Jinia");
		  cPage.setPhNo("900000001");
		  cPage.buttonClick();
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
