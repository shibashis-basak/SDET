package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        driver.get("https://training-support.net/selenium/tables");
        driver.manage().window().maximize();
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr"));
        System.out.println(rows.size());
        
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr/td"));
        System.out.println(columns.size());
        
        WebElement secondRowSecondColumn = driver.findElement(By.xpath("//table[@id= 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Before sorting: " + secondRowSecondColumn.getText());
		
		WebElement nameColumn = driver.findElement(By.xpath("//table[@id= 'sortableTable']/thead/tr/th[1]"));
		nameColumn.click();
		
		WebElement cellValueAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("After sorting: " + cellValueAfter.getText());
				
		WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());
		
		driver.close();
				

	}

}
