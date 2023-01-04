package homeWork5;

import org.openqa.selenium.By;

public class Hw2 {

	public static void main(String[] args) throws InterruptedException {
		Boolean n;
		Base.getWeb(" https://hrm.neotechacademy.com/");
		Base.fECss("#txtUsername", "Admin");
		Base.fECss("#txtPassword", "Neotech@123");
		Base.findElementCss("[type=submit]");
		String error = Base.driver.findElement(By.cssSelector("#txtPassword-error")).getText();
		if (error.equals("Password cannot be empty")) {
			n = true;
		} else {
			n = false;
		}
		System.out.println("The error showed is  " + error + " is " + n + "\n also the error is displayed "
				+ Base.driver.findElement(By.cssSelector("#txtPassword-error")).isDisplayed());

		Base.quit();
	}

}
