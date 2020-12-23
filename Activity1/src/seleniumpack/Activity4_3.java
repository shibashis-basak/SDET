package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        
        System.out.println(driver.getTitle());
        
        WebElement thirdHdr = driver.findElement(By.xpath("//*[@id='third-header']"));
        System.out.println(thirdHdr.getText());
        
        WebElement fifthHdr = driver.findElement(By.xpath("//*[starts-with(text(),'Fifth')]"));
        System.out.println(fifthHdr.getText());
        System.out.println(fifthHdr.getCssValue("color"));
        
        WebElement violetButton = driver.findElement(By.xpath(".//button[text()='Violet']"));
        System.out.println(violetButton.getAttribute("class"));
        
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println(greyButton);
 
        driver.close();
        
        

	}

}
