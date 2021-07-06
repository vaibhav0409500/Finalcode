package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. firefox driver
		//gecko driver
		
		
		//System.setProperty("webdriver.Firefoxdriver","C:\\Softwares\\Program Files\\Java\\geckodriver.exe");
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		
		
		//2. chrome driver
		
		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.google.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
		
          String title= driver.getTitle();
          
          System.out.println(title); 
          
          //validation points
          
          if(title.equals("Google"))
        	  
          {
        	  
        	  System.out.println("Correct title"); 
        	  
        	  
        		  
        	  
          }
		
          
          else
        	  
          {
        	  
        	  System.out.println("InCorrect title"); 
        	  
          }
		
		
          driver.quit();
		

	}

}
