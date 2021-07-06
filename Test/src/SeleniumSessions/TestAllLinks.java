package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
         WebDriver driver=new ChromeDriver();  
         
         String notWorkingUrlTitle = "Under Construction: QAAutomated";
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         driver.get("http://www.qaautomated.com/");
         
         List<WebElement> linkElements = driver.findElements(By.tagName("a"));
         String[] linkTexts = new String[linkElements.size()];
         int i = 0;

         //extract the link texts of each link element
         for (WebElement elements : linkElements) {
             linkTexts[i] = elements.getText();
             i++;
         }

         //test each link
         for (String t : linkTexts) {
             driver.findElement(By.linkText(t)).click();
             if (driver.getTitle().equals(notWorkingUrlTitle )) {
                 System.out.println("\"" + t + "\""
                         + " is not working.");
             } else {
                 System.out.println("\"" + t + "\""
                         + " is working.");
             }
             driver.navigate().back();
         }
         driver.quit();
     }
         
         
		

	}


