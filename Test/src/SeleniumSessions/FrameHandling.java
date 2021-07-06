package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// System Property for Chrome Driver   
     //   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver.exe");  
     
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://automationpractice.com/index.php");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        // To delete the cookies
        driver.manage().deleteAllCookies();
		
        // Dynamic Wait
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        
      /*  driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
        
        Thread.sleep(30000);
        
        driver.findElement(By.name("email")).sendKeys("vk78249@gmail.com");
        
        driver.findElement(By.name("password")).sendKeys("rockindia@123");*/
        
	}

}
