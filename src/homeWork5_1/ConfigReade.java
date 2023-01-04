package homeWork5_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReade {

	public static Properties prop;

	public static void readProperties(String filePath) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);
		prop = new Properties();
		prop.load(fis);
		fis.close();
	}

	/**
	 * 
	 * @param key
	 * @return String
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);

	}

}
