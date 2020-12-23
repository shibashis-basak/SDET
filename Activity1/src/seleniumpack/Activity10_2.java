package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        
        Actions act = new Actions(driver);
        
        act.sendKeys("S").build().perform();
        
        String pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        
        Action act1 = act.keyUp(Keys.CONTROL).sendKeys("a").sendKeys("c").keyDown(Keys.CONTROL).build();
        act1.perform();
        
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        
        driver.close();
        

	}

}
