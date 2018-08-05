package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;
import com.mdu.Pages.HomePage;
import com.mdu.Pages.VisionPage;
import com.mdu.Utitlies.Utility;

public class VisionPageTest extends Base {
	public HomePage hpage;
	public VisionPage vspage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		vspage = new VisionPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		vspage = hpage.vision_UniProfile();
	}

	@Test
	public void navTextTest() {
		String actual = vspage.navText();
		Assert.assertEquals(actual, "Home » Vision Statement");
	}

	@Test
	public void visionHeadTest() {
		String actual = vspage.visionHead();
		Assert.assertEquals(actual, "VISION STATEMENT");
	}

	@Test
	public void visionDivTest() {
		String actual = vspage.visionParaHead();
		Assert.assertEquals(actual, "Vision Statement");
	}

	@Test
	public void paraTest() {
		String res = vspage.para();
		boolean actual = res.contains("and research through inter");
		Assert.assertTrue(actual);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
