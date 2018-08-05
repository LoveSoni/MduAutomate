package com.mdu.Pages;

import org.openqa.selenium.By;

import com.mdu.Base.Base;

public class RohtakPage extends Base {
	public String homeNav() {
		String res = driver.findElement(
				By.xpath("//span[@class='font11_black']")).getText();
		return res;
	}

	public String rohtakHead() {
		String res = driver.findElement(By.xpath("//h1[text()='ROHTAK']"))
				.getText();
		return res;
	}

	public String para() {
		String res = driver.findElement(By.xpath("//div[@align='justify']"))
				.getText();
		return res;
	}

	public boolean img() {
		boolean res = driver.findElement(
				By.xpath("//div[@class='font_12black']//img")).isDisplayed();
		return res;
	}
}
