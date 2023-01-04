package homeWork6_1_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Run extends Base {

	public static void main(String[] args) {
		setUp();

		cssClick("#app > div > div > div.home-body > div > div:nth-child(3) > div > div.card-body");
		xpathClick("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
		cssClick("#alertButton");

		Alert alert = driver.switchTo().alert();

		if (alert.getText().equals("You clicked a button")) {
			System.out.println("Test 1 passed");

		} else {
			throw new RuntimeException("Test 1 faild");
		}

		alert.accept();
		wait(2);
		cssClick("#confirmButton");

		if (alert.getText().equals("Do you confirm action?")) {
			System.out.println("Test 2 passed");

		} else {
			throw new RuntimeException("Test 2 faild");
		}
		alert.accept();

		wait(2);
		cssClick("#promtButton");
		alert.sendKeys("test");
		alert.accept();
		String text = driver.findElement(By.cssSelector("#promptResult")).getText();

		if (text.equals("You entered test")) {
			System.out.println("Test 3 passed");

		} else {
			throw new RuntimeException("Test 3 faild");
		}

		quit();
	}

}
