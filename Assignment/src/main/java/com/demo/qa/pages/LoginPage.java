package com.demo.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.qa.base.TestBase;

public class LoginPage  extends TestBase {
	
	
	
	
	//Page Factory - OR:
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
		WebElement loginBtn;
		
		@FindBy(xpath="//button[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmLogo;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}
		
		public  void login(String un, String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
			    //	JavascriptExecutor js = (JavascriptExecutor)driver;
			    //	js.executeScript("arguments[0].click();", loginBtn);
			    	
			;
		}

		
		public void selectOptionWithText(String textToSelect) {
			try {
				
				WebDriverWait wait = null;
				Thread.sleep(2000);
				WebElement autoOptions = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
				
				Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOf(autoOptions));

				List<WebElement> optionsToSelect = autoOptions.findElements(By.xpath("/body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
				for(WebElement option : optionsToSelect){
			        if(option.getText().equals(textToSelect)) {
			        	System.out.println("Trying to select: "+textToSelect);
			            option.click();
			            break;
			        }
			    }
				
			} catch (NoSuchElementException e) {
				System.out.println(e.getStackTrace());
			}
			catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
		

		public void selectOptionWithTextdestination(String textToSelect) {
			try {
				
				WebDriverWait wait = null;
				WebElement autoOptions = driver.findElement(By.xpath("/body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
				wait.until(ExpectedConditions.visibilityOf(autoOptions));

				List<WebElement> optionsToSelect = autoOptions.findElements(By.xpath("/body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
				for(WebElement option : optionsToSelect){
			        if(option.getText().equals(textToSelect)) {
			        	System.out.println("Trying to select: "+textToSelect);
			            option.click();
			            break;
			        }
			    }
				
			} catch (NoSuchElementException e) {
				System.out.println(e.getStackTrace());
			}
			catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
		
		
}
