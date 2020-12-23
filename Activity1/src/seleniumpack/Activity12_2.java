package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        
        WebElement frame1 = driver.findElement(By.className("content"));
        System.out.println(frame1.getText());
        
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        
        WebElement frame2 = driver.findElement(By.className("content"));
        System.out.println(frame2.getText());
        
        driver.switchTo().defaultContent();
        
        driver.close();
        

	}

}
