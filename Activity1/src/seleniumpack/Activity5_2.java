package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean checkbox1 = checkbox.isSelected();
		System.out.println(checkbox1);
		
		checkbox.click();
		
		boolean checkbox2 = checkbox.isSelected();
		System.out.println(checkbox2);
		
		driver.close();
		

	}

}
