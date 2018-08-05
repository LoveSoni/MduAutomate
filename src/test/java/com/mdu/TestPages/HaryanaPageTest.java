package com.mdu.TestPages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mdu.Base.Base;
import com.mdu.Pages.HaryanaPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Utility;

public class HaryanaPageTest extends Base {
	public HomePage hpage;
	public HaryanaPage harpage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		harpage = new HaryanaPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		harpage = hpage.har_UniProfile();
	}

	@Test
	public void navTextTest() {
		String actual = harpage.navText();
		Assert.assertEquals(actual, "Home »University Profile » Haryana");
	}

	@Test
	public void tableTest() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = harpage.table();
		sa.assertEquals(list.get(0), "Particulars");
		sa.assertEquals(list.get(1), "Description");
		sa.assertEquals(list.get(2), "Capital");
		sa.assertEquals(list.get(3), "Principal Language");
		sa.assertEquals(list.get(4), "Area");
		sa.assertEquals(list.get(5), "Population");
		sa.assertEquals(list.get(6), "Chandigarh");
		sa.assertEquals(list.get(7), "Hindi");
		sa.assertEquals(list.get(8), "44, 212 sq. kms.");
		sa.assertEquals(list.get(9), "2,11,44,564");
		sa.assertAll();
	}

	@Test
	public void imgTest() {
		boolean actual = harpage.img();
		Assert.assertTrue(actual);
	}

	@Test
	public void paraTest() {
		String res = harpage.para();
		boolean actual = res
				.contains("The State was the home of the legendary Bharata");
		Assert.assertTrue(actual);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
