package com.mdu.Pages;

import org.openqa.selenium.By;

import com.mdu.Base.Base;
import com.mdu.Utitlies.Switch;

public class LResourcesPage extends Base {
	public String head() {
		Switch.toTab();
		String res = driver.findElement(
				By.xpath("//span[@class='auto-style10']")).getText();
		return res;
	}

}
