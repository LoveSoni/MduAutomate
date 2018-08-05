package com.mdu.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.mdu.Base.Base;
import com.mdu.Utitlies.Switch;
import com.mdu.Utitlies.Utility;

public class HomePage extends Base {
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String click_img() {
		Utility.click(driver,
				driver.findElement(By.xpath("//img[@class='marR10 floatL']")),
				10);
		String res = driver
				.findElement(By.xpath("//u[contains(text(),'Adm')]")).getText();
		return res;
	}

	public void show_UniProfile() {
		Actions act = new Actions(driver);
		act.moveToElement(
				driver.findElement(By.xpath("//a[text()='University Profile']")))
				.build().perform();
	}

	public boolean check_Logo() {
		boolean disp = driver.findElement(By.xpath("//div[@class='logoArea']"))
				.isEnabled();
		return disp;
	}

	public String check_AUniersity_msg() {
		String res = driver.findElement(
				By.xpath("//span[@class='font12 fontN']")).getText();
		return res;
	}

	public String check_AGrade_msg() {
		String res = driver.findElement(
				By.xpath("//span[contains(text(),'Grade University')]"))
				.getText();
		return res;
	}

	public String click_HomeLink() {
		Utility.click(driver, driver.findElement(By
				.xpath("//div[@class='infoArea']//a[text()='Home']")), 10);
		String res = driver
				.findElement(By.xpath("//u[contains(text(),'Adm')]")).getText();
		return res;
	}

	public RTIPage rti_link() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='RTI']")), 10);
		return new RTIPage();
	}

	public ContactPage contactPage_link() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='Contact Us']")), 10);
		return new ContactPage();
	}

	public EmailPage emailDirectoryLink() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='E-mail ']")), 10);
		return new EmailPage();
	}

	public void facebook_Link() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='Facebook']")), 10);
	}

	public ArchivesPage archives_link() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='Archives']")), 10);
		return new ArchivesPage();
	}

	public LResourcesPage lmsResources_Link() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()=' LMS Resources']")),
				10);
		return new LResourcesPage();
	}

	public CollegePortalPage clgPortal() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='College Portal ']")),
				10);
		return new CollegePortalPage();
	}

	public String e_Rishi() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='e-Rishi ERP']")), 10);
		Switch.toTab();
		String res = driver.findElement(
				By.xpath("//div[@class='urCopyrightText']")).getText();
		return res;
	}

	public String mduDDE() {
		Utility.click(driver, driver.findElement(By
				.xpath("//a[contains(text(),'mdudde.net')]")), 10);
		Switch.toTab();
		String res = driver.findElement(
				By.xpath("//a[@class='font12white' and text()='DDE - Home']"))
				.getText();
		return res;
	}

	public String mduNet() {
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='mdurohtak.net.in']")),
				10);
		Switch.toTab();
		String res = driver.findElement(
				By.xpath("//div[contains(text(),'Welcome')]")).getText();
		return res;
	}

	public AboutUniversityPage about_University() {
		show_UniProfile();
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='University']")), 10);
		return new AboutUniversityPage();
	}

	public MahaDayaPage mahaDaya_UniProfile() {
		show_UniProfile();
		Utility.click(
				driver,
				driver.findElement(By.xpath("//a[text()='Maharshi Dayanand']")),
				10);
		return new MahaDayaPage();
	}

	public RohtakPage rohtak_UniProfile() {
		show_UniProfile();
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='Rohtak']")), 10);
		return new RohtakPage();
	}

	public HaryanaPage har_UniProfile() {
		show_UniProfile();
		Utility.click(driver,
				driver.findElement(By.xpath("//a[text()='Haryana']")), 10);
		return new HaryanaPage();
	}

	public String achievers_UniProfile() {
		show_UniProfile();
		Utility.click(driver, driver.findElement(By
				.xpath("//a[contains(text(),'Our Achievers')]")), 10);
		String res = driver.findElement(By.xpath("//h1[text()='ACHIEVERS']"))
				.getText();
		return res;
	}

	public VisionPage vision_UniProfile() {
		show_UniProfile();
		Utility.click(driver, driver.findElement(By
				.xpath("//a[contains(text(),'Vision State')]")), 10);
		return new VisionPage();
	}
}