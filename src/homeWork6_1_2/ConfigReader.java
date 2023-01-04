package homeWork6_1_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader extends CommonMethods {

	public static Properties prop;

	public static void configSetUp(String filePath) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);

		prop = new Properties();
		prop.load(fis);
		fis.close();
	}

	public static String getKey(String key) {
		return prop.getProperty(key);
	}

}
