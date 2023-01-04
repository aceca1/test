package homeWork5_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

	public static void setUp() throws IOException {

		ConfigReade.readProperties(ConstantVariables.File_Path);

		if (ConfigReade.getProperty("browser").equals("chrome")) {

			System.setProperty("WebDriver.chrome.Driver", "ConstantVariables.Chrome_Driver");
			driver = new ChromeDriver();

		} else if (ConfigReade.getProperty("browser").equals("gecko")) {
			System.setProperty("WebDriver.gecko.Driver", "ConstantVariables.Gecko_Driver");
			driver = new FirefoxDriver();

		} else {
			System.out.println("Can not open a Browser");
		}

		driver.get(ConfigReade.getProperty("url"));

	}

	public static void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static void logIn() {
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigReade.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigReade.getProperty("password"));
		driver.findElement(By.cssSelector("[type=submit]")).click();
	}

}
