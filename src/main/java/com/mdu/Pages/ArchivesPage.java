package com.mdu.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mdu.Base.Base;

public class ArchivesPage extends Base {
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement navtext;
	@FindBy(xpath = "//h1[text()='ARCHIVES']")
	WebElement arctext;
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement nav;
	@FindBy(xpath = "//h1[text()='PROSPECTUS	']")
	WebElement proshead;
	@FindBy(xpath = "//h1[text()='GENERAL INSTRUCTIONS']")
	WebElement instructhead;

	public ArchivesPage() {
		PageFactory.initElements(driver, this);
	}

	public String navText() {
		String res = navtext.getText();
		return res;
	}

	public String arcText() {
		String res = arctext.getText();
		return res;
	}

	public void prosLink() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By
				.xpath("//div[@class='font_12black']//a[text()='Prospectus']")));
	}

	public String prosNav() {
		prosLink();
		String res = nav.getText();
		return res;
	}

	public String prosHead() {
		prosLink();
		String res = proshead.getText();
		return res;
	}

	public void instructLink() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//a[contains(text(),'General')]")));

	}

	public String instructNav() {
		instructLink();
		String res = nav.getText();
		return res;
	}

	public String instructHead() {
		instructLink();
		String res = instructhead.getText();
		return res;
	}
}
