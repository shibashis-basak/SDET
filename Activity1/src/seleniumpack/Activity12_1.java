package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		        
        //Open browser
        driver.get("https://www.training-support.net/selenium/iframes");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.className("content"));
        System.out.println(frame1.getText());
        
        WebElement button1 = driver.findElement(By.id("actionButton"));
        System.out.println("The text of the button 1: "+button1.getText());
        System.out.println("The color of the button 1: "+button1.getCssValue("color"));
        
        button1.click();
        
        System.out.println("The new text of the button 1: "+button1.getText());
        System.out.println("The new color of the button 1: "+button1.getCssValue("color"));
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        WebElement frame2 = driver.findElement(By.className("content"));
        System.out.println(frame2.getText());
        
        WebElement button2 = driver.findElement(By.id("actionButton"));
        System.out.println("The text of the button 2: "+button2.getText());
        System.out.println("The color of the button 2: "+button2.getCssValue("color"));
        
        button2.click();
        
        System.out.println("The new text of the button 2: "+button2.getText());
        System.out.println("The new color of the button 2: "+button2.getCssValue("color"));
        
        driver.switchTo().defaultContent();
        
        driver.close();
        
        

	}

}
