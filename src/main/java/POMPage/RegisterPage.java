package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;

	@FindBy(id = "gender-female")
	private WebElement Gender;

	@FindBy(id = "FirstName")
	private WebElement firstname;

	@FindBy(id = "LastName")
	private WebElement LastName;

	@FindBy(id = "Email")
	private WebElement Email;

	@FindBy(id = "Password")
	private WebElement Password;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword;

	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	
	
}
