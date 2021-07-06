package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  

        

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		
		
		// Launch the application
    	 driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
    	 
    	 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
