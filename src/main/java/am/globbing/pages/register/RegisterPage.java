package am.globbing.pages.register;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.base.GlobbingBasePageObject;
import am.globbing.pages.header.HeaderPage;
import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.member.GlobbingMemberPage;
import am.globbing.pages.member.GlobbingMemberPageXpaths;

public class RegisterPage extends GlobbingHomePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = RegisterPageXpaths.EMAIL)
	WebElement emailInputField;

	@FindBy(xpath = RegisterPageXpaths.PASSWORD)
	WebElement passInputField;

	@FindBy(xpath = RegisterPageXpaths.CONFIRM_PASSWORD)
	WebElement confirmPassword;

	@FindBy(xpath = RegisterPageXpaths.PHONE)
	WebElement phoneInputField;

	@FindBy(xpath = RegisterPageXpaths.AGREE_BUTTON)
	public WebElement agreeBtn;


	@FindBy(xpath = RegisterPageXpaths.REG_SUBMIT)
	public WebElement registerBtn;

	@FindBy(xpath = RegisterPageXpaths.I_AM_COSTUMER)
	public WebElement costumer;
	
	@FindBy(xpath = RegisterPageXpaths.ADDITIONAL_TEXT)
	public WebElement addText;
	

	public RegisterPage fillEmail(String email) {
		emailInputField.sendKeys(email);
		return new RegisterPage(driver);
	}

	public RegisterPage fillPassword(String password) {
		passInputField.sendKeys(password);
		return new RegisterPage(driver);
	}

	public RegisterPage confirmPassword(String password) {
		confirmPassword.sendKeys(password);
		return new RegisterPage(driver);
	}

	public RegisterPage fillPhoneNumber(String number) {
		phoneInputField.sendKeys(number);
		return new RegisterPage(driver);
	}

	public RegisterPage clickAgree() {
		agreeBtn.click();
		return new RegisterPage(driver);
	}

	public GlobbingBasePageObject clickOnRegisterBtn() {
		registerBtn.click();
		return new GlobbingBasePageObject(driver);
	}

	/*
	 * private boolean isSignOutPresent() {
	 * 
	 * 
	 * 
	 * 
	 * if(GlobbingMemberPage.signOut.isDisplayed()) { return true; }else {return
	 * false;}
	 * 
	 * 
	 * }
	 */

	public GlobbingBasePageObject register(String email, String password, String confPassword, String number) {
		HeaderPage btn = new HeaderPage(driver);
		RegisterPage page = btn.goToRegisterPage();
		fillEmail(email);
		fillPassword(password);
		confirmPassword(confPassword);
		fillPhoneNumber(number);
		clickAgree();
		registerBtn.click();
	//	waitForElementPresent(signOut);
		if (isElementPresent(GlobbingMemberPageXpaths.SIGN_OUT)) {
			return new GlobbingMemberPage(driver);
		} else {
			return new RegisterPage(driver);
		}
	}

}
