package com.demo.qa.testcases;

import org.openqa.selenium.By;
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

	
	@BeforeMethod

	public void setUp()

	{
		initialization();

		loginpage = new LoginPage();
	}
	
	
	
	  @Test(priority=1) public void loginPageTitleTest() { String title =
	  loginpage.validateLoginPageTitle(); 
	  Assert.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday" );
	  
	  
	  }
	 
	  
	
	  @Test(priority=2) public void selectsource() 
	  {
		  
	  loginpage.selectOptionWithText("Pune");
	  String ExpectedText ="Pune";
	  
	  Assert.assertEquals(ExpectedText, driver.findElement(By.xpath("/body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getText());
	   
	  }
	 
	 

	@AfterMethod

	public void tearDown()

	{
		driver.quit();
	}
}
