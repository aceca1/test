package homeWork6_1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base extends ConfigReader {

	public static WebDriver driver;

	public static void setUp() throws IOException {

		confReader(Constant.FILE_PATH);

		switch (getReader("browser")) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER);
			driver = new ChromeDriver();

			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER);

			driver = new FirefoxDriver();

			break;

		default:
			throw new RuntimeException("Browser is not supported!!!");
		}

		driver.get(getReader("url"));

	}

	public static void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
