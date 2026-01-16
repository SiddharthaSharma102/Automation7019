package com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Utility;

public class LoginPage {
	
	private WebDriver driver;

	//initialize driver
	public LoginPage(WebDriver driver)//base session driver
	{
		this.driver=driver;
	}
	
	//locator
	private By email=By.id("email-id");
	private By pwd=By.id("password");
	private By btn=By.name("submit-name");
	
	//method
	public String Login(String em, String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		driver.findElement(btn).click();
		Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
	
}
