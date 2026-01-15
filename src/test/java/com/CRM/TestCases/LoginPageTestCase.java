package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass {
	@BeforeClass
	public void pageSetUp() {
		hp.getStatusOfLink();
	}

	@Test
	public void validateLogin() {
		String url = lp.Login("admin@admin.com", "password");
		Assert.assertTrue(url.contains("customers"), "Test Fail: Login Failed");
		System.out.println("Test Passed: Login successful");
	}

}
