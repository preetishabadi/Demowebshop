package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {

	public PaymentInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='You will pay by COD']")
	private WebElement message;

	@FindBy(xpath = "(//input[@value='Continue'])[5]")
	private WebElement ContinueInPaymentInformation;

	public WebElement getMessage() {
		return message;
	}

	public WebElement getContinueInPaymentInformation() {
		return ContinueInPaymentInformation;
	}

}
