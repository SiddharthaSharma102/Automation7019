package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
  @Test
  public void hardAssertionTest() {
	  
	  String act="Selenium WebDriver";
	  String exp="Selenium WebDriver";
	  
	  Assert.assertEquals(act, exp, "Test Failed: Strings are not equal!");
	  System.out.println("Test Pass: Strings are equal!");
  }
}
