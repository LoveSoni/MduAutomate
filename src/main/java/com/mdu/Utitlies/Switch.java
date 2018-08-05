package com.mdu.Utitlies;

import java.util.Iterator;
import java.util.Set;
import com.mdu.Base.Base;

public class Switch extends Base {
	public static void toTab() {
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		it.next();
		String childwind = it.next();
		driver.switchTo().window(childwind);
	}
}
