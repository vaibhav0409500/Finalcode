package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// how to handle alert popup--It is a famous interview question
		
		
		
		// System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
        
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        driver.findElement(By.name("proceed")).click();// click on go to button
        
        Thread.sleep(5000);
        
        Alert alert=driver.switchTo().alert();
        
        System.out.println(alert.getText()); 
        
        
        String text=alert.getText();
        
          if(text.equals("Please enter a valid user name"))

    {
	  System.out.println("correct error message");
	  
	  
    }
else
	
    {
	System.out.println("incorrect error message");
	
    }
 
        alert.accept();// click on ok button
        
      //  alert.dismiss();//click on cancel button

	}

}

