package am.globbing.pages.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;


public class ContactUsPage extends GlobbingHomePage {

	 public ContactUsPage(WebDriver driver) {
	  super(driver);
	 }
	 
	 @FindBy(xpath = ContactUsPageXpaths.CONTACT_TEXT)
	 public WebElement contactText;
	 
}
