package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage {

	public ShippingAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "shipping-address-select")
	private WebElement shippingDropdown;
	
	@FindBy(id = "PickUpInStore")
	private WebElement PickUpInStore;

	public WebElement getShippingDropdown() {
		return shippingDropdown;
	}

	public WebElement getPickUpInStore() {
		return PickUpInStore;
	}

	public WebElement getContinueInShipping() {
		return continueInShipping;
	}

	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	private WebElement continueInShipping;

}
