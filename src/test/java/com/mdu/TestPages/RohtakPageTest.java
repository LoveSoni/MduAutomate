package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;
import com.mdu.Pages.HomePage;
import com.mdu.Pages.RohtakPage;
import com.mdu.Utitlies.Utility;

public class RohtakPageTest extends Base {
	public HomePage hpage;
	public RohtakPage rpage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		rpage = new RohtakPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		rpage = hpage.rohtak_UniProfile();
	}

	@Test
	public void homNavTest() {
		String actual = rpage.homeNav();
		Assert.assertEquals(actual, "Home »University Profile » Rohtak");
	}

	@Test
	public void rohtakHeadTest() {
		String actual = rpage.rohtakHead();
		Assert.assertEquals(actual, "ROHTAK");
	}

	@Test
	public void paraTest() {
		String actual = rpage.para();
		boolean res = actual
				.contains("The history of Rohtak dates back to the ancient");
		Assert.assertTrue(res);
	}

	@Test
	public void imgTest() {
		boolean actual = rpage.img();
		Assert.assertTrue(actual);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
