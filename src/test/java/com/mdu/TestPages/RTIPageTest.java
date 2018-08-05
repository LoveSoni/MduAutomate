package com.mdu.TestPages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mdu.Base.Base;
import com.mdu.Pages.HomePage;
import com.mdu.Pages.RTIPage;
import com.mdu.Utitlies.Utility;

public class RTIPageTest extends Base {
	public HomePage hpage;
	public RTIPage rpage;

	@BeforeMethod
	public void setUp() {
		hpage = new HomePage();
		rpage = new RTIPage();
		init();
		Utility.click(driver, driver.findElement(By.xpath("//img[@id='x']")),
				10);
		rpage = hpage.rti_link();
	}

	@Test
	public void rtiNavTextTest() {
		String actual = rpage.rtiNavText();
		Assert.assertEquals(actual, "Home » RTI");
	}

	@Test
	public void rtiHeadTest() {
		String actual = rpage.rtiHead();
		Assert.assertEquals(actual, "RTI");
	}

	@Test
	public void imgTest() {
		boolean actual = rpage.img();
		Assert.assertTrue(actual);
	}

	@Test
	public void mduInfoTest() {
		String actual = rpage.mduInfo();
		Assert.assertEquals(actual, "  MAHARSHI DAYANAND UNIVERSITY ROHTAK"
				+ "\n  PUBLIC INFORMATION OFFICE (RTI CELL)");
	}

	@Test
	public void tableData1Test() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = rpage.tableData1();
		sa.assertEquals(list.get(0), "Name of Branch Officer");
		sa.assertEquals(list.get(1), "Prof. (Dr.) Sewa Singh Dahiya");
		sa.assertEquals(list.get(2), "Contact No.");
		sa.assertEquals(list.get(3), "01262-274327");
		sa.assertEquals(list.get(4), "OTHER STAFF MEMBERS");
		sa.assertEquals(list.get(5), "Name");
		sa.assertEquals(list.get(6), "Sh. Satyavir Sheoran, Assistant");
		sa.assertEquals(list.get(7), "SOLE FIRST APPELLATE AUTHORITY:");
		sa.assertEquals(list.get(8), "Designation with Phone No., if any");
		sa.assertEquals(list.get(9), "A.P.I.O. (RTI cell)\n(M- 9416211467)");
		sa.assertEquals(list.get(10),
				"Duty and responsibilities\nwork assigned");
		sa.assertEquals(
				list.get(11),
				"To supply information on the request of applicants received under RTI Act, 2005. To make coordination amongst other Public Information Officers. To supply information to State Information Commission, Haryana, Chandigarh");
		sa.assertEquals(
				list.get(12),
				"Prof. Naresh Sharma,\nDEPARTMENT OF LAW\nM.D. UNIVERSITY, ROHTAK\nTELE PHONE : 01262393493");
		sa.assertEquals(list.get(13),
				"LIST OF APIO, PIO’S AND 1ST APPELLATE AUTHORITY");
		sa.assertAll();
	}

	@Test
	public void tableData2Test() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = rpage.tableData2();
		int j = 1;
		for (int i = 0; i < 35; i++) {
			sa.assertEquals(list.get(i), j + ".");
			j++;
		}
		sa.assertEquals(list.get(35), "Sr. No.");
		sa.assertEquals(list.get(36), "Name & Designation");
		sa.assertEquals(list.get(37),
				"Information relating to Branches/Officers/UTD");
		sa.assertEquals(list.get(38), "Telephone/ Mobile Nos.");
		sa.assertEquals(list.get(39), "Prof.(Dr.) Naresh Sharma, Dept. of Law");
		sa.assertEquals(list.get(40), "Sole 1st Appellate Authority");
		sa.assertEquals(list.get(41), "01262393493");
		sa.assertEquals(list.get(42), "Dr. Satish Malik, Librarian, V.Library");
		sa.assertEquals(list.get(43), "Nodal Officer for RTI");
		sa.assertEquals(list.get(44), "9416516231");
		sa.assertEquals(list.get(45),
				"Prof. (Dr.) Sewa Singh Dahiya Deptt of Pub. Admn.");
		sa.assertEquals(list.get(46), "Incharge-cum-SPIO(RTI Cell)");
		sa.assertEquals(list.get(47), "9466527002");
		sa.assertEquals(list.get(48), "Sh. Satyavir Sheoran, Assistant");
		sa.assertEquals(list.get(49), "A.P.I.O. (RTI Cell)");
		sa.assertEquals(list.get(50), "9416211467");
		sa.assertEquals(list.get(51), "Dr. Anar Singh Dhull, OSD");
		sa.assertEquals(list.get(52), "R&S Branch");
		sa.assertEquals(list.get(53), "01262-238093");
		sa.assertEquals(list.get(54),
				"Sh. M.L. Batra Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(55), "Purchase & Store");
		sa.assertEquals(list.get(56), "01262-266953");
		sa.assertEquals(list.get(57),
				"Sh. Subhash Chander, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(58), "Establishment Branch(Non Teaching)");
		sa.assertEquals(list.get(59), "01262-266390");
		sa.assertEquals(list.get(60),
				"Sh. S.S. Bhargava, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(61), "Establishment Branch (Teaching)");
		sa.assertEquals(list.get(62), "01262-393155");
		sa.assertEquals(list.get(63),
				"Sh. Mukesh Kumar Finance Officer-cum-PIO");
		sa.assertEquals(list.get(64), "Account Branch");
		sa.assertEquals(list.get(65), "01262-295258");
		sa.assertEquals(list.get(66),
				"Mrs. Gian Girdhar, Asstt. Registrar-cum-PIO");
		sa.assertEquals(list.get(67), "Colleges Br. & All Affilated Colleges");
		sa.assertEquals(list.get(68), "01262-274712");
		sa.assertEquals(list.get(69),
				"Mrs. Jai Devi, Superintendent Incharge-cum-PIO");
		sa.assertEquals(list.get(70), "Result-I Branch");
		sa.assertEquals(list.get(71), "01262-266454");
		sa.assertEquals(list.get(72),
				"Sh.K.C. Dahiya, Asstt. Registrar-cum-PIO");
		sa.assertEquals(list.get(73), "Result-II Branch");
		sa.assertEquals(list.get(74), "01262-266454");
		sa.assertEquals(list.get(75),
				"Mrs. Indira Chaudhary, Supdt. I/C -cum-PIO");
		sa.assertEquals(list.get(76), "Result-III Branch");
		sa.assertEquals(list.get(77), "   01262-286475");
		sa.assertEquals(list.get(78),
				"Mrs. Chander kanta, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(79), "Result IV Branch");
		sa.assertEquals(list.get(80), "01262-215573");
		sa.assertEquals(list.get(81), "Sh.Rajbir Singh Ghangas, D.R-cum-PIO");
		sa.assertEquals(list.get(82), "Conduct Branch");
		sa.assertEquals(list.get(83), "01262-266058");
		sa.assertEquals(list.get(84), "Sh.Rajbir Singh Ghangas, D.R-cum-PIO");
		sa.assertEquals(list.get(85), "Secrecy Branch");
		sa.assertEquals(list.get(86), "01262-292876");
		sa.assertEquals(list.get(87),
				"Mrs. Deep Rani, Deputy Registrar-cum-PIO");
		sa.assertEquals(list.get(88), "RE-evaluation Cell");
		sa.assertEquals(list.get(89), "01262-292534");
		sa.assertEquals(list.get(90),
				"Sh. Subhash Chander, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(91), "Legal Cell");
		sa.assertEquals(list.get(92), "01262-295258");
		sa.assertEquals(list.get(93),
				"Sh. Tarun Sharma,Controller Security-cum-PIO");
		sa.assertEquals(list.get(94), "Watch and Ward Office");
		sa.assertEquals(list.get(95), "9996344884");
		sa.assertEquals(list.get(96),
				"Mrs. Chander Kanta, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(97), "Academic Branch");
		sa.assertEquals(list.get(98), "01262-393580");
		sa.assertEquals(list.get(99),
				"Mrs. Sharda Tuli, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(100), "Directorate of Distance Education");
		sa.assertEquals(list.get(101), "01262-215673");
		sa.assertEquals(list.get(102), "Sh. Satish Mittal SDE(C-III)-cum-PIO");
		sa.assertEquals(list.get(103), "Construction & Maintenance");
		sa.assertEquals(list.get(104),
				"01262-274412\n94165501262-274412\n9416557771");
		sa.assertEquals(list.get(105),
				"Sh. Niranjan, SDE(Horticulture)-cum-PIO");
		sa.assertEquals(list.get(106),
				"Horticulture & Land scaping wing of engg.");
		sa.assertEquals(list.get(107), "01262-274412");
		sa.assertEquals(list.get(108),
				"Dr. Devender Singh Dhull, Director Sports-cum-PIO");
		sa.assertEquals(list.get(109), "For Sport Matters");
		sa.assertEquals(list.get(110), "01262-299205\n9355235911");
		sa.assertEquals(list.get(111), "Dr. Jagbir Singh Rathee DYW-cum-PIO");
		sa.assertEquals(list.get(112), "For Cultural Activities");
		sa.assertEquals(list.get(113), "01262-299205,9466161016");
		sa.assertEquals(list.get(114),
				"Prof. Rajesh Dhankhar, Chief Warden(Girls)-cum-PIO");
		sa.assertEquals(list.get(115), "For all the Girls Hostels");
		sa.assertEquals(list.get(116), "01262-212934");
		sa.assertEquals(list.get(117),
				"Prof. Radhey Shyam, Chief Warden(Boys)-cum-PIO");
		sa.assertEquals(list.get(118), "For All the Boys Hostels");
		sa.assertEquals(list.get(119), "01262-272971, 9813104668");
		sa.assertEquals(list.get(120), "Col. Satbir Singh Kataria");
		sa.assertEquals(list.get(121), "University Campus School");
		sa.assertEquals(list.get(122), "9416387183");
		sa.assertEquals(list.get(123),
				"Dr. Ranbir Singh Gulia, Co-ordinator(NSS)-cum-PIO");
		sa.assertEquals(list.get(124), "Co-ordinator(NSS)");
		sa.assertEquals(list.get(125), "9466725252");
		sa.assertEquals(list.get(126), "Mrs. Anita Garg Nodal Officer-cum-PIO");
		sa.assertEquals(list.get(127), "Computer Centre");
		sa.assertEquals(list.get(128), "8901352545");
		sa.assertEquals(list.get(129),
				"Sh. M.L. Batra, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(130), "University Press");
		sa.assertEquals(list.get(131), "9466307527");
		sa.assertEquals(list.get(132),
				"Sh. M.L. Batra, Assistant Registrar-cum-PIO");
		sa.assertEquals(list.get(133), "Gen. Adm. Branch");
		sa.assertEquals(list.get(134), "01262-266463");
		sa.assertEquals(list.get(135), "Dr. Satish Malik Librarian -Cum-PIO");
		sa.assertEquals(list.get(136), "Vivekananda Main Library");
		sa.assertEquals(list.get(137), "9416516231");
		sa.assertEquals(list.get(138),
				"Sh. Jai Dev Dahiya, Transport Officer-cum-PIO");
		sa.assertEquals(list.get(139), "Transport Office");
		sa.assertEquals(list.get(140), "01262-393023, 9215990090");
		sa.assertEquals(list.get(141), "Sh. J.S. Dahiya, XEN-cum-PIO");
		sa.assertEquals(list.get(142), "Engg. Cell");
		sa.assertEquals(list.get(143), "9991366698");
		sa.assertAll();
	}

	@Test
	public void tableData3Test() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = rpage.tableData3();
		int j = 1;
		for (int i = 0; i < 36; i++) {
			sa.assertEquals(list.get(i), j + "");
			j++;
		}
		sa.assertEquals(
				list.get(36),
				"LIST OF PUBLIC INFORMATION OFFICERS OF THE UNIVERSITY TEACHING DEPARTMENTS / UILMS, Gurgaon");
		sa.assertEquals(list.get(37), "Sr.No.");
		sa.assertEquals(list.get(38), "Department");
		sa.assertEquals(list.get(39), "Name of the Head/ Designation");
		sa.assertEquals(list.get(40), "From");
		sa.assertEquals(list.get(41), "To");
		sa.assertEquals(list.get(42), "Microbiology");
		sa.assertEquals(list.get(43), "Centre for Biotechnology");
		sa.assertEquals(list.get(44), "Computer Science");
		sa.assertEquals(list.get(45), "Education");
		sa.assertEquals(list.get(46), "Political Science");
		sa.assertEquals(list.get(47), "Commerce");
		sa.assertEquals(list.get(48), "Biochemistry");
		sa.assertEquals(list.get(49), "Centre for Bioinformatics");
		sa.assertEquals(list.get(50), "Centre for Medical Biotechnology");
		sa.assertEquals(list.get(51), "Sanskrit");
		sa.assertEquals(list.get(52), "Zoology");
		sa.assertEquals(list.get(53), "Environmental Sciences");
		sa.assertEquals(list.get(54), "Hindi");
		sa.assertEquals(list.get(55), "Visual Arts");
		sa.assertEquals(list.get(56), "Statistics");
		sa.assertEquals(list.get(57), "English");
		sa.assertEquals(list.get(58), "Pharmaceutical Sciences");
		sa.assertEquals(list.get(59), "Physical EduCation");
		sa.assertEquals(list.get(60), "Genetics");
		sa.assertEquals(list.get(61), "IMSAR");
		sa.assertEquals(list.get(62), "Journalism & Mass Communication");
		sa.assertEquals(list.get(63), "Sociology");
		sa.assertEquals(list.get(64), "Mathematics");
		sa.assertEquals(list.get(65), "Music");
		sa.assertEquals(list.get(66), "Geography");
		sa.assertEquals(list.get(67), "Food Technology");
		sa.assertEquals(list.get(68), "Psychology");
		sa.assertEquals(list.get(69), "History");
		sa.assertEquals(list.get(70), "Defence & Strategic Studies");
		sa.assertEquals(list.get(71), "Library & Information Science");
		sa.assertEquals(list.get(72), "Physics");
		sa.assertEquals(list.get(73), "Chemistry");
		sa.assertEquals(list.get(74), "Economic");
		sa.assertEquals(list.get(75), "Law");
		sa.assertEquals(list.get(76), "Botany");
		sa.assertEquals(list.get(77), "Public Admn.");
		sa.assertEquals(list.get(78),
				"Dr. Pratyoosh Shukla,Associate Professor");
		sa.assertEquals(list.get(79), "Prof. Promod Mehta");
		sa.assertEquals(list.get(80), "Prof. (Dr.) Nasib Singh Gill");
		sa.assertEquals(list.get(81), "Dr. Jitendra Kumar");
		sa.assertEquals(list.get(82), "Dr. Rajendra Sharma");
		sa.assertEquals(list.get(83), "Dr. Ram Rattan Saini");
		sa.assertEquals(list.get(84), "Prof. Raiesh Dabur");
		sa.assertEquals(list.get(85), "Prof. Rajesh Dhankar");
		sa.assertEquals(list.get(86), "Prof. P.K. Jaiwal");
		sa.assertEquals(list.get(87), "Prof.(Mrs.) Asha");
		sa.assertEquals(list.get(88), "Dr.(Mrs.) Vineeta Shukla");
		sa.assertEquals(list.get(89), "Dr.(Mrs.) Rajesh Dhankhar");
		sa.assertEquals(list.get(90), "Dr. Ram Rati");
		sa.assertEquals(list.get(91), "Dr. Bhup Singh Gulia");
		sa.assertEquals(list.get(92), "Prof.(Mrs.) Priti Jain");
		sa.assertEquals(list.get(93), "Dr. (Mrs.) Poonam Datta");
		sa.assertEquals(list.get(94), "Dr. Munish Garg");
		sa.assertEquals(list.get(95), "Dr. Bhagat Singh");
		sa.assertEquals(list.get(96), "Dr. J.P.Yadav");
		sa.assertEquals(list.get(97), "Prof. A.S. Boora");
		sa.assertEquals(list.get(98), "Dr. Harish Kumar");
		sa.assertEquals(list.get(99), "Dr. Madhu Nagla");
		sa.assertEquals(list.get(100), "Dr. Jitender Singh Sikka");
		sa.assertEquals(list.get(101), "Dr. Hukam Chand");
		sa.assertEquals(list.get(102), "Dr. (Mrs.) Binu Sangwan");
		sa.assertEquals(list.get(103), "Dr. Balieet Singh Yadav");
		sa.assertEquals(list.get(104), "Dr. Nov Rattan Sharma");
		sa.assertEquals(list.get(105), "Dr.Jaiveer S. Dhankhar");
		sa.assertEquals(list.get(106), "Dr.S.P. Vats");
		sa.assertEquals(list.get(107), "Dr. Satish Malik");
		sa.assertEquals(list.get(108), "Dr. Sanjay Kumar Dahiya");
		sa.assertEquals(list.get(109), "Prof. S.P. Khatkar");
		sa.assertEquals(list.get(110), "Dr.(Mrs.) Santosh Nandal");
		sa.assertEquals(list.get(111), "Dr. Arivinder Singh Dalal");
		sa.assertEquals(list.get(112), "Dr. (Mrs.) Anita Rani Sehrawat");
		sa.assertAll();
	}

	@Test
	public void tableData3_1Test() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> list = rpage.tableData3_1();
		sa.assertEquals(list.get(0), "28.12.2014");
		sa.assertEquals(list.get(1), "27.12.2017");
		sa.assertEquals(list.get(2), "1.3.2015");
		sa.assertEquals(list.get(3), "28.2.2018");
		sa.assertEquals(list.get(4), "15.3.2015");
		sa.assertEquals(list.get(5), "14.3.2018");
		sa.assertEquals(list.get(6), "6.5.16");
		sa.assertEquals(list.get(7), "5.5.2019");
		sa.assertEquals(list.get(8), "21.4.2018");
		sa.assertEquals(list.get(9), "20.4.2021");
		sa.assertEquals(list.get(10), "7.3.2017");
		sa.assertEquals(list.get(11), "6.3.2020");
		sa.assertEquals(list.get(12), "02.05.2015");
		sa.assertEquals(list.get(13), "01.05·2018");
		sa.assertEquals(list.get(14), "5.8.2014");
		sa.assertEquals(list.get(15), "Till Further Orders");
		sa.assertEquals(list.get(16), "17.6.2015");
		sa.assertEquals(list.get(17), "Till Further Orders");
		sa.assertEquals(list.get(18), "");
		sa.assertEquals(list.get(19), "");
		sa.assertEquals(list.get(20), "15.6.2015");
		sa.assertEquals(list.get(21), "14.6.2018");
		sa.assertEquals(list.get(22), "15.6.2015");
		sa.assertEquals(list.get(23), "14.6.2018");
		sa.assertEquals(list.get(24), "17.12.2015");
		sa.assertEquals(list.get(25), "31.5.2017(DOS)");
		sa.assertEquals(list.get(26), "6.7.2015");
		sa.assertEquals(list.get(27), "5.7.2018");
		sa.assertEquals(list.get(28), "2.9.2015");
		sa.assertEquals(list.get(29), "1.9.2018");
		sa.assertEquals(list.get(30), "1.11.2015");
		sa.assertEquals(list.get(31), "30.10.2018");
		sa.assertEquals(list.get(32), "10.11.2015");
		sa.assertEquals(list.get(33), "9.11.2018");
		sa.assertEquals(list.get(34), "7.12.2015");
		sa.assertEquals(list.get(35), "6.12.2018");
		sa.assertEquals(list.get(36), "4.1.2016");
		sa.assertEquals(list.get(37), "3·1.2019");
		sa.assertEquals(list.get(38), "1.3.2016");
		sa.assertEquals(list.get(39), "28.2.2019");
		sa.assertEquals(list.get(40), "01.04.2018");
		sa.assertEquals(list.get(41), "30.04.2021(DOS)");
		sa.assertEquals(list.get(42), "1.4.2016");
		sa.assertEquals(list.get(43), "31.3.2019");
		sa.assertEquals(list.get(44), "1.5.2016");
		sa.assertEquals(list.get(45), "30.4.2019");
		sa.assertEquals(list.get(46), "1.5.2017");
		sa.assertEquals(list.get(47), "30.4.2020");
		sa.assertEquals(list.get(48), "3.7.2016");
		sa.assertEquals(list.get(49), "2.7.2019");
		sa.assertEquals(list.get(50), "1.10.2016");
		sa.assertEquals(list.get(51), "30.9.2019");
		sa.assertEquals(list.get(52), "17.11.2016");
		sa.assertEquals(list.get(53), "16.11.2019");
		sa.assertEquals(list.get(54), "1.12.2017");
		sa.assertEquals(list.get(55), "30.11.2020(DOS)");
		sa.assertEquals(list.get(56), "5.3.2017");
		sa.assertEquals(list.get(57), "30.6.2019(DOS)");
		sa.assertEquals(list.get(58), "9.6.2014");
		sa.assertEquals(list.get(59), " Till further orders");
		sa.assertEquals(list.get(60), "1.9.2016");
		sa.assertEquals(list.get(61), "31.8.2019");
		sa.assertEquals(list.get(62), "2.5.2017");
		sa.assertEquals(list.get(63), "31.10.2019");
		sa.assertEquals(list.get(64), "1.8.2014");
		sa.assertEquals(list.get(65), "31.7.2017");
		sa.assertEquals(list.get(66), "1.5.2017");
		sa.assertEquals(list.get(67), "30.4.2020");
		sa.assertEquals(list.get(68), "1.11.2017");
		sa.assertEquals(list.get(69), "31.10.2020");
		sa.assertEquals(list.get(70), "1.5.2015");
		sa.assertEquals(list.get(71), "30.4.2018");
		sa.assertAll();
	}

	@Test
	public void footerTest() {
		String actual = rpage.footer();
		Assert.assertEquals(actual,
				"(Under The Right of Information Act, 2005)");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
