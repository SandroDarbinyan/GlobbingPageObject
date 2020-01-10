package am.globbing.pages.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.login.LoginPage;
import am.globbing.pages.register.RegisterPage;

public class HeaderPage extends GlobbingHomePage{
 
	public HeaderPage(WebDriver driver) {
	 super(driver);
	 }
		@FindBy(xpath = HeaderPageXpaths.LANGUAGE_SWITCHER_XPATH)
		 WebElement langSwitcher;
		
		@FindBy(xpath = HeaderPageXpaths.ENGLISH_SWITCHER_XPATH)
		 WebElement engSwitcher;
		
		@FindBy(xpath = HeaderPageXpaths.RUSSIAN_SWITCHER_XPATH)
		WebElement rusSwitcher;
		
		@FindBy(xpath = HeaderPageXpaths.LOGIN_BTN)
		public WebElement login;
		
		@FindBy(xpath = HeaderPageXpaths.REGISTER_BTN)
		public WebElement register;
		
		@FindBy(xpath = HeaderPageXpaths.RUS_LOGIN_BTN)
		public WebElement rusLogin;
		
		public HeaderPage contentToEnglish() {
			langSwitcher.click();
			engSwitcher.click();
			return new HeaderPage(driver);
		}
		
		public HeaderPage contentToRussian() {
			langSwitcher.click();
			rusSwitcher.click();
			return new HeaderPage(driver);
		}
		
		
		public LoginPage goToLoginPage() {
			login.click();
			return new LoginPage(driver);
		}
		
		
		public RegisterPage goToRegisterPage() {
			register.click();
			return new RegisterPage(driver);
		}
		
		
	 
 
}
