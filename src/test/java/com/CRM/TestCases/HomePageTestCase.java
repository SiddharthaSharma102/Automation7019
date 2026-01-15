package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.pages.HomePage;

public class HomePageTestCase extends BaseClass{
  @Test(priority=1)
  public void verifyUrl() {
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test failed: Url not matched");
	  System.out.println("Test pass: Url matched");
  }
  
  @Test(priority=2)
  public void verifyTitle() {
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test failed: Title not matched");
	  System.out.println("Test pass: Title matched");
  }
  
  @Test(priority=3)
  public void validateSignIn() {
	 String nextPageUrl = hp.getStatusOfLink();
	 Assert.assertTrue(nextPageUrl.contains("login"),"Test fail: Login Page not opened");
	 System.out.println("Test pass: App navigigating to login page");
  }
}
