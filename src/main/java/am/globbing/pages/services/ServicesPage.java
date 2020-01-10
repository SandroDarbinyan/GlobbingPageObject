package am.globbing.pages.services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;

public class ServicesPage extends GlobbingHomePage{

	public ServicesPage(WebDriver driver) {
	super(driver);
}
	@FindBy(xpath = ServicesPageXpaths.PAGE_TEXT)
	public WebElement pageText; 
	
}