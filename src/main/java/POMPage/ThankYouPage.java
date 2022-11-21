package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
	public ThankYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(text(),'Order number: 1320663')]")
	private WebElement Ordernumber;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueInThankYou;

	public WebElement getOrdernumber() {
		return Ordernumber;
	}

	public WebElement getContinueInThankYou() {
		return ContinueInThankYou;
	}
}
