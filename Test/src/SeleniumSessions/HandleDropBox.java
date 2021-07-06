package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
     
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://the-internet.herokuapp.com/dropdown");  

      //Maximize the browser  
        driver.manage().window().maximize();  
		
        //handle drop down
        
        Select select=new Select(driver.findElement(By.id("dropdown")));
        
        select.selectByVisibleText("Option 1");
		
		
		
		

	}

}
