package com.mdu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mdu.Base.Base;

public class EmailPage extends Base {
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement navtext;

	public String navText() {
		String res = navtext.getText();
		return res;
	}
}
