package appApayloDataproviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @name : ConfigFileReader
 * @author Ramakrishna
 * @description reads the config properties file and returns the specific value
 *
 */
public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir")+"\\configs\\configurations.properties";

	//******************************************************

	/**
	 * Constructor
	 * @name : ConfigFileReader
	 * @description loads the config file to get the properties
	 */
	public ConfigFileReader() {
		System.out.println("Into Config file reader");
		BufferedReader reader;	
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	
	//******************************************************

	/**
	 * @name : getDriverPath
	 * @description get the location of the driver
	 * @return - String
	 */

	@SuppressWarnings("unused")
	public String getApkPath() {

		String apk_Path = System.getProperty("user.dir") + properties.getProperty("apk_path");

		if (apk_Path != null)
			return apk_Path;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getImplicitlyWait
	 * @description get the specified time, from the property of implicitlywait
	 * @return - long
	 */
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlywait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getWebDriverWait
	 * @description get the webdriver wait, from the property of webdriverwait
	 * @return - int
	 */
	public int getAndroidDriverWait() {
		String androiddriverwait = properties.getProperty("androiddriverwait");
		if (androiddriverwait != null)
			return Integer.parseInt(androiddriverwait);
		else
			throw new RuntimeException("webdriverwait not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getPause
	 * @description get the pause time, from the property of pause
	 * @return - long
	 */
	public long getPause() {
		String pause = properties.getProperty("pause");
		if (pause != null)
			return Long.parseLong(pause);
		else
			throw new RuntimeException("pause not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getPageLoadPause
	 * @description get the page load pause time, from the property of pageloadpause
	 * @return - long
	 */
	public long getPageLoadPause() {
		String pageloadpause = properties.getProperty("pageloadpause");
		if (pageloadpause != null)
			return Long.parseLong(pageloadpause);
		else
			throw new RuntimeException("pageloadpause not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getElementsLoadTime
	 * @description get the elements load time, from the property of
	 *              elementsloadtime
	 * @return - long
	 */
	public long getElementsLoadTime() {
		String elementsloadtime = properties.getProperty("elementsloadtime");
		if (elementsloadtime != null)
			return Long.parseLong(elementsloadtime);
		else
			throw new RuntimeException("elementsloadtime not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getBrowser
	 * @description get the browser name, from the property of browser
	 * @return - String
	 */
	public String getPlatform() {
		String platformName = properties.getProperty("platformType");
		if (platformName != null)
			return platformName;
		else
			throw new RuntimeException(
					"Platform Type Key value not specified in Configuration.properties is not matched : " + platformName);
	}

	/**
	 * @name : getReportConfigPath
	 * @description get the report config file Path, from the property of
	 *              reportConfigPath
	 * @return - String
	 */
	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	/**
	 * @name : getObjectRepoPath
	 * @description get the Object repository file Path, from the property of
	 *              ObjectRepoPath
	 * @return - String
	 */
	public String getObjectRepoPath() {
		String objectConfigPath = properties.getProperty("ObjectRepoPath");
		if (objectConfigPath != null)
			return objectConfigPath;
		else
			throw new RuntimeException(
					"Object Repo Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	/**
	 * @name : getDocumentType
	 * @description get the template file type, from the property of template
	 * @return - String
	 */
	@SuppressWarnings("unused")
	public String getDocumentType() {
		String template = System.getProperty("user.dir") + properties.getProperty("template");
		if (template != null)
			return template;
		else
			throw new RuntimeException("template is not specified in the Configuration.properties file.");
	}

	/**
	 * @name : getRegularExpProperty
	 * @description get the regular expression property, from the property of
	 *              property
	 * @return - String
	 */
	public String getRegularExpProperty(String property) {
		String objectConfigPath = properties.getProperty(property);
		if (objectConfigPath != null)
			return objectConfigPath;
		else
			throw new RuntimeException(
					"Object Repo Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	/**
	 * @name : getDeviceType
	 * @description get the device type property, from the property file
	 * @return - String
	 */
	public String getDeviceType() {
		String deviceType = properties.getProperty("devicetype");
		if (deviceType != null)
			return deviceType;
		else
			throw new RuntimeException(
					"Object Repo Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	/**
	 * @name : getAppName
	 * @description get the apk Name property, from the property file
	 * @return - String
	 */
	public String getApkName() {
		String appName = properties.getProperty("app_name");
		if (appName != null)
			return appName;
		else
			throw new RuntimeException(
					"Object Repo Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
