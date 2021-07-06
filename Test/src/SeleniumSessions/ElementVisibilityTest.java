package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// System Property for Chrome Driver   
       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
         
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  	
		
		
             // Instantiate a ChromeDriver class.     
       WebDriver driver=new ChromeDriver();  
        
       
    // dynamic wait
    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       
      
           // Launch Website  
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");  

      //Maximize the browser  
        driver.manage().window().maximize();  
        
        

		//1. isDisplayed() method: applicanle for all the elements
		boolean b1 = driver.findElement(By.xpath("//p[@class='submit']//span[1]")).isDisplayed(); //for submit button
		System.out.println(b1); //true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.xpath("//p[@class='submit']//span[1]")).isEnabled();
		System.out.println(b2);//true
		
		
		
		
		
		//3. isSelected() method: only applicable for checkbox, dropdown, radiobutton
				boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
				System.out.println(b4);//true
				
				
				//de-select the checkbox:
				driver.findElement(By.name("agreeTerms")).click();
				boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
				System.out.println(b5);//false

		
		
		
		

	}

}
