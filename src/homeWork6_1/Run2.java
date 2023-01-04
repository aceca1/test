package homeWork6_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run2 extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		setUp();

		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div[1]/div[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("div[data-value='css']")).click();

		Thread.sleep(3000);

		WebElement css = driver.findElement(By.cssSelector("a[data-value='css']"));
		System.out.println(css.isDisplayed());

		Thread.sleep(3000);

		quit();

	}

}
