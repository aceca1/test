package HomeWork4;

public class hw2 {

//	Radio Button Practice  
//	Open chrome browser
//	Go to "http://uitestpractice.com/Students/Form"
//	Verify if all radio buttons are displayed and clickable
//	Click on all radio buttons
//	Verify radio buttons has been clicked successfully
//	Quit browser

	public static String url = "http://uitestpractice.com/Students/Form";

	public static void main(String[] args) throws InterruptedException {

		String t = System.getProperty("user.dir") + "/configs/configuration.properties";
		System.out.println(System.getProperty("user.dir"));
		System.out.println(t);
	}

}
