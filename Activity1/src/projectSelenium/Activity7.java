package projectSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity7 {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
			
			 driver.findElement(By.id("menu-item-26")).click();
			 driver.findElement(By.id("create_account_email")).sendKeys("selenium.project4@gmail.com");
			 driver.findElement(By.id("job_title")).sendKeys("Automation Test Specialist");
			 driver.findElement(By.id("job_location")).sendKeys("India");
			 new Select(driver.findElement(By.id("job_type"))).selectByVisibleText("Full Time");
			 driver.switchTo().frame(0);
			 driver.findElement(By.id("tinymce")).sendKeys("Test");
			 driver.switchTo().defaultContent();
			 driver.findElement(By.id("application")).sendKeys("selenium.project4@gmail.com");
			 driver.findElement(By.id("company_name")).sendKeys("Testing Pvt Ltd");
			 driver.findElement(By.name("submit_job")).click();
			 driver.findElement(By.id("job_preview_submit_button")).click();
			 System.out.println(driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]")).getText());
			 driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]/a[contains(text(), 'click here')]")).click();
			
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
