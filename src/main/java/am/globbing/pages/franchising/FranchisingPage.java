package am.globbing.pages.franchising;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.shops.ShopsPageXpaths;

public class FranchisingPage extends GlobbingHomePage {

	public FranchisingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = FranchisingPageXpaths.FRANCHISING_LOGO)
	public WebElement franchisingLogo;
}
