package com.mdu.Pages;

import org.openqa.selenium.By;
import com.mdu.Base.Base;

public class AboutUniversityPage extends Base {
	public String about_University() {
		String res = driver.findElement(
				By.xpath("//h1[text()='ABOUT UNIVERSITY']")).getText();
		return res;
	}

	public String pre() {
		String res = driver.findElement(By.xpath("//strong[text()='Prelude']"))
				.getText();
		return res;
	}

	public String prePahara1() {
		String res = driver
				.findElement(
						By.xpath("//p[contains(text(),'Maharshi Dayanand University')]"))
				.getText();
		return res;
	}

	public String prePahara2() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'The University is located')]"))
				.getText();
		return res;
	}

	public String prePahara3() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'the majestic')]")).getText();
		return res;
	}

	public String prePahara4() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'three programmes')]")).getText();
		return res;
	}

	public String prePahara5() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'About 263')]")).getText();
		return res;
	}

	public String universityLibrary() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'University  Library')]"))
				.getText();
		return res;
	}

	public String ulPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'University Library')]"))
				.getText();
		return res;
	}

	public String computing_Facilities() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'Computing')]")).getText();
		return res;
	}

	public String computingPara() {
		String res = driver
				.findElement(
						By.xpath("//p[contains(text(),'The University has a robust')]"))
				.getText();
		return res;
	}

	public String hostel() {
		String res = driver.findElement(By.xpath("//strong[text()='Hostels']"))
				.getText();
		return res;
	}

	public String hostelPara() {
		String res = driver
				.findElement(
						By.xpath("//p[contains(text(),'The University provides residential')]"))
				.getText();
		return res;
	}

	public String sports() {
		String res = driver.findElement(
				By.xpath("//strong[text()='Sports  Facilities']")).getText();
		return res;
	}

	public String sportsPara() {
		String res = driver
				.findElement(
						By.xpath("//p[contains(text(),'The Directorate of Sports has')]"))
				.getText();
		return res;
	}

	public String iqac() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'Internal Quality')]"))
				.getText();
		return res;
	}

	public String iqacPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'One of the emerging')]"))
				.getText();
		return res;
	}

	public String uniExam() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'University Centre')]"))
				.getText();
		return res;
	}

	public String uniExamPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'The University Centre ')]"))
				.getText();
		return res;
	}

	public String uniHealth() {
		String res = driver.findElement(
				By.xpath("//div/strong[contains(text(),'University Health')]"))
				.getText();
		return res;
	}

	public String uniHealthPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'The University Health')]"))
				.getText();
		return res;
	}

	public String nss() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'National')]")).getText();
		return res;
	}

	public String nssPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'The National')]")).getText();
		return res;
	}

	public String scst() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'SC')]")).getText();
		return res;
	}

	public String scstPara() {
		String res = driver.findElement(
				By.xpath("//p[contains(text(),'The SC/ST')]")).getText();
		return res;
	}

	public String foreign() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'Foreign')]")).getText();
		return res;
	}

	public String foreignPara() {
		String res = driver
				.findElement(
						By.xpath("//p[contains(text(),'The University has a full-fledged')]"))
				.getText();
		return res;
	}
	
	public String career()  {
		String res = driver
				.findElement(
						By.xpath("//strong[contains(text(),'Career')]")).getText();
		return res;
	}
	
	public String carrerPara()  {
		String res = driver.findElement(By.xpath("//p[contains(text(),'University has established')]")).getText();
		return res;
	}
	
	public String welfare()  {
		String res = driver.findElement(By.xpath("//strong[text()='Students’ Welfare Services']")).getText();
		return res;
	}
	
	public String counselling()  {
		String res = driver.findElement(By.xpath("//strong[contains(text(),'Counselling')]")).getText();
		return res;
	}
	
	public String fund()  {
		String res = driver.findElement(By.xpath("//strong[contains(text(),'Fund')]")).getText();
		return res;
	}
	
	public String yrc()
	{
		String res = driver.findElement(By.xpath("//strong[contains(text(),'Red Cross')]")).getText();
		return res;
	}
}
