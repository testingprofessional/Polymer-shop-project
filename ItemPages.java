import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPages extends FunctionalTest {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		public int verifyItemsOnMensOuterwearPage() {
			int countMensOuterwearItems = 0;
			
			// Men's outerwear
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='container']/shop-tab[1]/shop-ripple-container/a"))).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//shop-list/ul/li[16]")));
		      
			// Count items on page
		    countMensOuterwearItems = driver.findElements(By.xpath("//shop-list/ul/li")).size();
		    		     
		    return countMensOuterwearItems;
		}
	     

		public int verifyItemsOnLadiesOuterwearPage() {     
			int countLadiesOuterwearItems = 0;
			
			// Ladies outerwear
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='container']/shop-tab[2]/shop-ripple-container/a"))).click();

			waitSomeSeconds(1);
    
			// Count items on page
		    countLadiesOuterwearItems = driver.findElements(By.xpath("//shop-list/ul/li")).size();
	    
		    return countLadiesOuterwearItems;
		}
}
