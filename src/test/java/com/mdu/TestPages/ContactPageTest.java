package com.mdu.TestPages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mdu.Base.Base;
import com.mdu.Pages.ContactPage;
import com.mdu.Pages.HomePage;
import com.mdu.Utitlies.Utility;

public class ContactPageTest extends Base {
	public HomePage hpage;
	public ContactPage cpage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		cpage = new ContactPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		cpage = hpage.contactPage_link();
	}

	@Test
	public void navTextTest() {
		String actual = cpage.navText();
		Assert.assertEquals(actual, "Home » Contact Us");
	}

	@Test
	public void contactTextTest() {
		String actual = cpage.contactText();
		Assert.assertEquals(actual, "CONTACT US");
	}

	@Test
	public void imgTest() {
		boolean actual = cpage.img();
		Assert.assertTrue(actual);
	}

	@Test
	public void feedbackTest() {
		String actual = cpage.feedback();
		Assert.assertEquals(actual, "Feedback Form");
	}

	@Test
	public void tableData1Test() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = cpage.tableData1();
		sa.assertEquals(list.get(0), "Branch");
		sa.assertEquals(list.get(1), "Vice Chancellor");
		sa.assertEquals(list.get(2), "OSD to Vice Chancellor");
		sa.assertEquals(list.get(3), "Registrar");
		sa.assertEquals(
				list.get(4),
				"General Enquiry (general Information about University, forms sale, posts etc.)");
		sa.assertEquals(
				list.get(5),
				"Admission Enquiry, Academic Branch          "
						+ "\n(Admission & (General information about admission)");
		sa.assertEquals(list.get(6), "University Computer Centre \n"
				+ "(Admission & (Online Registration / Technical Support");
		sa.assertEquals(
				list.get(7),
				"DDE Enquiries        \n"
						+ "(Distance Education Courses - general information/admission/grievances etc.) ");
		sa.assertEquals(list.get(8), "Exam. Enquiry \n"
				+ "(Result, RLA, DMC, Grievances)");

		sa.assertEquals(list.get(9), "Incharge cum PIO (R.T.I. Cell)");
		sa.assertEquals(list.get(10), "Academic Branch");
		sa.assertEquals(list.get(11), "Registration Branch");
		sa.assertEquals(list.get(12), "Colleges Branch");
		sa.assertEquals(list.get(13), "P & S Branch");
		sa.assertEquals(list.get(14), "Finance Officer");
		sa.assertEquals(list.get(15), "Controller of Examination");
		sa.assertEquals(list.get(16), "Conduct Branch");
		sa.assertEquals(list.get(17), "Re-evaluation");
		sa.assertEquals(list.get(18), "Result-I");
		sa.assertEquals(list.get(19), "Result-II");
		sa.assertEquals(list.get(20), "Result-III");
		sa.assertEquals(list.get(21), "Secrecy Branch");
		sa.assertEquals(list.get(22), "University Librarian");
		sa.assertEquals(list.get(23), "University  Website Office");
		sa.assertEquals(list.get(24), "Telephone Directory");
		sa.assertAll();
	}

	@Test
	public void tableData2Test() {
		ArrayList<String> list = cpage.tableData2();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(list.get(0), "Phone No.");
		sa.assertEquals(list.get(1), "01262-274327");
		sa.assertEquals(list.get(2), "01262-262431, 01262-393122");
		sa.assertEquals(list.get(3), "01262-274640 (Tele Fax)");
		sa.assertEquals(list.get(4), "01262- 393361");
		sa.assertEquals(list.get(5), "01262-393580");
		sa.assertEquals(list.get(6),
				"01262-393325,393326,393596\nadmission@mdurohtak.ac.in");
		sa.assertEquals(list.get(7), "01262-393191");
		sa.assertEquals(list.get(8), "01262-308336, 01262-308344");
		sa.assertEquals(list.get(9), "01262-274327");
		sa.assertEquals(list.get(10), "01262-292354");
		sa.assertEquals(list.get(11), "01262-272477");
		sa.assertEquals(list.get(12), "01262-274532");
		sa.assertEquals(list.get(13), "01262-266953");
		sa.assertEquals(list.get(14), "01262-295258");
		sa.assertEquals(list.get(15), "01262-274169");
		sa.assertEquals(list.get(16), "01262-274460");
		sa.assertEquals(list.get(17), "01262-292534");
		sa.assertEquals(list.get(18), "01262-266454");
		sa.assertEquals(list.get(19), "01262-266463");
		sa.assertEquals(list.get(20), "");
		sa.assertEquals(list.get(21), "01262-272876");
		sa.assertEquals(list.get(22), "01262-393004");
		sa.assertEquals(list.get(23), "01262-393595");
		sa.assertEquals(list.get(24), "Download");
		sa.assertAll();
	}

	@Test
	public void howToReachTest() {
		String actual = cpage.howToReach();
		Assert.assertEquals(actual, "How to reach M.D. University, Rohtak");
	}

	@Test
	public void uniAboutTest() {
		String actual = cpage.uniAbout();
		Assert.assertEquals(
				actual,
				"University is about 70 km away from New Delhi. You can reach this place by any means.");
	}

	@Test
	public void byAirTest() {
		String actual = cpage.byAir();
		Assert.assertEquals(actual, "By Air->>");
	}

	@Test
	public void byAirInfoTest() {
		String res = cpage.byAirInfo();
		boolean actual = res.contains(" one has to arrived at the Indira");
		Assert.assertTrue(actual);
	}

	@Test
	public void byAirInfo2Test() {
		String res = cpage.byAirInfo2();
		boolean actual = res.contains("Taxi’s are available on the IGI");
		Assert.assertTrue(actual);
	}

	@Test
	public void byRoadTest() {
		String actual = cpage.byRoad();
		Assert.assertEquals(actual, "By Road->>");
	}

	@Test
	public void byRoadInfoTest() {
		String res = cpage.byRoadInfo();
		boolean actual = res.contains("Rohtak is well connected to Delhi");
		Assert.assertTrue(actual);
	}

	@Test
	public void byTrainTest() {
		String actual = cpage.byTrain();
		Assert.assertEquals(actual, "By Train->>");
	}

	@Test
	public void byTrainInfoTest() {
		String res = cpage.byTrainInfo();
		boolean actual = res.contains("Rohtak can be accessed from");
		Assert.assertTrue(actual);
	}

	@Test
	public void expressTrainTest() {
		String res = cpage.expressTrain();
		boolean actual = res.contains("It will take an hour & thirty Minutes");
		Assert.assertTrue(actual);
	}

	@Test
	public void leftImgTest() {
		boolean actual = cpage.leftImg();
		Assert.assertTrue(actual);
	}

	@Test
	public void mapTest() {
		boolean actual = cpage.map();
		Assert.assertTrue(actual);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
