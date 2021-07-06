package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		// System Property for Chrome Driver   
       // System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vaibhavkhare\\\\Downloads\\\\chromedriver.exe");  
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");		
		
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.amazon.in/");  

      //Maximize the browser  
       driver.manage().window().maximize();  
        
        
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"))).build().perform();
        Thread.sleep(3000);
        WebElement link = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"));
        builder.moveToElement(link).build().perform();
        Thread.sleep(2000);
	}

}
