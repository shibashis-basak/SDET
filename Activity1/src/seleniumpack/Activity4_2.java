package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        System.out.println(driver.getTitle());
        
        driver.findElement(By.xpath(".//input[@id='firstName']")).sendKeys("Selenium");
        driver.findElement(By.xpath(".//input[contains(@id,'lastName')]")).sendKeys("Alchemy");
        driver.findElement(By.xpath(".//input[@placeholder='abc@xyz.com']")).sendKeys("selenium.alchemy@gmail.com");
        driver.findElement(By.xpath(".//input[@type='tel']")).sendKeys("9876543210");
        driver.findElement(By.xpath(".//label[contains(text(),'Message')]//following::textarea")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
                
        Thread.sleep(2000);
        
	}

}
