package Tests;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMPage.ComputerPage;
import POMPage.ConfirmOrderPage;
import POMPage.DesktopsPage;
import POMPage.HomePage;
import POMPage.PaymentInformationPage;
import POMPage.PaymentMethodPage;
import POMPage.RegisterPage;
import POMPage.ShippingAddressPage;
import POMPage.ShoppingCartPage;
import POMPage.ThankYouPage;
import POMPage.checkoutPage;
import POMPage.expensivecomputerPage;
import POMPage.loginPage;
import generic_Library.BasePage;

public class ComputerPageTest extends BasePage{

		@Test(priority = 1)
		public void login() throws InterruptedException {

			loginPage login = new loginPage(driver);
			login.getLoginLink().click();
			Reporter.log("Clicked on login link");

			login.getEmailId().sendKeys("lalipreeti9@gmail.com");
			assertTrue(login.getEmailId().isDisplayed(), "Email id is not entered");
			Reporter.log("entered user name");

			login.getPassword().sendKeys("PreetiLali@123");
			assertTrue(login.getPassword().isDisplayed(), "Password is not entered");
			Reporter.log("entered password");

			login.getLoginButton().click();
			Reporter.log("Clicked on login button");
		}

		@Test(priority = 2)
		public void HomeExecution() {
			HomePage home = new HomePage(driver);
			home.getComputerclick().click();
			Reporter.log("Clicked on computer button");
		}

		@Test(priority = 3)
		public void ComputerExecution() {
			ComputerPage computer = new ComputerPage(driver);
			computer.getDesktopsclick().click();
			Reporter.log("Clicked on Desktops link");
		}

		@Test(priority = 4)
		public void DesktopsExecution() {
			DesktopsPage desktop = new DesktopsPage(driver);
			assertTrue(desktop.getSortBy().isDisplayed(), "By default Sort By dropdown is not selected as position ");
			Reporter.log("By default sortby dropdown is selected as Position");

			assertTrue(desktop.getDisplayPerPage().isDisplayed(),
					"By default DisplayperPage dropdown is not selected as 8");
			Reporter.log("By default DisplayperPage dropdown is selected as 8");

			assertTrue(desktop.getViewAs().isDisplayed(), "By default view as dropdown is not selected as grid");
			Reporter.log("By default view as dropdown is selected as grid");

			desktop.getComputerclick().click();
			Reporter.log("Clicked on Expensive computer link");
		}

		@Test(priority = 5)
		public void ExpensiveComputerExecution() throws InterruptedException {
			expensivecomputerPage expensive = new expensivecomputerPage(driver);
			assertTrue(expensive.getProcessor().isDisplayed(), "Processor is not selected");
			Reporter.log("By default processor is selected as Medium");

			assertTrue(expensive.getHDD().isDisplayed(), "By default HDD is not selected as 320GB");
			Reporter.log("By default HDD is selected as 320GB");

			assertTrue(expensive.getRAM().isDisplayed(), "By default RAM is not selected as 2GB");
			Reporter.log("By default RAM is selected as 2GB");

			expensive.getSoftwares().click();
			Reporter.log("Clicked on Image viewer");
			assertTrue(expensive.getSoftwares().isDisplayed(),
					"By default software is not selected as Image Viewer [+5.00]");

			assertTrue(expensive.getQuantity().isDisplayed(), "By default quality is 1");
			Reporter.log("By default quality should be 1");

			expensive.getAddtocartButton().click();
			Reporter.log("Clicked on Add to cart button in expensive computer");
			Thread.sleep(10000);
		}

		@Test(priority = 6)
		public void ShoppingCartExecution() throws InterruptedException {
			ShoppingCartPage cart = new ShoppingCartPage(driver);
			cart.getShopping().click();
			Reporter.log("Clicked on Shopping cart link");

			cart.getCountry().click();
			cart.getIndia().click();
			Thread.sleep(5000);
			Reporter.log("Clicked on country dropdown and selected India");

			cart.getTerms().click();
			Reporter.log("Clicked on Terms and condition checkbox");

			cart.getCheckout().click();
			Reporter.log("Clicked on checkout button");
		}

		@Test(priority = 7)
		public void CheckoutExecution() throws InterruptedException {
			checkoutPage checkout = new checkoutPage(driver);
			Select drop = new Select(checkout.getBillingDropdown());
			drop.selectByVisibleText("New Address");
			Reporter.log("Selected New address in billing address dropdown");

			checkout.getFirstName().clear();
			checkout.getFirstName().sendKeys("pradeep");
			Reporter.log("Entered First Name in FirstName textfield");

			checkout.getLasttName().clear();
			checkout.getLasttName().sendKeys("lali");
			Reporter.log("Entered Last Name in LastName textfield");

			checkout.getEmail().clear();
			checkout.getEmail().sendKeys("lalipreeti9@gmail.com");
			Reporter.log("Entered Email in Email textfield");

			checkout.getCountry().click();
			checkout.getIndia().click();
			Reporter.log("Clicked on country dropdown and selected India");

			checkout.getCity().sendKeys("Bangalore");
			Reporter.log("Entered City in City textfield");

			checkout.getAddress().sendKeys("Katriguppe");
			Reporter.log("Entered Address in Address textfield");

			checkout.getZipCode().sendKeys("560085");
			Reporter.log("Entered ZipCode in ZipCode textfield");

			checkout.getPhoneNumber().sendKeys("9958457852");
			Reporter.log("Entered Phone Number in Phone Number textfield");

			checkout.getContinueButtonInBilling().click();
			Reporter.log("Clicked on Continue button in billing address");

			ShippingAddressPage shipping = new ShippingAddressPage(driver);
			Reporter.log("By default shipping address is displayed");

			shipping.getPickUpInStore().click();
			Reporter.log("Clicked on In pickup checkbox");

			shipping.getContinueInShipping().click();
			Reporter.log("Clicked on Continue button in shipping address");

			PaymentMethodPage payment = new PaymentMethodPage(driver);
			payment.getContinueInPaymentMethod().click();

			PaymentInformationPage Information = new PaymentInformationPage(driver);
			assertTrue(Information.getMessage().isDisplayed(), "You will pay by COD message is not displayed");
			Reporter.log("You will pay by COD message is displayed");

			Information.getContinueInPaymentInformation().click();
			Reporter.log("Clicked on Continue button in Payment Information Page");

			ConfirmOrderPage confirm = new ConfirmOrderPage(driver);
			assertTrue(confirm.getConfirmOrder().isDisplayed(), "By default order summary is not displayed");
			Reporter.log("By default order summary is displayed");

			confirm.getConfirmButton().click();
			Reporter.log("Clicked on Confirm Button in Confirm Order Page");

			ThankYouPage thankyou = new ThankYouPage(driver);
			Thread.sleep(5000);
			thankyou.getContinueInThankYou().click();
			Reporter.log("Clicked on Continue button in ThankYou Page");
		}
	}

