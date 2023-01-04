package homeWork6_1_1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

	public static void setUp() throws IOException {

		ConReader.readProperties(Constant.FILE_PATH);
		String browser = ConReader.getProperties("browser");

		if (browser.toLowerCase().equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER);
			driver = new ChromeDriver();

		} else if (browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
		}
		driver.get(ConReader.getProperties("url"));

	}

	public static void quit() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
