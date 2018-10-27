package com.techcanvass.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenuim_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.techcanvass.com"); //here we have automated the opening of the url

	}

}
