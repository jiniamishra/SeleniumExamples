package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");//here we have automated the opening of the url
		//we are now going to fill the text fields
		driver.findElement(By.id("txtName")).sendKeys("Jinia Mishra");
		driver.findElement(By.id("txtEmail")).sendKeys("tak2prats@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9967338891");
		driver.findElement(By.id("txtMessage")).sendKeys("I have registered for selenium");
		
		Select myselect = new Select(driver.findElement(By.id("ddlSubject")));
		//myselect.selectByVisibleText("Webinar Enquiry");
		//myselect.selectByIndex(2);
		myselect.selectByValue("Feedback");
		
		driver.findElement(By.name("btnSubmit")).click();
		driver.close();
		}

}
