package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net/selenium/selects");
        driver.manage().window().maximize();
		
		WebElement selectBox = driver.findElement(By.id("single-select"));
		Select select1 = new Select(selectBox);
		
		select1.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		select1.selectByIndex(3);
		Thread.sleep(2000);
		select1.selectByValue("4");
		Thread.sleep(2000);
		
		List<WebElement> list1 = select1.getOptions();
		for(WebElement ele:list1)
		{
			System.out.println(ele.getText());
		}
		
		driver.close();
		

	}

}
