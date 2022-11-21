package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	
	public checkoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='billing-address-select']")
	private WebElement billingDropdown;
	
	public WebElement getBillingDropdown() {
		return billingDropdown;
	}

	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
	private WebElement Email;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement country;
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement India;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	private WebElement City;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement ZipCode;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "(//input[@title='Continue'])[1]")
	private WebElement ContinueButtonInBilling;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLasttName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getIndia() {
		return India;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getContinueButtonInBilling() {
		return ContinueButtonInBilling;
	}
}
