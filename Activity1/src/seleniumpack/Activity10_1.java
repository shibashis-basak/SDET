package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        
        Actions act = new Actions(driver);
        
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        act.click(cube).perform();;
        WebElement cubeVal1 = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal1.getText());
        
        act.doubleClick(cube).perform();
        WebElement cubeVal2 = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal2.getText());
        
        act.contextClick(cube).perform();
        WebElement cubeVal3 = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal3.getText());
        
        driver.close();              

	}

}
