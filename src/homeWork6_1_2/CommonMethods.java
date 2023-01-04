package homeWork6_1_2;

import org.openqa.selenium.By;

public class CommonMethods {

	public static void wait(int time) {

		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void cssClick(String csselement) {

		Base.driver.findElement(By.cssSelector(csselement)).click();

	}

	public static void csselement(String element) {
		wait(2);
		Base.driver.findElement(By.cssSelector(element));

	}

	public static void cssSendKey(String element, String key) {
		wait(2);
		Base.driver.findElement(By.cssSelector(element)).sendKeys(key);
		;

	}

	public static void xpathClick(String element) {
		wait(2);
		Base.driver.findElement(By.xpath(element)).click();
	}

}
