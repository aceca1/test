package homeWork4_1;

public class hw1 {

	public static void main(String[] args) throws InterruptedException {

		Launch.getWeb("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		Launch.fECss("#ctl00_MainContent_username", "Tester");
		Launch.findElementCss("#ctl00_MainContent_username").clear();
		Launch.fECss("#ctl00_MainContent_username", "Tester");
		Launch.findElementCss("#ctl00_MainContent_login_button").click();
		Boolean b = Launch.findElementCss("#ctl00_MainContent_status").isDisplayed();
		System.out.println(b);

		Launch.quit();

	}

}
