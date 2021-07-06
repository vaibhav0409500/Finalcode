package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System Property for Chrome Driver   
     //   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  

        
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        
        // Launch Website  
        driver.navigate().to("https://jqueryui.com/droppable/");
        
      //Maximize the browser  
        driver.manage().window().maximize();  
        
        

        // To delete the cookies
        driver.manage().deleteAllCookies();
        
        // Launch Website  
        driver.navigate().to("https://jqueryui.com/droppable/");  
        
        driver.switchTo().frame(0);// switch to frame if it is present
        
        Actions action = new Actions(driver);
        
       // action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement((WebElement) By.xpath("//div[@id='droppable']"));
        action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
        .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
        .release()
        .build()
        .perform();
        
        
		

	}

}
