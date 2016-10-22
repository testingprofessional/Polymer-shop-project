import org.openqa.selenium.By;

public class ItemPages extends FunctionalTest {
	
	public static String mensOuterwarePage = ".//*[@id='container']/shop-tab[1]/shop-ripple-container/a";
	public static String ladiesOuterwarePage = ".//*[@id='container']/shop-tab[2]/shop-ripple-container/a";
		
	public int verifyItemsOnPage(String page) {
		int totalItems = 0;
			
		// Wait till all elements on shop tab are available
		webdriverWaitForElement(".//*[@id='container']/shop-tab[4]/shop-ripple-container/a");
			
		//Page
		driver.findElement(By.xpath(page)).click();
			
		waitSomeSeconds(1);
		    
		// Count items on page
	    totalItems = driver.findElements(By.xpath("//shop-list/ul/li")).size();
	    
	    return totalItems;
	}
}
