package homeWork6_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;

	public static void confReader(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		prop = new Properties();
		prop.load(fis);
		fis.close();
	}

	public static String getReader(String key) {
		return prop.getProperty(key);

	}

}
