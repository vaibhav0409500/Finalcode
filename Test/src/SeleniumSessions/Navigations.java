package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// get vs navigate.to
		
		// get url is use to launch the  browser
		
		// navigate().to is use to  launch browser as well move to external url from current url
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        
      
      //Maximize the browser  
        
        
        driver.manage().window().maximize();  
        
        

        // To delete the cookies
        driver.manage().deleteAllCookies();
        
        // Launch Website  
        
        driver.get("https://www.google.com");
        
        driver.navigate().to("https://www.amazon.com");  
        
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.navigate().forward();
		
		
        Thread.sleep(2000);
		
        driver.navigate().back();
        driver.navigate().refresh();
		

	}

}
