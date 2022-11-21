package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {

	public PaymentMethodPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@checked='checked'])[2]")
	private WebElement CashOnDelivery;

	@FindBy(xpath = "(//input[@value='Continue'])[4]")
	private WebElement ContinueInPaymentMethod;

	public WebElement getCashOnDelivery() {
		return CashOnDelivery;
	}

	public WebElement getContinueInPaymentMethod() {
		return ContinueInPaymentMethod;
	}

}
