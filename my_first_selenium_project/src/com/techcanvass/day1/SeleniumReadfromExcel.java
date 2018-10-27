package com.techcanvass.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReadfromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Jinia\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/Login.aspx");
		FileInputStream f = new FileInputStream("E:\\Jinia\\testdata123.xls");
		HSSFWorkbook hw = new HSSFWorkbook(f);
		HSSFSheet fs = hw.getSheetAt(0);
		
		for (int i=1; i <= fs.getLastRowNum(); i++)
		{
			int j =1;
			HSSFCell id, password;
			id = fs.getRow(i).getCell(j);
			password = fs.getRow(i).getCell(j+1);
						
			driver.findElement(By.id("txtLoginid")).sendKeys(id.toString());
	        driver.findElement(By.id("txtpassword")).sendKeys(password.toString());
	        WebElement w =  driver.findElement(By.id("btnLogin"));
	        w.click();
	        Thread.sleep(3000);
	        
	        driver.switchTo().alert().accept();
	        driver.findElement(By.id("txtLoginid")).clear();
	        driver.findElement(By.id("txtpassword")).clear();
		}
		
		hw.close();
		f.close();
		driver.close();
	}

}
