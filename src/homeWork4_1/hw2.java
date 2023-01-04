package homeWork4_1;

import java.util.List;

import org.openqa.selenium.WebElement;

public class hw2 {

	public static void main(String[] args) throws InterruptedException {
		Launch.getWeb("http://uitestpractice.com/Students/Form");
		List<WebElement> b = Launch.findEsCss("[name=optradio]");

		for (WebElement e : b) {
			System.out.println("Is it displayed " + e.isDisplayed());
			e.click();
			System.out.println("Is it selected " + e.isSelected());
			Thread.sleep(2000);
		}

		Launch.quit();

	}

}
