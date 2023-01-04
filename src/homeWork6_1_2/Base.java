package homeWork6_1_2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base extends ConfigReader {
	public static WebDriver driver;

	public static void setUp() {

		try {
			configSetUp(Constant.FILE_PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can not load configSetUp");
		}
		String browser = getKey("browser");

		if (browser.toLowerCase().equals("chrome")) {
			System.getProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER);
			driver = new ChromeDriver();
		} else if (browser.toLowerCase().equals("firefox")) {
			System.getProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Can not open chrom or firefox driver");
		}
		driver.get(getKey("url"));

	}

	public static void quit() {
		wait(3);

		if (driver != null) {
			driver.quit();
		}
	}

}
