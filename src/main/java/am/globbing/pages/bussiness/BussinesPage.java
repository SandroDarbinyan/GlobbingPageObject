package am.globbing.pages.bussiness;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.shops.ShopsPageXpaths;


public class BussinesPage extends GlobbingHomePage{

	public BussinesPage(WebDriver driver) {
	super(driver);
}
	
	@FindBy(xpath = ShopsPageXpaths.CASHBACK_SHOPS)
	public WebElement cashBackShop;
}