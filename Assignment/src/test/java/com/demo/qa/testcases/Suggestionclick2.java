package com.demo.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.qa.util.TestUtill;

public class Suggestionclick2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhavkhare\\eclipse-workspace\\Assignment\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
                     
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		//WebElement fromCity = driver.findElement(By.cssSelector("input#fromCity"));
	//	WebElement fromCity = driver.findElement(By.xpath("//Input[@type='text' and @id='toCity']"));
		
		WebElement fromCity = driver.findElement(By.xpath("//Input[@type='text' "));
		
		
		fromCity.sendKeys("Pune");
		
		Thread.sleep(5000);

		List<WebElement> suggestionBox = driver.findElements(By.xpath("//li[@role='option']//div[@class='calc60']/p[1]"));

		for (WebElement temp : suggestionBox) {
			
			if(temp.getText().contains("Pune")) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click()", temp);
				
						}

		}
		
		
		Thread.sleep(5000);
	}

}
