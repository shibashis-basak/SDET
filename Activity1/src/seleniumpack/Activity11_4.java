package seleniumpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/tab-opener");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        String handle1 = driver.getWindowHandle();
        
        WebElement clickMe = driver.findElement(By.id("launcher"));
        clickMe.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
        Set<String> windows = driver.getWindowHandles();
        for(String currWindow: windows)
        {
        	System.out.println(currWindow);
        	driver.switchTo().window(currWindow);
        }
        
        System.out.println("New tab handle: " + driver.getWindowHandle());
        
        
        wait.until(ExpectedConditions.titleIs("Newtab2"));
 
       
        System.out.println("New Tab Title is: " + driver.getTitle());
 
       
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        
        driver.quit();
        
        

	}

}
