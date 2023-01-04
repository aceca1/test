package HomeWork3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");

		WebDriver chrome = new ChromeDriver();

		chrome.get("http://demo.guru99.com/test/newtours/");

		chrome.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		ArrayList<String> name1 = new ArrayList();
		chrome.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mr.chicken");
		chrome.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Potato");
		chrome.findElement(By.xpath("//input[@name='phone'")).sendKeys("845-845-6555");
		chrome.findElement(By.xpath("//input[@name='userName'")).sendKeys("test@gmail.com");
		chrome.findElement(By.xpath("//input[@name='address1'")).sendKeys("Texsas");
		chrome.findElement(By.xpath("//input[@name='city]")).sendKeys("Benrook");
		chrome.findElement(By.xpath("//input[@name='state']")).sendKeys("texas");

		// chrome.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mr.Chicken");

		Thread.sleep(3000);

		chrome.quit();

	}

}
