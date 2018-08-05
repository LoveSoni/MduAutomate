package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mdu.Base.Base;
import com.mdu.Pages.ArchivesPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Utility;

public class ArchivesPageTest extends Base {
	public HomePage hpage;
	public ArchivesPage apage;

	@BeforeMethod()
	public void setUp() {
		hpage = new HomePage();
		apage = new ArchivesPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		apage = hpage.archives_link();
	}

	@Test
	public void navTextTest() {
		String actual = apage.navText();
		Assert.assertEquals(actual, "Home » Archives");
	}

	@Test
	public void archTextTest() {
		String actual = apage.arcText();
		Assert.assertEquals(actual, "ARCHIVES");
	}

	@Test
	public void prosNavTextTest() {
		String actual = apage.prosNav();
		Assert.assertEquals(actual, "Home » Admissions » Prospectus");
	}

	@Test
	public void prosHeadTest() {
		String actual = apage.prosHead();
		Assert.assertEquals(actual, "PROSPECTUS");
	}

	@Test
	public void instuctNavTest() {
		String actual = apage.instructNav();
		Assert.assertEquals(actual, "Home » Admissions » General Instructions");
	}

	@Test
	public void instructHeadTest() {
		String actual = apage.instructHead();
		Assert.assertEquals(actual, "GENERAL INSTRUCTIONS");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
