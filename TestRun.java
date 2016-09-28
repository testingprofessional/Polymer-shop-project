import static org.junit.Assert.*;
import org.junit.Test;
  
 public class TestRun extends FunctionalTest {
    
	 	@Test
	 	public void verifyItemsOnPage() {
	 		int mensOuterwearItems = 16;
	 		int ladiesOuterwearItems = 6;
	 		
	 		driver.get("https://shop.polymer-project.org");
	 		
	 		ItemPages itemsPages = new ItemPages();
	 		
	 		// Verify amount of items in Men's outerwear
	 		int countMensOuterwearItems = itemsPages.verifyItemsOnMensOuterwearPage();
	 		assertEquals(mensOuterwearItems, countMensOuterwearItems);
	 		
	 		// Verify amount of items in Ladies outerwear
	 		int countLadiesOuterwearItems = itemsPages.verifyItemsOnLadiesOuterwearPage();
	 		assertEquals(ladiesOuterwearItems, countLadiesOuterwearItems);
	 		
	 	}
	 	
	 	@Test 
	 	public void orderItemsAndCheckout() {
	 		driver.get("https://shop.polymer-project.org");
	 		
	 		OrderProcess orderProcess = new OrderProcess();
	 		
	 		// Order items and checkout
	 		orderProcess.chooseItems();
	 		orderProcess.checkoutPageItems("customer@email.com", "1234567890", "Street 21", "New York", "State of New York", "9911AL", "Customer Name", "1234 5432 6789 9876", "123");
	 		
	 		// Verify if checkout succeeded
	 		String strng = orderProcess.verifyCheckoutSucceeded();
	 		assertEquals("Thank you", strng);
	 	}
 }
  
