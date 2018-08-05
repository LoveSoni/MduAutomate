package com.mdu.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.mdu.Base.Base;

public class HaryanaPage extends Base {
	public String navText() {
		String res = driver.findElement(
				By.xpath("//span[@class='font11_black']")).getText();
		return res;
	}
	
	public ArrayList<String> table()  {
		ArrayList<String> list = new ArrayList<String>();
		String hfirst ="//*[@id='frame1']/div/div/div[1]/table/tbody/tr[1]/td[";
		String hlast="]/p/strong";
		String ffirst ="//*[@id='frame1']/div/div/div[1]/table/tbody/tr[";
		String flast = "]/td[1]/p";
		String llast="]/td[2]/p";
		for(int i=1;i<=2;i++)
		{
			String path = hfirst+i+hlast;
		list.add(driver.findElement(By.xpath(path)).getText());
		}
		for(int i=2;i<=5;i++)
		{
			String path = ffirst+i+flast;
			list.add(driver.findElement(By.xpath(path)).getText());
		}
		for(int i=2;i<=5;i++)
		{
			String path = ffirst+i+llast;
			list.add(driver.findElement(By.xpath(path)).getText());
		}
		return list;
	}
	
	public boolean img()  {
		boolean res = driver.findElement(By.xpath("//img[@alt='Haryana District Map']")).isDisplayed();
		return res;
	}
	
	public String para()  {
		String res = driver.findElement(By.xpath("//div[@align='justify' and contains(text(),'Haryana')]")).getText();
		return res;
	}
}
