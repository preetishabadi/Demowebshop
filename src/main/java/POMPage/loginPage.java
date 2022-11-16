package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement LoginLink;

	@FindBy(id = "Email")
	private WebElement EmailId;

	@FindBy(id = "Password")
	private WebElement Password;

	@FindBy(id = "RememberMe")
	private WebElement rememberCheckbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRememberCheckbox() {
		return rememberCheckbox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
