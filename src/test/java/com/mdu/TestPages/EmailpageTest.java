package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mdu.Base.Base;
import com.mdu.Pages.EmailPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Switch;
import com.mdu.Utitlies.Utility;

public class EmailpageTest extends Base {
	public HomePage hpage;
	public EmailPage epage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		epage = new EmailPage();
		init();
		hpage = new HomePage();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		epage = hpage.emailDirectoryLink();
	}

	@Test
	public void mduNavTest() {
		SoftAssert sa = new SoftAssert();
		Switch.toTab();
		String actual = driver.getTitle();
		sa.assertEquals(actual, "Sign in - Google Accounts");
		driver.switchTo().defaultContent();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
