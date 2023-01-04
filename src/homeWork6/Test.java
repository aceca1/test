package homeWork6;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test extends Base {

	public static void main(String[] args) throws InterruptedException, IOException {
		setup();

		WebElement departament = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select sel = new Select(departament);
		System.out.println("[first way] there are " + sel.getOptions().size());
		List<WebElement> list = sel.getOptions();
		System.out.println("[second way]There are " + list.size());
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
		for (WebElement e : list) {
			if (e.getText().equals("Computers")) {
				e.click();
			}
		}

		quit();
	}

}
