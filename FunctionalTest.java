import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalTest {
		protected static WebDriver driver;
		
		@Before
		   public void beforeTest() {
			   driver = new FirefoxDriver();  
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   }
		   
		 @After
		 	public void afterTest() {
			   driver.close();  
			   driver.quit();
		   }
		 
		 public void waitSomeSeconds(int seconds) {
			   try{  
				   TimeUnit.SECONDS.sleep(seconds);
			}catch(Exception e){}
		   }
		 
		 public void webdriverWaitForElement(String xpath) {
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		 }	 
}
