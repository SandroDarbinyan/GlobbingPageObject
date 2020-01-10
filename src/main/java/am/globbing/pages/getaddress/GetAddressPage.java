package am.globbing.pages.getaddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;

public class GetAddressPage extends GlobbingHomePage{

	public GetAddressPage(WebDriver driver) {
	super(driver);
}
 
	@FindBy(xpath = GetAddressPageXpaths.PAGE_TEXT)
    public WebElement pageText;	
	
}