package homeWork6_1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		setUp();
		driver.findElement(
				By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3) > div > div.card-body"))
				.click();
		List<WebElement> aler = driver.findElements(By.cssSelector("#item-1"));
		for (WebElement e : aler) {
			System.out.println(e.getText());
			if (e.getText().equals("Alerts")) {
				e.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("[id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(1000);
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.cssSelector("#promtButton")).click();
		alert.sendKeys("Armando");
		Thread.sleep(1000);
		alert.accept();

		quit();
	}

}
