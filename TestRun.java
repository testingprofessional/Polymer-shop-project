import static org.junit.Assert.*;
import org.junit.Test;
  
 public class TestRun extends FunctionalTest {
    
	 @Test
	 public void verifyItemsOnPage() {
	 		
	 	ItemPages itemsPages = new ItemPages();
	 		
	 	// Verify amount of items in Men's outerwear
	 	int countMensOuterwearItems = itemsPages.verifyItemsOnPage(ItemPages.mensOuterwarePage);
	 	assertEquals(Constant.mensOuterwearItems, countMensOuterwearItems);
	 		
	 	// Verify amount of items in Ladies outerwear
	 	int countLadiesOuterwearItems = itemsPages.verifyItemsOnPage(ItemPages.ladiesOuterwarePage);
	 	assertEquals(Constant.ladiesOuterwearItems, countLadiesOuterwearItems);	
 	}
	 	
	@Test 
 	public void orderItemsAndCheckout() {
	 		
 		OrderProcess orderProcess = new OrderProcess();
	 		
		// Choose items and checkout
		orderProcess.chooseItems();
 		orderProcess.checkoutPageItems("customer@email.com", "1234567890", "Street 21", "New York", "State of New York", "9911AL", "Customer Name", "1234 5432 6789 9876", "123");
	 		
 		// Verify if checkout succeeded
 		String strng = orderProcess.verifyCheckoutSucceeded();
 		assertEquals("Thank you", strng);
 	}
 }
  
