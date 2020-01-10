package am.globbing.pages.buyforme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;


public class BuyForMePage extends GlobbingHomePage{

	public BuyForMePage(WebDriver driver) {
	super(driver);
}
	
	@FindBy(xpath = BuyForMePageXpaths.PAGE_TEXT)
	public WebElement pageText;
}
