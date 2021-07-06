package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		
				
				// System Property for Chrome Driver   
		   //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");  
		     
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavkhare\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  	
		
		             // Instantiate a ChromeDriver class.     
		       WebDriver driver=new ChromeDriver();  
		        
		      
		           // Launch Website  
		        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");  

		      //Maximize the browser  
		        driver.manage().window().maximize();  
		        
		        
		     // executescript--- to execute javascript code   
		     
		        
		        Thread.sleep(5000);
		        
		        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vk78249@gmail.com");
		        
		        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("9958255829");
		        
		        Thread.sleep(5000);
		        
		        WebElement loginbtn=driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
		        
		
		        flash(loginbtn,driver);
		
		        drawBorder(loginbtn,driver);
		        

				// Take screenshot and store as a file format
		        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		        
		        //now copy the screenshot to desired location using copyfile method
		        FileUtils.copyFile(src, new File("C:\\Users\\vaibhavkhare\\eclipse-workspace\\Test\\src\\SeleniumSessions\\screenshotone.png"));
		
		        
		      //generate Alert
				//generateAlert(driver, "There is an issue with Login button on Login Page");

		        // click on any element by using JS executor
		        clickElementByJS(loginbtn,driver);
		        
		        // Refresh the page
		        //1. by using selenium
		        
		        driver.navigate().refresh();
		        
		        //2.by using js
		        
		        refreshBrowserByJS(driver);
		        
		        // get the title of the page
		        
		      //  getTitleByJS(driver);
		        
		        // get text of the page
		        
		        System.out.println(getPageInnerText(driver));
		        
		        // scroll page down
		        scrollPageDown(driver);
		        
		        
				WebElement forgotPwdLink = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
				scrollIntoView(forgotPwdLink, driver);
				

		        
	}

	
	public static void drawBorder(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

	

    public static void clickElementByJS(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", element);


    	
    }

	
	
	
	
	
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  100; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }

    public static void generateAlert(WebDriver driver, String message){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("alert('"+message+"')");

    }

    

    public static void refreshBrowserByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("history.go(0)");
    }

    public static String getTitleByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String title = js.executeScript("return document.title;").toString();
    	return title;
    }
    
    public static String getPageInnerText(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
    	return pageText;
    }


    public static void scrollPageDown(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    
    public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

		
	
}
