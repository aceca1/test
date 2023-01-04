package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2 {

	public static void main(String[] args) {
		System.getProperty("wevdriver.chrome.driver", "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.cssSelector("[href='register.php']")).click();
		driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("mandi");
		driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("545-545-5884");
		driver.findElement(By.cssSelector("#userName")).sendKeys("test2");
		try {
			driver.findElement(By.xpath("//[@name='city']")).sendKeys("Teksas");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("[name='state'")).sendKeys("tekas");
		driver.findElement(By.cssSelector("[name='postalCode']")).sendKeys("5745");
		driver.findElement(By.cssSelector("[name='country']")).sendKeys("LIBERIA");

	}

}
