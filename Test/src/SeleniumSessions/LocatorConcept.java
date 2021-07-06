package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("Http://Newtours.Demoaut.Com/");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        
        // 1.xpath
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("vaibhav");
           
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vaibhav");
        
        
        //5.partial link text-- we never use
        // classname-- we should not use
	}

}
