package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class expensivecomputerPage {

	public  expensivecomputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[text()='Medium  [+15.00]']")
	private WebElement Processor ;
	
	@FindBy(xpath = "//label[text()='2 GB ']")
	private WebElement RAM ;
	
	@FindBy(xpath = "//label[text()='320 GB ']")
	private WebElement HDD ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Softwares ;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Quantity ;
	
	@FindBy(xpath = "(//input[@id='add-to-cart-button-74'])")
	private WebElement AddtocartButton ;
	
	@FindBy(xpath = "//p[@class='content']")
	private WebElement Addtocartmessage ;

	public WebElement getAddtocartmessage() {
		return Addtocartmessage;
	}

	public WebElement getProcessor() {
		return Processor;
	}

	public WebElement getRAM() {
		return RAM;
	}

	public WebElement getHDD() {
		return HDD;
	}

	public WebElement getSoftwares() {
		return Softwares;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}
	
	
}
