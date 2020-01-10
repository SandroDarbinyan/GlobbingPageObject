package am.globbing.menu;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.base.GlobbingBaseTest;
import am.globbing.pages.aboutus.AboutUsPage;
import am.globbing.pages.blog.BlogPage;
import am.globbing.pages.bussiness.BussinesPage;
import am.globbing.pages.buyforme.BuyForMePage;
import am.globbing.pages.calculator.CalculatorPage;
import am.globbing.pages.contactus.ContactUsPage;
import am.globbing.pages.franchising.FranchisingPage;
import am.globbing.pages.getaddress.GetAddressPage;
import am.globbing.pages.menu.MenuPage;
import am.globbing.pages.services.ServicesPage;
import am.globbing.pages.shops.ShopsPage;
import am.globbing.pages.shops.ShopsPageXpaths;

public class GlobbingMenuPageTest extends GlobbingBaseTest {
	// Test Case ID: 4
	// Test Case Description: Web Site Logo Checking
	@Test
	public void logoFunctionalityTest() throws InterruptedException {
		// Step 1:
		MenuPage page = new MenuPage(driver);
		page = page.clickOnLogo();
		Assert.assertTrue(page.logo.isDisplayed());
		// page.verifyElementClickable(page.logo);
		// Expected result:Main page of site is reloaded
	}

	// Test Case ID: 5
	// Test Case Description: About Us link checking
	@Test
	public void aboutUsLinkTest() throws InterruptedException {
		MenuPage btn = new MenuPage(driver);
		AboutUsPage page = btn.aboutUsLink();
		page.waitForElementPresent(page.textAboutUs);
		// Expected result: New page is openned telling about the company
		Assert.assertTrue(page.textAboutUs.isDisplayed());
	}

	// Test Case ID: 6
	// Test Case Description: Contact Us link checking
	@Test
	public void contactUsLinkTest() {
		MenuPage btn = new MenuPage(driver);
		ContactUsPage page = btn.contactUsLink();
		// Expected result: New page is openned with contact form
		Assert.assertTrue(page.contactText.isDisplayed());
	}

	// Test Case ID: 7
	// Test Case Description: Blog link checking
	@Test
	public void blogLinkTest() throws InterruptedException {
		MenuPage btn = new MenuPage(driver);
		BlogPage page = btn.blogLink();
		// Expected result:New page is openned with GlobbinBlog logo //
		// Assert.assertTrue(page.blogLogo.isDisplayed());
		page.verifyElementClickable(page.blogLogo);
		driver.navigate().back();

	}

	// Test Case ID: 8
	// Test Case Description: Buy for me link checking
	@Test
	public void buyForMeLinkTest() {
		MenuPage btn = new MenuPage(driver);
		BuyForMePage page = btn.buyForMeLink();
		// Expected result: New page is openned containing "Let Globbing buy products
		// for you" text
		Assert.assertTrue(page.pageText.isDisplayed());

	}

	// Test Case ID: 9
	// Test Case Description: Buy for me link checking
	@Test
	public void getAddressLinkTest() throws InterruptedException {
		MenuPage btn = new MenuPage(driver);
		GetAddressPage page = btn.getAddressLink();
		// Expected result: New page is openned containing "Shop Online and Receive Your Packages in Armenia" text
	    Assert.assertTrue(page.pageText.isDisplayed());
	

	}

	// Test Case ID: 10
	// Test Case Description: Services link checking
	@Test
	public void servicesLinkTest() throws InterruptedException {
		MenuPage btn = new MenuPage(driver);
		ServicesPage page = btn.servicesLink();
		page.waitForElementPresent(page.pageText);
		// Expected result: New page is openned containing "Globbing Services" text
		Assert.assertTrue(page.pageText.isDisplayed());
		}
	
	
	// Test Case ID: 11
	// Test Case Description: Shops link Checking link checking
	@Test
	public void shopsLinkTest() {
		MenuPage btn = new MenuPage(driver);
		ShopsPage shopsPage = btn.shopsLink();
		// Expected result: New page is openned containing  links to different shops
		shopsPage.verifyElementClickable(shopsPage.cashBackShop);
	}



	// Test Case ID: 12
	// Test Case Description: Business link checking
	@Test
	public void businessLinkTest() { 
		MenuPage btn = new MenuPage(driver);  
		BussinesPage businessPage = btn.businessLink(); 
		// Expected result: New page is openned containing  links to different shops
		businessPage.verifyElementVisible(ShopsPageXpaths.CASHBACK_SHOPS);
	}
	
	
	// Test Case ID: 13
	// Test Case Description: Franchising link checking
	@Test (priority = 1)
	public void franchisingLinkTest() throws InterruptedException {
		MenuPage page = new MenuPage(driver);
		FranchisingPage franchisingPage = page.franchisingLink();
		// Expected result: New page is opened in a new window containing Globbing Franchising logo
		franchisingPage.verifyElementClickable(franchisingPage.franchisingLogo);
	
	}
	
	
	// Test Case ID: 14
	// Test Case Description: Calculator link checking
	@Test
	public void calculatorLinkTest() {
		MenuPage page = new MenuPage(driver);
		CalculatorPage calculatorPage = page.calculatorLink();
		// Expected result: New window is openned with calculator
		calculatorPage.verifyElementClickable(calculatorPage.weight);
		calculatorPage.calcPageClose.click();
		
		
	}

}





	
	
	

