package Tests;

import org.testng.annotations.Test;
import POMPage.loginPage;
import generic_Library.BasePage;

public class LoginTest extends BasePage {
	@Test
	public void login() {
		loginPage login = new loginPage(driver);
		login.getLoginLink().click();
		login.getEmailId().sendKeys("lalipreeti9@gmail.com");
		login.getPassword().sendKeys("Preeti@123");
		login.getRememberCheckbox().click();
		login.getLoginButton().click();
	}
}
