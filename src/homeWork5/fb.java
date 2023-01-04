package homeWork5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("WebDriver.Chrome.Driver", "/drivers/chromedriver.exe");

		WebDriver b = new ChromeDriver();

		b.get("https://www.facebook.com/r.php");

		Select d = new Select(b.findElement(By.id("month")));
		Select g = new Select(b.findElement(By.id("month")));

		List<WebElement> months = d.getOptions();
		for (int e = 0; e < months.size(); e++) {
			System.out.println(months.get(e).getText());
		}

		Thread.sleep(2000);
		b.quit();

	}

}
