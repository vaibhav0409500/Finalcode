package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
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
		
		// Take screenshot and store as a file format
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        
        //now copy the screenshot to desired location using copyfile method
        FileUtils.copyFile(src, new File("C:\\Users\\vaibhavkhare\\eclipse-workspace\\Test\\src\\SeleniumSessions\\screenshot.png"));
		

	}

}
