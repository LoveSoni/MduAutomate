package com.mdu.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mdu.Base.Base;

public class RTIPage extends Base {
	@FindBy(xpath = "//span[@class='font11_black']")
	WebElement rtitext;
	@FindBy(xpath = "//h1[text()='RTI']")
	WebElement rtihead;
	@FindBy(xpath = "//table//img")
	WebElement img;
	@FindBy(xpath = "//strong[contains(text(),'MAHARSHI DAYANAND UNIVERSITY')]")
	WebElement mduinfo;

	public RTIPage() {
		PageFactory.initElements(driver, this);
	}

	public String rtiNavText() {
		String res = rtitext.getText();
		return res;
	}

	public String rtiHead() {
		String res = rtihead.getText();
		return res;
	}

	public boolean img() {
		boolean res = img.isDisplayed();
		return res;
	}

	public String mduInfo() {
		String res = mduinfo.getText();
		return res;
	}

	public ArrayList<String> tableData1() {
		ArrayList<String> list = new ArrayList<String>();
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[";
		String last = "]/td[1]/p/strong";
		String nlast = "]/td[2]/p";
		String n1last = "4]/td/p/strong";
		String n2last = "]/td[1]/p";
		String n3last = "5]/td[2]/p/strong";//
		String n4last = "6]/td[2]/p";
		String n5last = "5]/td[3]/p/strong";
		String n6last = "6]/td[3]/p";
		String n7last = "7]/td[2]/p/strong";
		for (int i = 2; i <= 3; i++) {
			list.add(driver.findElement(By.xpath(first + i + last)).getText());
			list.add(driver.findElement(By.xpath(first + i + nlast)).getText());
		}
		list.add(driver.findElement(By.xpath(first + n1last)).getText());
		for (int i = 5; i <= 7; i++) {
			if (i % 2 == 0) {
				list.add(driver.findElement(By.xpath(first + i + n2last))
						.getText());
			} else {
				list.add(driver.findElement(By.xpath(first + i + last))
						.getText());
			}

		}
		list.add(driver.findElement(By.xpath(first + n3last)).getText());
		list.add(driver.findElement(By.xpath(first + n4last)).getText());
		list.add(driver.findElement(By.xpath(first + n5last)).getText());
		list.add(driver.findElement(By.xpath(first + n6last)).getText());
		list.add(driver.findElement(By.xpath(first + n7last)).getText());
		list.add(driver.findElement(By.xpath(first + "8]/td/p/strong"))
				.getText());
		return list;
	}

	public ArrayList<String> tableData2() {
		ArrayList<String> list = new ArrayList<String>();
		String hfirst = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[9]/td/div/table[1]/tbody/tr[1]/td[";
		String hlast = "]/p";
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[9]/td/div/table[1]/tbody/tr[";
		String last = "]/td[1]";
		String last2 = "]/td[2]/p";
		String last3 = "]/td[3]/p";
		String last4 = "]/td[4]/p";
		for (int i = 2; i <= 36; i++) {
			list.add(driver.findElement(By.xpath(first + i + last)).getText());
		}
		for (int i = 1; i <= 4; i++) {
			list.add(driver.findElement(By.xpath(hfirst + i + hlast)).getText());
		}
		for (int i = 2; i <= 36; i++) {
			list.add(driver.findElement(By.xpath(first + i + last2)).getText());
			list.add(driver.findElement(By.xpath(first + i + last3)).getText());
			list.add(driver.findElement(By.xpath(first + i + last4)).getText());
		}
		return list;
	}

	public ArrayList<String> tableData3() {
		ArrayList<String> list = new ArrayList<String>();
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[9]/td/div/table[2]/tbody/tr[";
		String colfirst = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[9]/td/div/table[2]/tbody/tr[2]/td[";
		String collast = "]/p";
		String flast = "]/td[1]/ol";
		String hlast = "1]/td/strong";
		String l2last = "]/td[2]/p";
		String l3last = "]/td[3]/p";
		for (int i = 3; i <= 38; i++) {
			list.add(driver.findElement(By.xpath(first + i + flast))
					.getAttribute("start"));
		}
		list.add(driver.findElement(By.xpath(first + hlast)).getText());
		for (int i = 1; i <= 5; i++) {
			list.add(driver.findElement(By.xpath(colfirst + i + collast))
					.getText());
		}
		for (int i = 3; i <= 38; i++) {
			list.add(driver.findElement(By.xpath(first + i + l2last)).getText());
		}
		for (int i = 3; i <= 38; i++) {
			list.add(driver.findElement(By.xpath(first + i + l3last)).getText());
		}
		return list;
	}

	public ArrayList<String> tableData3_1() {
		String first = "//*[@id='frame1']/div/div/div[1]/table/tbody/tr[9]/td/div/table[2]/tbody/tr[";
		String l4last = "]/td[4]/p";
		String l5last = "]/td[5]/p";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 3; i <= 38; i++) {
			list.add(driver.findElement(By.xpath(first + i + l4last)).getText());
			list.add(driver.findElement(By.xpath(first + i + l5last)).getText());
		}
		return list;
	}

	public String footer() {
		String res = driver
				.findElement(
						By.xpath("//strong[text()='(Under The Right of Information Act, 2005)']"))
				.getText();
		return res;
	}
}