package homeWork4_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;

	public static void getWeb(String url) {

		System.getProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
	}

	public static WebElement findElementCss(String css) throws InterruptedException {
		Thread.sleep(2000);

		return driver.findElement(By.cssSelector(css));
	}

	public static void fECss(String css, String key) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(css)).sendKeys(key);
	}

	public static void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public static List<WebElement> findEsCss(String css) throws InterruptedException {
		Thread.sleep(2000);

		return driver.findElements(By.cssSelector(css));
	}

}
