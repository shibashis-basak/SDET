package projectSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity9 {
	WebDriver driver;
	
	
	  @Test
	  public void f() {
		  
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			Actions act = new Actions(driver);
			WebElement jobListing = driver.findElement(By.linkText("Job Listings"));
			act.moveToElement(jobListing).build().perform();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement addNew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add New")));
			act.moveToElement(addNew).click().build().perform();
			driver.findElement(By.id("post-title-0")).sendKeys("Test automation");
			driver.findElement(By.id("_application")).clear();
			driver.findElement(By.id("_application")).sendKeys("test@gmail.com");
			driver.findElement(By.id("_company_website")).sendKeys("test.com");
			driver.findElement(By.id("_company_twitter")).sendKeys("@test");
			driver.findElement(By.id("_job_location")).sendKeys("India");
			driver.findElement(By.id("_company_name")).sendKeys("Test Pvt Ltd");
			driver.findElement(By.xpath(".//button[contains(text(), 'Publish…')]")).click();
			driver.findElement(By.xpath(".//div[@class='editor-post-publish-panel__header-publish-button']/button")).click();
			WebElement publishedText = driver.findElement(By.className("editor-post-publish-panel__header-published")); 
			Assert.assertEquals(publishedText.getText(), "Published");
			driver.findElement(By.xpath(".//div[@class='post-publish-panel__postpublish-buttons']/a")).click();
			 
			 	  
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
