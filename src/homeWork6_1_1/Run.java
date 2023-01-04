package homeWork6_1_1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Run extends Base {

	public static void main(String[] args) throws IOException {

		setUp();

		WebElement departaments = driver.findElement(By.cssSelector("#searchDropdownBox"));

		Select sel = new Select(departaments);
		List<WebElement> list = sel.getOptions();

		System.out.println("There are: " + list.size());
		int a = 1;
		for (WebElement e : list) {
			System.out.println(a + "-->" + e.getText());
			a++;
			if (e.getText().toLowerCase().equals("computers")) {
				e.click();
			}
		}

		quit();

	}

}