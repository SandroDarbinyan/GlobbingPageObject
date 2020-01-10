package am.globbing.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.login.LoginPage;
import am.globbing.pages.register.RegisterPage;

public class GlobbingMemberPage extends LoginPage {
	
	public GlobbingMemberPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = GlobbingMemberPageXpaths.SIGN_OUT)
	public static WebElement signOut;
	
	public RegisterPage signOut() {
		
		signOut.click();
		return new RegisterPage(driver);
	}

}
