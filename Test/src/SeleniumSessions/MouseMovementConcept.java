package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.spicejet.com");  

      //Maximize the browser  
        driver.manage().window().maximize();  
		
        
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
        
        driver.findElement(By.linkText("SpiceBiz")).click();
		

	}

}
