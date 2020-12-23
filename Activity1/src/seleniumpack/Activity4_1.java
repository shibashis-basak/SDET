package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        
        System.out.println(driver.getTitle());
        WebElement ele1 = driver.findElement(By.xpath(".//a[contains(text(),'About Us')]"));
        ele1.click();
        
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        
        driver.close();
        

	}

}
