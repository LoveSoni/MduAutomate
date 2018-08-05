package com.mdu.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mdu.Base.Base;

public class ContactPage extends Base {
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement navtext;
	@FindBy(xpath = "//h1[text()='CONTACT US']")
	WebElement contact;
	@FindBy(xpath = "//table//a//img")
	WebElement img;
	@FindBy(xpath = "//font[contains(text(),'Feedback')]")
	WebElement feedback;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public String navText() {
		String res = navtext.getText();
		return res;
	}

	public String contactText() {
		String res = contact.getText();
		return res;
	}

	public boolean img() {
		boolean res = img.isDisplayed();
		return res;
	}

	public String feedback() {
		String res = feedback.getText();
		return res;
	}

	public ArrayList<String> tableData1() {
		ArrayList<String> list = new ArrayList<String>();
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr/td/table/tbody/tr[";
		String hlast = "2]/td[1]/p/font/strong";
		String last = "]/td[1]/p/strong";
		String l1last = "]/td[1]/strong";
		String l2last = "]/td[1]/p";
		list.add(driver.findElement(By.xpath(first + hlast)).getText());
		for (int i = 3; i <= 6; i++) {
			list.add(driver.findElement(By.xpath(first + i + last)).getText());
		}
		for (int i = 7; i <= 12; i++) {
			list.add(driver.findElement(By.xpath(first + i + l1last)).getText());
		}
		for (int i = 13; i <= 16; i++) {
			list.add(driver.findElement(By.xpath(first + i + last)).getText());
		}
		for (int i = 17; i <= 18; i++) {
			list.add(driver.findElement(By.xpath(first + i + l2last)).getText());
		}
		for (int i = 19; i <= 26; i++) {
			list.add(driver.findElement(By.xpath(first + i + last)).getText());
		}
		return list;
	}

	public ArrayList<String> tableData2() {
		ArrayList<String> list = new ArrayList<String>();
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr/td/table/tbody/tr[";
		String l1last = "]/td[2]/p/font/strong";
		String l2last = "]/td[2]/p";
		String l3last = "]/td[2]";
		String l4last = "26]/td[2]/p/a/strong";
		for (int i = 2; i <= 6; i++) {
			if (i == 2) {
				list.add(driver.findElement(By.xpath(first + i + l1last))
						.getText());
			} else {
				list.add(driver.findElement(By.xpath(first + i + l2last))
						.getText());
			}
		}
		for (int i = 7; i <= 25; i++) {
			list.add(driver.findElement(By.xpath(first + i + l3last)).getText());
		}
		list.add(driver.findElement(By.xpath(first + l4last)).getText());
		return list;
	}

	public String howToReach() {
		String res = driver.findElement(
				By.xpath("//font[contains(text(),'How to reach')]")).getText();
		return res;
	}

	public String uniAbout() {
		String res = driver.findElement(
				By.xpath("//font[contains(text(),'University is about')]"))
				.getText();
		return res;
	}

	public String byAir() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'By Air')]")).getText();
		return res;
	}

	public String byAirInfo() {
		String res = driver
				.findElement(
						By.xpath("//font[contains(text(),'To reach Rohtak, one has')]"))
				.getText();
		return res;
	}

	public String byAirInfo2() {
		String res = driver.findElement(
				By.xpath("//font[contains(text(),'Prepaid Taxi')]")).getText();
		return res;
	}

	public String byRoad() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'By Road')]")).getText();
		return res;
	}

	public String byRoadInfo() {
		String res = driver
				.findElement(
						By.xpath("//*[@id='frame1']/div/div/div[2]/font/font/p[1]/font"))
				.getText();
		return res;
	}

	public String byTrain() {
		String res = driver.findElement(
				By.xpath("//strong[contains(text(),'By Train')]")).getText();
		return res;
	}

	public String byTrainInfo() {
		String res = driver
				.findElement(
						By.xpath("//*[@id='frame1']/div/div/div[2]/font/font/p[2]/font"))
				.getText();
		return res;
	}

	public String expressTrain() {
		String res = driver.findElement(
				By.xpath("//font[contains(text(),'Express and Local')]"))
				.getText();
		return res;
	}

	public boolean leftImg() {
		boolean res = driver.findElement(By.xpath("//div[@class='left']//img"))
				.isDisplayed();
		return res;
	}

	public boolean map() {
		boolean res = driver.findElement(By.xpath("//div[@class='right']"))
				.isDisplayed();
		return res;
	}
}
