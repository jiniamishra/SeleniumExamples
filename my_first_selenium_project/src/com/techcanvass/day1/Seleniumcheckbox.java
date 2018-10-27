package com.techcanvass.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcheckbox {

	public static void main(String[] args) {
		// use of list
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> myval = driver.findElements(By.name("exp"));
		
		for (Iterator iterator = myval.iterator(); iterator.hasNext();) {
			WebElement ex = (WebElement) iterator.next();
			if(ex.getAttribute("value").equals("2"))
			{
				ex.click();
			}
		}
       driver.close();
	}

}
