package SeleniumSessions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.google.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          
          driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		
  		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
  		
  		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
  	    driver.switchTo().window(tabs.get(1)); //switches to new tab
  	    driver.get("https://www.facebook.com");

  	    driver.switchTo().window(tabs.get(0)); // switch back to main screen  
		
		
		
		
	}

}
