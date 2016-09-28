import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderProcess extends FunctionalTest {
	
	public void chooseItems() {
	    waitSomeSeconds(1);
		
		// Ladies T-Shirts
		driver.findElement(By.xpath(".//*[@id='container']/shop-tab[4]/shop-ripple-container/a")).click();
	    waitSomeSeconds(1);
	    
	    // Women's Android Heart T-Shirt
	    driver.findElement(By.xpath("//shop-list/ul/li[19]/a/shop-list-item/div")).click();
	    waitSomeSeconds(1);
	    
	    // Add to cart
	    driver.findElement(By.xpath(".//*[@id='content']/div/shop-button/button")).click();
	    waitSomeSeconds(1);
	    
	    // View cart
	    driver.findElement(By.xpath(".//*[@id='viewCartAnchor']")).click();
	    waitSomeSeconds(1);
	     
	    // Go to shop
	    driver.findElement(By.xpath(".//*[@id='contentContainer']/app-toolbar/div[2]/a")).click();
	    waitSomeSeconds(1);
	    
	    // Ladies outerwear
	    driver.findElement(By.xpath(".//*[@id='container']/shop-tab[2]/shop-ripple-container/a")).click();
	    waitSomeSeconds(1);
	    
	    // Ladies Colorblock Wind Jacket
	    driver.findElement(By.xpath("//shop-list/ul/li[2]/a/shop-list-item/div")).click();
	    waitSomeSeconds(1);
	    
	    // Add to cart
	    driver.findElement(By.xpath(".//*[@id='content']/div/shop-button/button")).click();
	    waitSomeSeconds(1);
	    	    
	    // Checkout                  
	    driver.findElement(By.xpath("html/body/shop-app/shop-cart-modal/div[2]/shop-button[2]/a")).click();
	}

    public void checkoutPageItems(String email, String phone, String address, String city, String state, String zip, String ccname, String ccnumber, String cvv) {
    	webdriverWaitForElement(".//*[@id='accountEmail']");
    	
	    WebElement Email = driver.findElement(By.xpath(".//*[@id='accountEmail']")); 
	    WebElement Phone = driver.findElement(By.xpath(".//*[@id='accountPhone']"));
	    WebElement Address = driver.findElement(By.xpath(".//*[@id='shipAddress']")); 
	    WebElement City = driver.findElement(By.xpath(".//*[@id='shipCity']")); 
	    WebElement State = driver.findElement(By.xpath(".//*[@id='shipState']")); 
	    WebElement Zip = driver.findElement(By.xpath(".//*[@id='shipZip']"));
	    WebElement ccName = driver.findElement(By.xpath(".//*[@id='ccName']")); 
	    WebElement ccNumber = driver.findElement(By.xpath(".//*[@id='ccNumber']")); 
	    WebElement CVV = driver.findElement(By.xpath(".//*[@id='ccCVV']")); 
	    WebElement ccExpMonth = driver.findElement(By.xpath(".//*[@id='ccExpMonth']/option[5]"));
	    
	    Email.sendKeys(email);
 		Phone.sendKeys(phone);
 		Address.sendKeys(address);
 		City.sendKeys(city);
 		State.sendKeys(state);
 		Zip.sendKeys(zip);
 		ccName.sendKeys(ccname);
 		ccNumber.sendKeys(ccnumber);
 		CVV.sendKeys(cvv);
 		ccExpMonth.click();
    
	    webdriverWaitForElement(".//*[@id='submitBox']/input");
	    
	    // Place Order
	    driver.findElement(By.xpath(".//*[@id='submitBox']/input")).click();
    }
    
    public String verifyCheckoutSucceeded() {
    	waitSomeSeconds(1);
    	WebElement element = driver.findElement(By.xpath("//shop-checkout/div/iron-pages/header[1]/h1[text()='Thank you']"));
    	String strng = element.getText();
    	return strng;
    }
}
