package am.globbing.pages.aboutus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;


public class AboutUsPage extends GlobbingHomePage {
	
	public AboutUsPage(WebDriver driver) {
	 super(driver);
	}
	
	@FindBy(xpath = AboutUsPageXpaths.ABOUT_US_TEXT)
	public WebElement textAboutUs;

}
