package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		  // System Property for Chrome Driver
		//  System.setProperty("webdriver.chrome.driver",  "C:\\Program Files\\Java\\chromedriver.exe");
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
		
		
		
		  // Instantiate a ChromeDriver class
		  
		  WebDriver driver=new ChromeDriver();
		  
		  // Launch Website 
		  
		  driver.navigate().to("https://www.ebay.com");
		  
		  //Maximize the browser driver.manage().window().maximize();
		  
		  // To delete the cookies driver.manage().deleteAllCookies();
		  
		  // Dynamic Wait
		  
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  
		  //1.performance isseue
		  //2 .not realible
		  //3. can be change at any time in future
		  
		  
		//  driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("vaibhav");
		  
		  // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("vaibhav");
		  
		  // driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("vaibhav");
		  
		  // dynamic id //xpath - start with
		  
		  //Xpath=//label[starts-with(@id,'message')]
		         
        //xpath--endswith
        //xpath="//input[@id[ends-with(.,'register')]]"
        
        // for links-- custom xpath
        
        // all the links are represented by <a> html tag
        
        driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();;

	}

}
