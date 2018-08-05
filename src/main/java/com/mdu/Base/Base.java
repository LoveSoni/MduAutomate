package com.mdu.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static AndroidDriver<?> driver;

	public void init() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		try {
			driver = new AndroidDriver<>(
					new URL("http://127.0.0.1:4723/wd/hub"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://www.mdurohtak.ac.in/");
	}
}
