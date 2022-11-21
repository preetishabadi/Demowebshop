package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {

	public ConfirmOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='order-summary-body']")
	private WebElement ConfirmOrder;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement ConfirmButton;

	public WebElement getConfirmOrder() {
		return ConfirmOrder;
	}

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}

}
