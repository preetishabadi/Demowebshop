package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {

	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[4]")
	private WebElement Desktopsclick;
	
	@FindBy(linkText = "Notebooks")
	private WebElement Notebooksclick;
	
	@FindBy(linkText = "Accessories")
	private WebElement Accessoriesclick;

	public WebElement getDesktopsclick() {
		return Desktopsclick;
	}

	public WebElement getNotebooksclick() {
		return Notebooksclick;
	}

	public WebElement getAccessoriesclick() {
		return Accessoriesclick;
	}
}
