package am.globbing.header;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.base.GlobbingBaseTest;
import am.globbing.pages.header.HeaderPage;
import am.globbing.pages.login.LoginPage;
import am.globbing.pages.register.RegisterPage;

public class GlobbingHeaderPageTest extends GlobbingBaseTest {

	// Test Case ID: 1
	// Test Case Description: Making Web Site content to Russian
	@Test
	public void rusLangSwitcherTest() {
		// STEP:1
		HeaderPage home = new HeaderPage(driver);
		home = home.contentToRussian();
		home.verifyElementClickable(home.rusLogin);
		// Expected result: Web page content became to Russian
	}

	// Test Case ID: 2
	// Test Case Description: Login button functionality checking
	@Test
	public void goToLoginPageTest() {
		// STEP: 1
		HeaderPage page4 = new HeaderPage(driver);
		LoginPage logPage1 = page4.goToLoginPage();
		Assert.assertTrue(logPage1.emailInputField.isDisplayed());
		// Expected result: Login window is openned in home page

	}

	// Test Case ID: 3
	// Test Case Description: Register button functionality checking
	@Test
	public void goToRegisterPageTest() {
		// STEP: 1
		HeaderPage page = new HeaderPage(driver);
		RegisterPage regPage = page.goToRegisterPage();
		regPage.verifyElementClickable(regPage.agreeBtn);
		// Expected result: New page is openned with registration form

	}
}
