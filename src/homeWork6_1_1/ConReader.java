package homeWork6_1_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConReader {
	public static Properties prop;

	public static void readProperties(String filePath) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);

		prop = new Properties();

		prop.load(fis);

		fis.close();
	}

	public static String getProperties(String key) {
		return prop.getProperty(key);
	}

}
