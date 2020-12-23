package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
      	   
 	   //create firefox instance
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        Thread.sleep(2000);
        driver.close();
        

	}

}
