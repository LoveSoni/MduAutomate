package com.mdu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mdu.Base.Base;

public class VisionPage extends Base {
	@FindBy(xpath = "//div[@class='font_12black']")
	WebElement para;
	@FindBy(xpath = "//div[@class='innerhead font_12red']")
	WebElement visionparahead;
	@FindBy(xpath = "//h1[contains(text(),'VISION')]")
	WebElement visionhead;
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement navtext;

	public VisionPage() {
		System.out.println("const");
		PageFactory.initElements(driver, this);
	}

	public String navText() {
		String res = navtext.getText();
		return res;
	}

	public String visionHead() {
		String res = visionhead.getText();
		return res;
	}

	public String visionParaHead() {
		String res = visionparahead.getText();
		return res;
	}

	public String para() {
		String res = para.getText();
		return res;
	}
}
