package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
				
		WebElement textbox = driver.findElement(By.id("input-text"));
		System.out.println(textbox.isEnabled());
		
		WebElement enableInput = driver.findElement(By.id("toggleInput"));
		enableInput.click();
		
		System.out.println(textbox.isEnabled());
			
		driver.close();
		
	}

}
