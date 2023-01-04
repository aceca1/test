package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"))
				.sendKeys("Dardan");

		driver.findElement(By.name("lastname")).sendKeys("Meshi");

		driver.findElement(By.id("password_step_input")).sendKeys("dani.meshi@hotmail.com");
		driver.findElement(By.id("month")).sendKeys("May");

		driver.findElement(By.id("day")).sendKeys("22");
		driver.findElement(By.id("year")).sendKeys("1995");
		WebElement radio = driver.findElement(By.id("u_2_5_aB"));
		radio.click();

	}

}
