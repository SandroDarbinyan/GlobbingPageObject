package am.globbing.pages.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.pages.menu.MenuPage;

public class CalculatorPage extends MenuPage {

	public CalculatorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_WEIGHT)
	public WebElement weight;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_GB)
	public WebElement parcelFromGb;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_DE)
	public WebElement parcelFromDe;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_CN)
	public WebElement parcelFromCn;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_WEIGHT_CN)
	public WebElement weightCn;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_RU)
	public WebElement parcelFromRu;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_AE)
	public WebElement parcelFromAe;

	@FindBy(xpath = CalculatorPageXpaths.PARCEL_FROM_IT)
	public WebElement parcelFromIt;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_US)
	public WebElement priceUs;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_GB)
	public WebElement priceGb;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_DE)
	public WebElement priceDe;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_CN)
	public WebElement priceCn;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_RU)
	public WebElement priceRu;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_AE)
	public WebElement priceAe;

	@FindBy(xpath = CalculatorPageXpaths.PRICE_IT)
	public WebElement priceIt;

	@FindBy(xpath = CalculatorPageXpaths.CALC_PAGE_CLOSE)
	public WebElement calcPageClose;

	public CalculatorPage calcFunctionalityUs() throws InterruptedException {

		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityGb() throws InterruptedException {

		parcelFromGb.click();
		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityDe() throws InterruptedException {

		parcelFromDe.click();
		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityCn() throws InterruptedException {

		parcelFromCn.click();
		weightCn.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityRu() throws InterruptedException {

		parcelFromRu.click();
		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityAe() throws InterruptedException {

		parcelFromAe.click();
		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

	public CalculatorPage calcFunctionalityIt() throws InterruptedException {

		parcelFromIt.click();
		weight.sendKeys("1");
		return new CalculatorPage(driver);

	}

}
