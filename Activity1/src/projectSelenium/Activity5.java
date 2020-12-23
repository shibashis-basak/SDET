package projectSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
	  @Test
	  public void f() {
		  
		  WebElement jobs = driver.findElement(By.id("menu-item-24"));
		  jobs.click();
		  String jobTitle = driver.getTitle();
		  Assert.assertEquals(jobTitle, "Jobs – Alchemy Jobs");
		  
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
