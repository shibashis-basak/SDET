package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  @Parameters({"username", "password"})
  public void f(String username, String password) {
	  
	  WebElement name = driver.findElement(By.cssSelector("input#username"));
	  name.sendKeys(username);
	  WebElement passWord = driver.findElement(By.cssSelector("input#password"));
	  passWord.sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	  	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
