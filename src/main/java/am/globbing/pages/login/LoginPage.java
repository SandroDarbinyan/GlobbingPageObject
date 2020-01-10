package am.globbing.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.base.GlobbingBasePageObject;
import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.member.GlobbingMemberPage;
import am.globbing.pages.register.RegisterPageXpaths;

public class LoginPage extends GlobbingHomePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = LoginPageXpaths.EMAIL_INPUT_FIELD)
	public WebElement emailInputField;

	@FindBy(xpath = LoginPageXpaths.PASSWORD_INPUT_FIELD)
	WebElement passwordInputField;

	@FindBy(xpath = LoginPageXpaths.LOGIN_BTN)
	WebElement loginBtn;

	/*
	 * @FindBy(xpath = RegisterPageXpaths.SIGN_OUT) WebElement signOut;
	 */
	public LoginPage fillEmail(String email) {
		emailInputField.sendKeys(email);
		return new LoginPage(driver);
	}

	public LoginPage fillPassword(String password) {
		passwordInputField.sendKeys(password);
		return new LoginPage(driver);
	}

	public GlobbingBasePageObject clickOnLoginBtn() {
		loginBtn.click();
		return new GlobbingBasePageObject(driver);
	}

	/*
	 * private boolean isElementPresent() {
	 * 
	 * try { if (signOut.isDisplayed()) { return true; } else { throw new
	 * Exception(); } } catch (Exception e) { return true; }
	 * 
	 * }
	 */
	
	
	public GlobbingBasePageObject login(String email, String password) throws InterruptedException {
		fillEmail(email);
		fillPassword(password);
		clickOnLoginBtn();
		Thread.sleep(3000);
	//	if(isElementPresent()) {
			return new GlobbingMemberPage(driver);
	//	} else {return new GlobbingHomePage(driver);}
	}

}
