package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net/selenium/tables");
        
        List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("No of rows: "+row.size());
        
        List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr/td"));
        System.out.println("No of columns: "+column.size());
        
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement ele:thirdRow)
        {
        	System.out.println(ele.getText());
        }
        
        WebElement secondRowSecondColumn = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println(secondRowSecondColumn.getText());
        
        driver.close();        
    
	}

}
