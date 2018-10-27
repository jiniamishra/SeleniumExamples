package com.techcanvass.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyContactUsPageFactory {

	@FindBy (id="txtName") WebElement Ele;
	@FindBy (id="txtContact") WebElement Ele1;	
	@FindBy (name="btnSubmit") WebElement Ele2;
	
	public void SetName (String name)
	{
		Ele.sendKeys(name);
		
	}
		
	public void setPhNo(String phNo)
	{
		Ele1.sendKeys(phNo);
	}
		
	public void buttonClick()
	{
		Ele2.click();;
	}

}
