package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;
import com.mdu.Pages.CollegePortalPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Switch;
import com.mdu.Utitlies.Utility;

public class CollegePortalPageTest extends Base {
	public HomePage hpage;
	public CollegePortalPage cpage;

	@BeforeMethod()
	public void setUp() {
		hpage = new HomePage();
		cpage = new CollegePortalPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		cpage = hpage.clgPortal();
	}

	@Test
	public void titleTest() {
		Switch.toTab();
		String res = cpage.title();
		Assert.assertEquals(res,
				"College Portal - Maharshi Dayanand University - MDU - Rohtak");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
