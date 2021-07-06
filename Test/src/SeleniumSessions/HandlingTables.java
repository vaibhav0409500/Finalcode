package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) throws InterruptedException {
	    String s="";
	 // System Property for Chrome Driver   
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
        
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  	    
	    
            // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
	    
	    driver.get("http://www.w3schools.com/html/html_tables.asp");
	    WebElement table = driver.findElement(By.className("w3-table-all"));
	    List<WebElement> allrows = table.findElements(By.tagName("tr"));
	    List<WebElement> allcols = table.findElements(By.tagName("td"));
	    System.out.println("Number of rows in the table "+allrows.size());
	    System.out.println("Number of columns in the table "+allcols.size());

	    for(WebElement row: allrows){
	        List<WebElement> Cells = row.findElements(By.tagName("td"));
	        for(WebElement Cell:Cells){
	            s = s.concat(Cell.getText());   
	            Cell.click();
	        }
	    }
	    System.out.println(s);
	    if(s.contains("Jackson")){
	        System.out.println("Jackson is present in the table");
	        
	    }else{
	        System.out.println("Jackson is not available in the table");
	    }
	    Thread.sleep(10000);
	    driver.quit();
	  }
	
	
}
