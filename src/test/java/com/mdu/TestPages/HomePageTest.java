package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mdu.Base.Base;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Utility;

public class HomePageTest extends Base {
	public HomePage hpage;

	@BeforeMethod
	public void setUp() {
		init();
		hpage = new HomePage();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
	}

	@Test
	public void titleTest() {
		String titleget = hpage.getTitle();
		Assert.assertEquals(titleget, "Maharshi Dayanand University, Rohtak");
	}

	@Test
	public void click_img() {
		String val = hpage.click_img();
		Assert.assertEquals(val, "Admission : 2018-19");
	}

	@Test
	public void check_LogoArea() {
		boolean res = hpage.check_Logo();
		Assert.assertTrue(res);
	}

	@Test
	public void check_Logomsg() {
		String actual = hpage.check_AUniersity_msg();
		Assert.assertEquals(actual,
				"(A State University established under Haryana Act No. XXV of 1975)");
	}

	@Test
	public void check_Agrade_Logoms() {
		String actual = hpage.check_AGrade_msg();
		Assert.assertEquals(actual, "'A' Grade University Accredited by NAAC");
	}

	@Test
	public void test_HomeLink() {
		String actual = hpage.click_HomeLink();
		Assert.assertEquals(actual, "Admission : 2018-19");
	}

	@Test
	public void test_RTILink() {
		hpage.rti_link();
	}

	@Test
	public void test_ContactLink() {
		hpage.contactPage_link();
	}

	@Test
	public void test_EmailDirectory() {
		hpage.emailDirectoryLink();
	}

	@Test
	public void test_FBLink() {
		hpage.facebook_Link();
	}

	@Test
	public void test_ArchiveLink() {
		hpage.archives_link();
	}

	@Test
	public void test_LResourcesLink() {
		hpage.lmsResources_Link();
	}

	@Test
	public void test_ClgPortal() {
		hpage.clgPortal();
	}

	@Test
	public void test_eRishi() {
		String actual = hpage.e_Rishi();
		Assert.assertEquals(actual, "E-RISHI SITE POWERED BY SAP");
	}

	@Test
	public void test_DDE() {
		String actual = hpage.mduDDE();
		Assert.assertEquals(actual, "DDE - Home");
	}

	@Test
	public void test_mduNet() {
		String actual = hpage.mduNet();
		Assert.assertEquals(actual, "Welcome");
	}

	@Test
	public void about_UniversityTest() {
		hpage.about_University();
	}

	@Test
	public void maha_UniProTest() {
		hpage.mahaDaya_UniProfile();
	}

	@Test
	public void rohtakTest() {
		hpage.rohtak_UniProfile();
	}

	@Test
	public void haryanaTest() {
		hpage.har_UniProfile();
	}

	@Test
	public void achieversTest() {
		String actual = hpage.achievers_UniProfile();
		Assert.assertEquals(actual, "ACHIEVERS");
	}

	@Test
	public void visionTest() {
		hpage.vision_UniProfile();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
