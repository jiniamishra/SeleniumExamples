package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyContactUsPage {
	
	By ByNameId = By.id("txtName");
	By ByPhId = By.id("txtContact");
	By ByName = By.name("btnSubmit");
	
	public void SetName (WebDriver driver, String name)
	{
		driver.findElement(ByNameId).sendKeys(name);
		
	}
	
	public void setPhNo(WebDriver driver, String phNo)
	{
		driver.findElement(ByPhId).sendKeys(phNo);
	}
	
	public void buttonClick(WebDriver driver)
	{
		driver.findElement(ByName).click();;
	}

}
