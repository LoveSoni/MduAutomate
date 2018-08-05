package com.mdu.Pages;

import com.mdu.Base.Base;

public class CollegePortalPage extends Base {
	public String title() {
		String res = driver.getTitle();
		return res;
	}
}
