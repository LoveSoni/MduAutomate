package com.mdu.Pages;

import org.openqa.selenium.By;

import com.mdu.Base.Base;

public class MahaDayaPage extends Base {
	public boolean homeLink() {
		boolean res = driver.findElement(
				By.xpath("//span//a[contains(text(),'Home')]")).isDisplayed();
		return res;
	}
	public String uniProfileNav()  {
		String res = driver.findElement(By.xpath("//span[contains(text(),'University Profile')]")).getText();
		return res;
	}
	public String mdHeading() {
		String res = driver.findElement(
				By.xpath("//h1[contains(text(),'MAHARSHI')]")).getText();
		return res;
	}

	public String year() {
		String res = driver.findElement(
				By.xpath("//h1[contains(text(),'[1824 – 1883]')]")).getText();
		return res;
	}

	public boolean image() {
		boolean img = driver
				.findElement(
						By.xpath("//div[@class='font_12black']//following-sibling::img"))
				.isDisplayed();
		return img;
	}

}
