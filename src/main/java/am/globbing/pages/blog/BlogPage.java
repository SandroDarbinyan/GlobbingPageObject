package am.globbing.pages.blog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.home.GlobbingHomePage;


public class BlogPage extends GlobbingHomePage {
	public BlogPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = BlogPageXpaths.BLOG_LOGO)
	public WebElement blogLogo;

}
