package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@Test
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");

	}

	@BeforeMethod

	public void setUp()

	{
		initialization();

		loginpage = new LoginPage();
	}

	@AfterMethod

	public void tearDown()

	{
		driver.quit();
	}
}
