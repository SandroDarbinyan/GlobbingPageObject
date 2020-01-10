package am.globbing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import am.globbing.pages.header.HeaderPage;
import am.globbing.pages.menu.MenuPage;

public class GlobbingBaseTest {

	public WebDriver driver;
	
	@BeforeClass
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://globbing.am");
		driver.manage().window().maximize();
		String title =  driver.getTitle();
	    Assert.assertEquals(title, "Globbing");
	 //Making website content to English
		HeaderPage btn = new HeaderPage(driver);
		btn = btn.contentToEnglish();
	}
	
	
	  @BeforeMethod 
	  public void prepareTest() {
		    // Step 1: Navigating to main page
		    MenuPage page = new MenuPage(driver);
			page = page.clickOnLogo();
			page.waitForElementPresent(page.menuDiv);
	  }
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
	
}
