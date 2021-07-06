package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		// System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  	
		
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://html.com/input-type-file/");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\vaibhavkhare\\Downloads\\Jiraone.html");
		
      //C:\\abcfolder\\textfile.txt
	}

}
