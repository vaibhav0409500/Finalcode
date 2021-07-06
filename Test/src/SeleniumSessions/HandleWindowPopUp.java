package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.alerts--- java script popup , alert api(accept,dismiss)
		
		//2.file upload pop up--- browse button (type=file , sendkeys(path)
		
		//3. browser window popup - Advertisement pop up ( window handler api, getwindowhandles())
		
		
		
		
		
		// System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        
        driver.get("http://www.popuptest.com/goodpopups.html");
		
        
        driver.findElement(By.xpath("//a[@class='black']")).click();
        
        
                Thread.sleep(2000);
            Set<String>  handler=driver.getWindowHandles();
        
            Iterator<String>   it=handler.iterator();
            
            String parentwindow=it.next();
            
            System.out.println("parent window id :"+parentwindow);
            
            
            String childwindow=it.next();
            
            System.out.println("child window id :"+childwindow);
            
            driver.switchTo().window(childwindow);
            Thread.sleep(2000);
            
            System.out.println("child window popup title :"+driver.getTitle());
            
            driver.close();
            
            driver.switchTo().window(parentwindow);
            
            Thread.sleep(2000);
            
            System.out.println("parent window popup title :"+driver.getTitle());
	}

}
