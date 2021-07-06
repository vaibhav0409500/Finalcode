package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeVideoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        
        driver.get("https://www.youtube.com/watch?v=3uFzApUxV5k");
        
        
        Screen s=new Screen();

	}

}
