package appApayloDataproviders;

/**
 * @name : FileReaderManager
 * @author Ramakrishna
 * @description we will be having many more file readers, So it is better to
 *              have a File Reader Manager it’s appropriate to have exactly one
 *              instance of a class
 * 
 */
public class FileReaderManager {

	private static ConfigFileReader configFileReader;
	private static SBMFileReader sbmFileReader;

	private FileReaderManager() {

	}

	/**
	 * @name : getConfigFileReader
	 * @description loads the config file to return of the ConfigFileReader instance
	 * @return - ConfigFileReader
	 */
	public static ConfigFileReader getConfigFileReader() {

		if (configFileReader != null) {
			return configFileReader;
		} else {
			configFileReader = new ConfigFileReader();
			return configFileReader;
		}
	}

	/**
	 * @name : getSBMFileReader
	 * @description - loads the config file to return of the SBMFileReader instance
	 * @return - SBMFileReader
	 */
	public static SBMFileReader getsbmFileReader() {

		if (sbmFileReader != null) {
			return sbmFileReader;
		} else {
			sbmFileReader = new SBMFileReader();
			return sbmFileReader;
		}
	}

}
