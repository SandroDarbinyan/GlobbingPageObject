package am.globbing.pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.aboutus.AboutUsPage;
import am.globbing.pages.blog.BlogPage;
import am.globbing.pages.bussiness.BussinesPage;
import am.globbing.pages.buyforme.BuyForMePage;
import am.globbing.pages.calculator.CalculatorPage;
import am.globbing.pages.contactus.ContactUsPage;
import am.globbing.pages.franchising.FranchisingPage;
import am.globbing.pages.getaddress.GetAddressPage;
import am.globbing.pages.home.GlobbingHomePage;
import am.globbing.pages.services.ServicesPage;
import am.globbing.pages.shops.ShopsPage;

public class MenuPage extends GlobbingHomePage{

	public MenuPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = MenuPageXpaths.LOGO_XPATH)
	public static  WebElement logo;
	
	@FindBy(xpath = MenuPageXpaths.MENU_BLOK)
    public  WebElement menuDiv;
	
	@FindBy(xpath = MenuPageXpaths.ABOUT_US_MAIN)
	WebElement aboutUsMain;
	
	@FindBy(xpath = MenuPageXpaths.ABOUT_US)
	WebElement aboutUs;
	
	@FindBy(xpath = MenuPageXpaths.CONTACT_US)
	WebElement contactUs;
	
	@FindBy(xpath = MenuPageXpaths.SERVICES_MAIN)
	WebElement servicesMain;
	
	@FindBy(xpath = MenuPageXpaths.BLOG)
	WebElement blog;
	
	@FindBy(xpath = MenuPageXpaths.BUY_FOR_ME)
	WebElement buyForMe;
	
	@FindBy(xpath = MenuPageXpaths.GET_ADDRESS)
	WebElement getAddress;
	
	@FindBy(xpath = MenuPageXpaths.SERVICES)
	WebElement services;
	
	@FindBy(xpath = MenuPageXpaths.SHOPS)
	WebElement shops;
	
	@FindBy(xpath = MenuPageXpaths.SHOPS)
	WebElement business;
	
	@FindBy(xpath = MenuPageXpaths.FRANCHISING)
	WebElement franchising;
	
	@FindBy(xpath = MenuPageXpaths.CALCULATOR_LINK)
    WebElement calculator;
	
	
	public MenuPage clickOnLogo() {
		
		logo.click();
		return new MenuPage(driver);
	}
	
	
	public AboutUsPage aboutUsLink() {
		
		aboutUsMain.click();
		aboutUs.click();
		return new AboutUsPage(driver);
	}
	
	public ContactUsPage contactUsLink() {
	    
		aboutUsMain.click();
		contactUs.click();
		return new ContactUsPage(driver);
	}
	
	public BlogPage blogLink() {
		
		aboutUsMain.click();
		blog.click();
		return new BlogPage(driver);
	}
	
	public BuyForMePage buyForMeLink() {
		
		servicesMain.click();
		buyForMe.click();
		return new BuyForMePage(driver);
	}
	
	public GetAddressPage getAddressLink() {
		
		servicesMain.click();
		getAddress.click();
		return new GetAddressPage(driver);
	}
	
	
	public ServicesPage servicesLink() {
		
		servicesMain.click();
		services.click();
		return new ServicesPage(driver);
	}
	
	public ShopsPage shopsLink() {
		
		shops.click();
		return new ShopsPage(driver);
	}
	
	public BussinesPage businessLink() {
		
		business.click();
		return new BussinesPage(driver);
		
	}
	
	public FranchisingPage franchisingLink() {
		
		franchising.click();
		return new FranchisingPage(driver);
	}
	
	public CalculatorPage calculatorLink() {
		calculator.click();
		return new CalculatorPage(driver);
	}
	

}
