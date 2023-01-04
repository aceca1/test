package homeWork7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import homeWork6_1_2.Base;

public class Run extends Base {

	public static void main(String[] args) {

		setUp();

		cssClick("body > p > a");
		
		

		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		
		List<String> win=new ArrayList(driver.getWindowHandles());
		String win1= win.get(0);
		System.out.println(win1);

		Iterator<String> it = window.iterator();

		String window1 = it.next();
		
		String window2 = it.next();
		

		driver.switchTo().window(window2);

		cssSendKey("body > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]",
				"email@gmail.com");

		wait(2);

		cssClick("body > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > input[type=submit]");

		driver.close();

		quit();

	}

}
