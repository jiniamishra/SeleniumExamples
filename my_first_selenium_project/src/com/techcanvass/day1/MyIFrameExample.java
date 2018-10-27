package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyIFrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a/img")).click();
		System.out.println(driver.switchTo().parentFrame().getCurrentUrl());
		driver.switchTo().parentFrame().navigate().back();
		
		//driver.close();
		//driver.quit();
		
		
		//*[@id="txtName"]
		//*[@id="yui_3_18_0_3_1540622689641_793"]
		
	}

}
