package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  

		
		
		
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		
		
		// Launch the application
    	 driver.get("http://demo.guru99.com/test/");
    	 
    	 String date="27-November-2019";
    	 
    	 String dateArr[]=date.split("-");
    	 
    	 String day=dateArr[0];
    	 String month=dateArr[1];
    	 String year=dateArr[2];
    	 
    	 
    	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	 
 		//Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09252013");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox.sendKeys("0245PM");


	}

}
