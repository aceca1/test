package homeWork5;

public class hw1 {

	public static void main(String[] args) throws InterruptedException {
		Boolean n;

		Base.getWeb("https://hrm.neotechacademy.com/");
		Base.fECss("#txtUsername", "Admin");
		Base.fECss("#txtPassword", "Neotech@123");
		Base.findElementCss("[type=submit]").click();
		String name = Base.findElementCss("#account-name").getText();
		if (name.contains("Jacquline White")) {
			n = true;
		} else {
			n = false;
		}

		System.out.println("Does \"span with id account-name\" has the text \"Jacqueline White\"? " + n);
		Base.quit();
	}

}
