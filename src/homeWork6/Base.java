package homeWork6;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base extends ConfigReader {

	public static WebDriver driver;

	public static void setup() throws IOException {
		connectReader(Constat.File_Path);
		String browser = getprop("browser");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constat.Chrome_Driver);
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", Constat.Chrome_Driver);
			driver = new FirefoxDriver();

		} else {
			System.out.println("Web Browser can not open");
		}
		driver.get(getprop("url"));

	}

	public static void quit() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();
	}

}
