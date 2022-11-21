package Tests;

import org.testng.annotations.Test;

import POMPage.RegisterPage;
import POMPage.loginPage;
import generic_Library.BasePage;

public class RegisterTest extends BasePage {
	@Test
	public void register() {
		
		RegisterPage page = new RegisterPage(driver);
		page.getRegisterLink().click();
		page.getGender().click();
		page.getFirstname().sendKeys("pradeep");
		page.getLastName().sendKeys("shabadi");
		page.getEmail().sendKeys("lalipreeti9@gmail.com");
		page.getPassword().sendKeys("PreetiLali@123");
		page.getConfirmPassword().sendKeys("PreetiLali@123");
		page.getRegisterbutton().click();
	}
}
