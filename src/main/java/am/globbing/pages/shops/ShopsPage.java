package am.globbing.pages.shops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;

public class ShopsPage extends GlobbingHomePage {

	public ShopsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ShopsPageXpaths.CASHBACK_SHOPS)
	public WebElement cashBackShop;

}