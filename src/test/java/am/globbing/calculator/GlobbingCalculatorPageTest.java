package am.globbing.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.base.GlobbingBaseTest;
import am.globbing.pages.calculator.CalculatorPage;
import am.globbing.pages.menu.MenuPage;

public class GlobbingCalculatorPageTest extends GlobbingBaseTest {

	// Test Case ID: 15
	// Test Case Description: Calculator functionality checking for parcel from US
	@Test
	public void calcFunctionalityUsTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityUs();
		Assert.assertEquals(calculator.priceUs.getText(), "4000");
		calculator.calcPageClose.click();
		// Expected result: Shipping cost must be "4000"
	}

	// Test Case ID: 16
	// Test Case Description: Calculator functionality checking for parcel from
	// Great Britain
	@Test
	public void calcFunctionalityGbTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityGb();
		Assert.assertEquals(calculator.priceGb.getText(), "4000");
		// Expected result: Shipping cost must be "4000"
		calculator.calcPageClose.click();
		// Expected result: Calculator window should be closed
	}

	// Test Case ID: 17
	// Test Case Description: Calculator functionality checking for parcel from
	// Germany
	@Test
	public void calcFunctionalityDeTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityDe();
		Assert.assertEquals(calculator.priceDe.getText(), "5000");
		// Expected result: Shipping cost must be "5000"
		calculator.calcPageClose.click();
	}

	// Test Case ID: 18
	// Test Case Description: Calculator functionality checking for parcel from
	// China
	@Test
	public void calcFunctionalityCnTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weightCn);
		calculator.calcFunctionalityCn();
		Assert.assertEquals(calculator.priceCn.getText(), "4500");
		// Expected result: Shipping cost must be "4500"
		calculator.calcPageClose.click();
	}

	// Test Case ID: 19
	// Test Case Description: Calculator functionality checking for parcel from
	// Russia
	@Test
	public void calcFunctionalityRuTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityRu();
		Assert.assertEquals(calculator.priceRu.getText(), "2000");
		// Expected result: Shipping cost must be "2000"
		calculator.calcPageClose.click();
	}

	// Test Case ID: 20
	// Test Case Description: Calculator functionality checking for parcel from UAE
	@Test
	public void calcFunctionalityAeTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityAe();
		Assert.assertEquals(calculator.priceAe.getText(), "4000");
		// Expected result: Shipping cost must be "4000"
		calculator.calcPageClose.click();
	}

	// Test Case ID: 21
	// Test Case Description: Calculator functionality checking for parcel from Italy
	@Test
	public void calcFunctionalityItTest() throws InterruptedException {
		MenuPage calcBtn = new MenuPage(driver);
		CalculatorPage calculator = calcBtn.calculatorLink();
		calculator.waitForElementPresent(calculator.weight);
		calculator.calcFunctionalityIt();
		Assert.assertEquals(calculator.priceIt.getText(), "4000");
		// Expected result: Shipping cost must be "4000"
		calculator.calcPageClose.click();
	}

}
