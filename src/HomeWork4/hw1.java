package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
//	===========HW-1==========
//	Open chrome browser
//	Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	Enter valid username
//	Clear username and enter again valid username
//	Leave password field empty
//	Click on login button
//	Verify error message with text "Invalid Login or Password." is displayed.
//	
//	

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement user = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));

		user.sendKeys("Tester");
		Thread.sleep(3000);
		user.clear();
		Thread.sleep(3000);
		user.sendKeys("Tester");
		WebElement submit = driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
		submit.click();
		Thread.sleep(3000);
		WebElement invalid = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_status\"]"));
		String str = invalid.getText();
		if (str.equals("Invalid Login or Password.")) {
			System.out.println("The error message text is " + str);
		}
		Thread.sleep(3000);

		driver.quit();
	}

}
