package am.globbing.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobbingBasePageObject {
    
	protected WebDriver driver;
	
	public GlobbingBasePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementNotPresent(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		
	}
	
	public boolean verifyElementClickable(WebElement element) {
		 try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyElementVisible(String elemXpath) {
		 try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemXpath)));
			 return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isElementPresent(String xpath) {
		if(driver.findElements(By.xpath(xpath)).size()>0) 
			 return true;
		else return false;
	}
	
	
	
	
}
