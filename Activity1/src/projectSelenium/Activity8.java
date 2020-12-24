package projectSelenium;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity8 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
		
		 driver.findElement(By.id("user_login")).sendKeys("root");
		 driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		 driver.findElement(By.id("wp-submit")).click(); 
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "Dashboard � Alchemy Jobs � WordPress");
		 	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
