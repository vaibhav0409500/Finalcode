package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// HtmlUnitDriver concept is not used in selenium 3.x v
		// HtmlUnitDriver -  we have to download HtmlUnitDriver  jar to use this concept
		
		// System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  		
		
             // Instantiate a ChromeDriver class.     
       // WebDriver driver=new ChromeDriver();  
        
        WebDriver driver=new HtmlUnitDriver();  
          
           // Launch Website  
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        //advanatges
        //1.testing is happening behind the scene-- no browser is launched
        //2.very fast-- execution  of test cases are very fast-- performance of the script
        // 3.not suitable for action class-- user actions-- mosue movement ,double click and drag and drop
        // 4.ghost driver - headless driver
        //--HtmlUnitDriver--Java
        //--phantomjs---javascript
        
        
        System.out.println("before login ----title is"+ driver.getTitle() );
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vk78249@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("9958255829");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();;
        
        
        System.out.println("after login ----title is"+ driver.getTitle() );
        
        
    	
		
		
		

	}

}
