package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hw1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(1000);

		chrome.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		chrome.findElement(By.name("firstName")).sendKeys("Bolo");
		Thread.sleep(1000);
		chrome.findElement(By.name("lastName")).sendKeys("test");
		Thread.sleep(1000);
		chrome.findElement(By.name("phone")).sendKeys("54545454515");
		Thread.sleep(1000);
		chrome.findElement(By.name("userName")).sendKeys("ac@hotmail.com");
		Thread.sleep(1000);
		chrome.findElement(By.name("address1")).sendKeys("texas");
		Thread.sleep(1000);
		chrome.findElement(By.name("city")).sendKeys("dallas");
		Thread.sleep(1000);
		chrome.findElement(By.name("state")).sendKeys("texas232");
		Thread.sleep(1000);
		chrome.findElement(By.name("postalCode")).sendKeys("75555");
		Thread.sleep(1000);
		Select drpC = new Select(chrome.findElement(By.name("country")));
		Thread.sleep(1000);
		drpC.selectByVisibleText("BELIZE");
		Thread.sleep(1000);
		chrome.findElement(By.name("email")).sendKeys("bolo1");
		Thread.sleep(1000);
		chrome.findElement(By.name("password")).sendKeys("testtest");
		Thread.sleep(1000);
		chrome.findElement(By.name("confirmPassword")).sendKeys("testtest");
		Thread.sleep(1000);
		chrome.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		Thread.sleep(1000);
		chrome.close();

	}

}
