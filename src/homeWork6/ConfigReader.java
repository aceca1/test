package homeWork6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;

	public static void connectReader(String filePath) throws IOException {
		FileInputStream fil = new FileInputStream(filePath);

		prop = new Properties();

		prop.load(fil);
		fil.close();

	}

	public static String getprop(String key) {

		return prop.getProperty(key);

	}

}
