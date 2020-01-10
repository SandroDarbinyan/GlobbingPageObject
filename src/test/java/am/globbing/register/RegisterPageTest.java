package am.globbing.register;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.base.GlobbingBaseTest;
import am.globbing.pages.member.GlobbingMemberPage;
import am.globbing.pages.register.RegisterPage;

public class RegisterPageTest extends GlobbingBaseTest {

	// Test Case ID: 22
	// Test Case Description: Register with correct input values
	@Test
	public void registerTest1() throws InterruptedException {

		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "qwerty@gmail.com", "qwerty11", "qwerty11", "54655465");
		page.verifyElementClickable(GlobbingMemberPage.signOut);

		// This step has been added to ensure sequential execution of the next tests
		GlobbingMemberPage page2 = new GlobbingMemberPage(driver);
		page2.waitForElementPresent(GlobbingMemberPage.signOut);
		page2.signOut();
		Thread.sleep(3000);

	}

	// Test Case ID: 23
	// Test Case Description: Register without email address
	@Test
	public void registerTest2() throws InterruptedException {

		RegisterPage page = new RegisterPage(driver);
		page.register("", "qwerty11", "qwerty11", "54655465");
		Assert.assertFalse(page.verifyElementClickable(GlobbingMemberPage.signOut));
		Thread.sleep(1000);

	}

	// Test Case ID: 24
	// Test Case Description: Register with registered email address
	@Test
	public void registerTest3() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		page.register("darbinyan123@mail.ru", "qwerty11", "qwerty11", "54655465");
		Assert.assertFalse(page.verifyElementClickable(GlobbingMemberPage.signOut));
		Thread.sleep(1000);
	}

	// Test Case ID: 25
	// Test Case Description: Register with uncorrect email address_1
	@Test
	public void registerTest4() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		page.register("globbing.ru", "qwerty11", "qwerty11", "54655465");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 26
	// Test Case Description: Register with another incorrect type of email_2
	@Test
	public void registerTest5() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		page.register("@mail.ru", "qwerty11", "qwerty11", "54655465");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 27
	// Test Case Description: Register with another incorrect type of email_3
	@Test
	public void registerTest6() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		page.register("հայաստան@mail.ru", "qwerty11", "qwerty11", "54655465");
		Thread.sleep(1000);
		Assert.assertTrue(page.addText.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 28
	// Test Case Description: Register without password
	@Test
	public void registerTest7() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "@globbing.ru", "", "qwerty11", "54655465");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 29
	// Test Case Description: Register with another incorrect type of email_4
	@Test
	public void registerTest8() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "(^^%//@$$@mail.ru", "qwerty11", "qwerty11", "54655465");
		Thread.sleep(2000);
		Assert.assertTrue(page.addText.isDisplayed());
		
		
		// This step has been added to ensure sequential execution of the next tests
		GlobbingMemberPage page2 = new GlobbingMemberPage(driver);
		page2.waitForElementPresent(GlobbingMemberPage.signOut);
		page2.signOut();
		Thread.sleep(3000);

	}

	// Test Case ID: 30
		// Test Case Description: Register with incorrect password
		@Test
		public void bregisterTest9() throws InterruptedException {
			RegisterPage page = new RegisterPage(driver);
			int rand = ThreadLocalRandom.current().nextInt(100, 1000);
			page.register(rand + "moeaill@mail.ru", "հայաստան1221", "հայաստան1221", "55555");
			Thread.sleep(1000);
			Assert.assertTrue(page.registerBtn.isDisplayed());
			
			
			// This step has been added to ensure sequential execution of the next tests
			GlobbingMemberPage page2 = new GlobbingMemberPage(driver);
			page2.waitForElementPresent(GlobbingMemberPage.signOut);
			page2.signOut();
			Thread.sleep(5000);

			
		}
		

	// Test Case ID: 31
	// Test Case Description: Register with invalid password
	@Test
	public void aregisterTest10() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maill@mail.ru", "1", "1", "54655465");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 32
	// Test Case Description: Register with not matching passwords
	@Test
	public void registerTest11() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maill@mail.ru", "546131", "2121", "54655465");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 33
	// Test Case Description: Register without phone number
	@Test
	public void registerTest12() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maiill@mail.ru", "451245", "451245", "");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 34
	// Test Case Description: Register with empty phone number_1
	@Test
	public void registerTest13() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maill@mail.ru", "45454545", "45454545", "");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 35
	// Test Case Description: Register with incorrect phone number
	@Test
	public void registerTest14() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maill@mail.ru", "45454545", "45454545", "qwerty");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 36
	// Test Case Description: Register with incorrect phone number_2 (which contains
	// 1 numbers)
	@Test
	public void registerTest15() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maaill@mail.ru", "45454545", "45454545", "1");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 37
	// Test Case Description: Register with incorrect phone number_3 (which contains
	// 2 numbers)
	@Test
	public void registerTest16() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maaill@mail.ru", "45454545", "45454545", "22");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 38
	// Test Case Description: Register with incorrect phone number_4 (which contains
	// 3 numbers)
	@Test
	public void registerTest17() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maaaill@mail.ru", "45454545", "45454545", "333");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 39
	// Test Case Description: Register with incorrect phone number_5 (which contains
	// 4 numbers)
	@Test
	public void registerTest18() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "maeaill@mail.ru", "45454545", "45454545", "4444");
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}

	// Test Case ID: 40
	// Test Case Description: Register with incorrect phone number_6 (which contains
	// 4 numbers)
	@Test
	public void registerTest19() throws InterruptedException {
		RegisterPage page = new RegisterPage(driver);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.register(rand + "meeaill@mail.ru", "45454545", "45454545", "55555");
		Thread.sleep(1000);
		Assert.assertTrue(page.registerBtn.isDisplayed());
		Thread.sleep(1000);
	}
	
	
	
	
	

}
