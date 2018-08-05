package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;

import com.mdu.Pages.HomePage;
import com.mdu.Pages.LResourcesPage;
import com.mdu.Utitlies.Utility;

public class LResourcesPageTest extends Base {
	public HomePage hpage;
	public LResourcesPage lpage;

	@BeforeMethod()
	public void setUp() {
		hpage = new HomePage();
		lpage = new LResourcesPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		lpage = hpage.lmsResources_Link();
	}

	@Test
	public void headTest() {
		String actual = lpage.head();
		Assert.assertEquals(actual,
				"Digital Learning Intitatives & Monitoring Cell");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
