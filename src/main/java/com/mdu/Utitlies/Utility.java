package com.mdu.Utitlies;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility{
	public static void click(AndroidDriver<?> driver,WebElement element,int time)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void sendKeys(AndroidDriver<?> driver,WebElement element,int time, String val)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(val);
	}
}
