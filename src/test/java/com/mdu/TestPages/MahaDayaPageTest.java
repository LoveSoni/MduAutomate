package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;
import com.mdu.Pages.HomePage;
import com.mdu.Pages.MahaDayaPage;
import com.mdu.Utitlies.Utility;

public class MahaDayaPageTest extends Base {
	public HomePage hpage;
	public MahaDayaPage mdpage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		mdpage = new MahaDayaPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		mdpage = hpage.mahaDaya_UniProfile();
	}

	@Test
	public void homeLinkTest() {
		boolean res = mdpage.homeLink();
		Assert.assertTrue(res);
	}

	@Test
	public void uniNavTEst() {
		String actual = mdpage.uniProfileNav();
		Assert.assertEquals(actual,
				"Home »University Profile » Maharshi Dayanand");
	}

	@Test
	public void mdHeadingTest() {
		String actual = mdpage.mdHeading();
		Assert.assertEquals(actual, "MAHARSHI DAYANAND");
	}

	@Test
	public void yearTest() {
		String actual = mdpage.year();
		Assert.assertEquals(actual, "[1824 – 1883]");

	}

	@Test
	public void imgTest() {
		boolean actual = mdpage.image();
		Assert.assertTrue(actual);
	}
}
