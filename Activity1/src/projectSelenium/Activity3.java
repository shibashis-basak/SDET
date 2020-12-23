package projectSelenium;

import org.testng.annotations.Test;
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
		 WebElement image = driver.findElement(By.xpath(".//img[contains(@class,'attachment-large')]"));
		 String imageLink = image.getAttribute("src");
		 System.out.println(imageLink);
		  
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
