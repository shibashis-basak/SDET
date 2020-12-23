package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.className("willDisappear"));
		boolean checkbox1 = checkbox.isDisplayed();
		System.out.println(checkbox1);
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		boolean checkbox2 = checkbox.isDisplayed();
		System.out.println(checkbox2);
		
		driver.close();

	}

}
