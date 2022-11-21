package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {


	public  ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shopping ;

	public WebElement getShopping() {
		return shopping;
	}
	
	@FindBy(id="CountryId")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement India;

	public WebElement getIndia() {
		return India;
	}
	
	@FindBy(id="termsofservice")
	private WebElement terms;
	
	@FindBy(id="checkout")
	private WebElement checkout;

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
}
