package testNGTests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity3 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	 WebElement username = driver.findElement(By.id("username"));
	 username.sendKeys("admin");
	 WebElement password = driver.findElement(By.id("password"));
	 password.sendKeys("password");
	 
	 driver.findElement(By.xpath("//button[text()='Log in']")).click();
	 
	 String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	 System.out.println(loginMessage);
	 
	 Assert.assertEquals(loginMessage, "Welcome Back, admin");
	 
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
