package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	private Properties prop = null;

	public PropertiesUtil() throws FileNotFoundException, IOException {

		try {
			this.prop = new Properties();
			prop.load(new FileInputStream(System.getProperty("user.dir") + "\\" + "Config"+"\\"+"amazom_app.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getPropertyValue(String key) {
		return prop.getProperty(key);
	}

}