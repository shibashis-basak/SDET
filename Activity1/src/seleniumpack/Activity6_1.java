package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.name("toggled"));
		WebElement removeCheckbox = driver.findElement(By.xpath(".//*[contains(@id,'toggleCheckbox')]"));
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		removeCheckbox.click();
		ewait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		removeCheckbox.click();
		ewait.until(ExpectedConditions.visibilityOf(checkbox));
		
		driver.close();
		
				
		}

}
