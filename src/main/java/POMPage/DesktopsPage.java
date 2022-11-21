package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {

	public  DesktopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement SortBy ;
	
	public WebElement getSortBy() {
		return SortBy;
	}

	@FindBy(id = "products-pagesize")
	private WebElement DisplayPerPage ;
	
	public WebElement getDisplayPerPage() {
		return DisplayPerPage;
	}

	@FindBy(id = "products-viewmode")
	private WebElement ViewAs ;
	
	public WebElement getViewAs() {
		return ViewAs;
	}

	@FindBy(linkText = "Build your own expensive computer")
	private WebElement computerclick ;

	public WebElement getComputerclick() {
		return computerclick;
	}
}
