package projectSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.id("menu-item-24")).click();
	  driver.findElement(By.id("search_keywords")).sendKeys("TestJob_33");
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  WebDriverWait ewait = new WebDriverWait(driver, 10);
	  ewait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//ul[@class='job_listings']/li/a/div/h3[contains(text(),'TestJob_33')]"))).click();
	  driver.findElement(By.xpath(".//input[contains(@class, 'application_button')]")).click();;
	  String emailAddress = driver.findElement(By.className("job_application_email")).getText();
	  System.out.println(emailAddress);
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
