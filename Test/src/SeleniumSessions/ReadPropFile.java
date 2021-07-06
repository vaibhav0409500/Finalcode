package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\vaibhavkhare\\eclipse-workspace\\Test\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		String url=prop.getProperty("URL");
		
		System.out.println(url);
        
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
	          
            // Instantiate a ChromeDriver class.     
             driver=new ChromeDriver();  
			
           // driver.get(url);
		}
		
		else
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
			
			//driver.get(url);
			
		}
			
		
		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		Thread.sleep(5000);
		
	}

	
	
}
