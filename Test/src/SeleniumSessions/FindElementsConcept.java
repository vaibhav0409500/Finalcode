package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for Chrome Driver   
       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
         
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
		
            // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        
        // Launch Website  
        driver.navigate().to("https://www.ebay.com");
        
      //Maximize the browser  
        driver.manage().window().maximize();  
        
        // To delete the cookies
        driver.manage().deleteAllCookies();
        
        //get the total counts of links on the page
        //get the text of each links on the page
       
        List <WebElement>linklist=driver.findElements(By.tagName("a"));
		
		//Size of linklist
        
        System.out.println(linklist.size());
        
        for(int i=0;i<linklist.size();i++)
        	
        {
        	
        	String linktext=linklist.get(i).getText();
        	
        	 System.out.println(linktext);
        	
        }
		
		
		
		
		
		
	}

}
