package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
    WebDriver driver=new ChromeDriver();  
    
    driver.get("https://business.twitter.com/start-advertising");
    
    
 // considering that there is only one tab opened in that point.
    String oldTab = driver.getWindowHandle();
    driver.findElement(By.linkText("Twitter Advertising Blog")).click();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
    newTab.remove(oldTab);
    // change focus to new tab
    driver.switchTo().window(newTab.get(0));
    

    // Do what you want here, you are in the new tab

    driver.close();
    // change focus back to old tab
    driver.switchTo().window(oldTab);
    
    

	}

}
