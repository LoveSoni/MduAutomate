package com.mdu.TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mdu.Base.Base;
import com.mdu.Pages.AboutUniversityPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Utility;

public class AboutUniversityPageTest extends Base {
	public HomePage hpage;
	public AboutUniversityPage apage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		apage = new AboutUniversityPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		apage = hpage.about_University();
	}

	@Test
	public void aboutTest() {
		String actual = apage.about_University();
		Assert.assertEquals(actual, "ABOUT UNIVERSITY");
	}

	@Test
	public void preTest() {
		String actual = apage.pre();
		Assert.assertEquals(actual, "Prelude");
	}

	@Test
	public void prePahara1Test() {
		String actual = apage.prePahara1();
		Assert.assertTrue(actual.contains("ab initio established as Rohtak"));
	}

	@Test
	public void prePahara2Test() {
		String actual = apage.prePahara2();
		Assert.assertTrue(actual
				.contains("about 75 kms from Delhi on Delhi-Hisar"));
	}

	@Test
	public void prePahara3Test() {
		String actual = apage.prePahara3();
		Assert.assertTrue(actual
				.contains("The University campus, spreadover an area of 665.44 acres,"));
	}

	@Test
	public void prePahara4Test() {
		String actual = apage.prePahara4();
		Assert.assertTrue(actual
				.contains("Besides, the University runs three programmes"));
	}

	@Test
	public void prePahara5test() {
		String actual = apage.prePahara5();
		Assert.assertTrue(actual
				.contains("About 263 Institutions/Colleges of General"));
	}

	@Test
	public void universityLibraryTest() {
		String actual = apage.universityLibrary();
		Assert.assertEquals(actual, "University Library System");
	}

	@Test
	public void ulParaTest() {
		String actual = apage.ulPara();
		Assert.assertTrue(actual
				.contains("An airconditioned reading hall with 250 seats remains open 24X7"));
	}

	@Test
	public void computingTest() {
		String actual = apage.computing_Facilities();
		Assert.assertTrue(actual.contains("Computing and Internet facilities"));
	}

	@Test
	public void computingParaTest() {
		String actual = apage.computingPara();
		Assert.assertTrue(actual
				.contains("The University has a Computer Centre for the benefit of students"));
	}

	@Test
	public void hostelTest() {
		String actual = apage.hostel();
		Assert.assertEquals(actual, "Hostels");
	}

	@Test
	public void hostelParaTest() {
		String actual = apage.hostelPara();
		Assert.assertTrue(actual
				.contains("Each hostel has facilities for indoor games"));
	}

	@Test
	public void sportsTest() {
		String actual = apage.sports();
		Assert.assertEquals(actual, "Sports Facilities");
	}

	@Test
	public void sportsParaTest() {
		String actual = apage.sportsPara();
		Assert.assertTrue(actual
				.contains("The position holders are being awarded with handsome cash"));
	}

	@Test
	public void iqacTest() {
		String actual = apage.iqac();
		Assert.assertEquals(actual, "Internal Quality Assurance Cell (IQAC)");
	}

	@Test
	public void iqacParaTest() {
		String actual = apage.iqacPara();
		Assert.assertTrue(actual
				.contains("To institutionalize the process of quality sustenance"));
	}

	@Test
	public void uniExamTest() {
		String actual = apage.uniExam();
		Assert.assertEquals(actual,
				"University Centre for Competitive Examinations");
	}

	@Test
	public void uniExamParaTest() {
		String actual = apage.uniExamPara();
		Assert.assertTrue(actual
				.contains("The students competing for various examinations"));
	}

	@Test
	public void uniHealthTest() {
		String actual = apage.uniHealth();
		Assert.assertEquals(actual, "University Health Centre");
	}

	@Test
	public void uniHealthParaTest() {
		String actual = apage.uniHealthPara();
		Assert.assertTrue(actual
				.contains("Medicines are provided to students patients free of cost"));
	}

	@Test
	public void nssTest() {
		String actual = apage.nss();
		Assert.assertEquals(actual, "National Service Scheme");
	}

	@Test
	public void nssParaTest() {
		String actual = apage.nssPara();
		Assert.assertTrue(actual
				.contains(" Students enrolled under the Scheme have to render "));
	}

	@Test
	public void scstTest() {
		String actual = apage.scst();
		Assert.assertEquals(actual, "SC/ST Cell");
	}

	@Test
	public void scstParaTest() {
		String actual = apage.scstPara();
		Assert.assertTrue(actual
				.contains("The Cell endeavors to ensure the benefit of Central Govt."));
	}

	@Test
	public void foreignTest() {
		String actual = apage.foreign();
		Assert.assertEquals(actual, "Foreign Students’ Cell");
	}

	@Test
	public void foreignParaTest() {
		String actual = apage.foreignPara();
		Assert.assertTrue(actual
				.contains("The Cell, headed by a Senior Faculty Member"));
	}

	@Test
	public void careerTest() {
		String actual = apage.career();
		Assert.assertEquals(actual, "Career Counseling and Placement Cell");
	}

	@Test
	public void careerParaTest() {
		String actual = apage.carrerPara();
		Assert.assertTrue(actual
				.contains("Training is also imparted through workshops related to communication "));
	}

	@Test
	public void welfareTest() {
		String actual = apage.welfare();
		Assert.assertEquals(actual, "Students’ Welfare Services");
	}

	@Test
	public void counsellingTest() {
		String actual = apage.counselling();
		Assert.assertEquals(actual,
				"Guidance and Counselling Cell – A Centre for Positive Health");
	}

	@Test
	public void fundTest() {
		String actual = apage.fund();
		Assert.assertEquals(actual, "Students’ Aid Fund");
	}

	@Test
	public void yrcTest() {
		String actual = apage.yrc();
		Assert.assertEquals(actual, "Youth Red Cross");
	}

	@AfterMethod
	public void tearWodn() {
		driver.quit();
	}
}
