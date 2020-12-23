package testNGTests;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  String title1 = driver.getTitle();
	  System.out.println(title1);
	  Assert.assertEquals(title1, "Training Support");
	  
	  driver.findElement(By.id("about-link")).click();
	  String title2 = driver.getTitle();
	  System.out.println(title2);
	  Assert.assertEquals(title2, "About Training Support");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
