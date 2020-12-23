package projectSelenium;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	  @Test
	  public void f() {
		  
		  WebElement header = driver.findElement(By.className("entry-title"));
		  String headerText = header.getText();
		  Assert.assertEquals(headerText, "Welcome to Alchemy Jobs");
		  
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

}
