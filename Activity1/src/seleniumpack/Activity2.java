package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        Thread.sleep(2000);
        String title= driver.getTitle();
        System.out.println(title);
        
        //WebElement aboutUs= driver.findElement(By.id("about-link"));
        WebElement aboutUs= driver.findElement(By.className("green"));
        //WebElement aboutUs= driver.findElement(By.cssSelector("a#about-link"));
        //WebElement aboutUs= driver.findElement(By.linkText("About Us"));
        
        System.out.println(aboutUs.getText());
        
        aboutUs.click();
        Thread.sleep(2000);
             
        driver.close();

	}

}
