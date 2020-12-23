package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net/selenium/selects");
        driver.manage().window().maximize();
		
        WebElement selectBox = driver.findElement(By.id("multi-select"));
		Select select2 = new Select(selectBox);
		
        System.out.println("It is a mutiple select: "+select2.isMultiple());
        
        if(select2.isMultiple())
        {
        	select2.selectByVisibleText("Javascript");
            select2.selectByValue("node");
            select2.selectByIndex(4);
            select2.selectByIndex(5);
            select2.selectByIndex(6);
            
            select2.deselectByVisibleText("NodeJS");
            select2.deselectByIndex(7);
            select2.getFirstSelectedOption();
            
            List<WebElement> selectedOptions = select2.getAllSelectedOptions();
            for (WebElement ele:selectedOptions)
            {
            	System.out.println(ele.getText());
            }
            
            select2.deselectAll();
            
        }
        
        driver.close();
                 
	}

}
