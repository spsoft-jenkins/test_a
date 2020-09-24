package appApayloDataproviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import appApayloUtilities.Log;

/**
 * @name : SBMFileReader
 * @author Deepa H
 * @description - reads the SBM properties file and returns the specific value
 *
 */
public class SBMFileReader {
	private Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir") + "\\configs\\SBM.properties";

	
	// *************************************************

	/**
	 * @Constructor
	 * @name : SBMFileReader
	 * @description - loads the config file to get the properties
	 */
	public SBMFileReader() {
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
			throw new RuntimeException("SBM.properties not found at " + propertyFilePath);
		}
	}

	//*************************************************
	
	/**
	 * @name : getLoginPassword
	 * @description get the Password property, from the property file
	 * @return - String
	 */
	public String getLoginPassword() {
		String pasword = properties.getProperty("loginPassword");
		if (pasword != null)
			return pasword;
		else
			throw new RuntimeException("Login Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidLoginPassword
	 * @description get the Invalid Login Password property, from the property file
	 * @return - String
	 */
	public String getInvalidLoginPassword() {
		String invalidLoginPassword = properties.getProperty("invalidLoginPassword");
		if (invalidLoginPassword != null)
			return invalidLoginPassword;
		else
			throw new RuntimeException("Invalid Login Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidLoginEmailAddress
	 * @description get the Invalid Email Address property, from the property file
	 * @return - String
	 */
	public String getInvalidLoginEmailAddress() {
		String invalidLoginEmailAddress = properties.getProperty("invalidLoginEmailAddress");
		if (invalidLoginEmailAddress != null)
			return invalidLoginEmailAddress;
		else
			throw new RuntimeException("Invalid Login Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getLoginEmailAddress
	 * @description get the Email Address property, from the property file
	 * @return - String
	 */
	public String getLoginEmailAddress() {
		String emailAddress = properties.getProperty("loginEmailAddress");
		if (emailAddress != null)
			return emailAddress;
		else
			throw new RuntimeException("Login Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getEmailAddressErrMsg
	 * @description get the Email Address Error message property, from the property
	 *              file
	 * @return - String
	 */
	public String getEmailAddressErrMsg() {
		String emailAddressErrMsg = properties.getProperty("emailAddressErrMsg");
		if (emailAddressErrMsg != null)
			return emailAddressErrMsg;
		else
			throw new RuntimeException("Email Address Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidEmailOrPasswordErrMsg
	 * @description get the Invalid Email Address or Password Error message
	 *              property, from the property file
	 * @return - String
	 */
	public String getInvalidEmailOrPasswordErrMsg() {
		String invalidEmailOrPasswordErrMsg = properties.getProperty("invalidEmailOrPasswordErrMsg");
		if (invalidEmailOrPasswordErrMsg != null)
			return invalidEmailOrPasswordErrMsg;
		else
			throw new RuntimeException(
					"Invalid Email Address or Password Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstName
	 * @description - By using this method we can get the First Name property, from
	 *              the property file
	 * @return - String
	 */
	public String getFirstName() {
		String firstName = properties.getProperty("firstName");
		if (firstName != null)
			return firstName;
		else
			throw new RuntimeException("First Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstNameLessThn3
	 * @description - By using this method we can get the First Name Less Than 3
	 *              characters property, from the property file
	 * @return - String
	 */
	public String getFirstNameLessThn3() {
		String firstNmLessThn3 = properties.getProperty("firstNmLessThn3");
		if (firstNmLessThn3 != null)
			return firstNmLessThn3;
		else
			throw new RuntimeException("First Name Less Than 3 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getErrMsgWhnFirstNmLessThn3
	 * @description - By using this method we can get the Error message when First
	 *              Name Less Than 3 characters property, from the property file
	 * @return - String
	 */
	public String getErrMsgWhnFirstNmLessThn3() {
		String errMsgWhnFirstNmLessThn3 = properties.getProperty("errMsgWhnFirstNmLessThn3");
		if (errMsgWhnFirstNmLessThn3 != null)
			return errMsgWhnFirstNmLessThn3;
		else
			throw new RuntimeException(
					"Error message when First Name Less Than 3 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstNameErrorMsg
	 * @description - By using this method we can get the First Name Error Message
	 *              property, from the property file
	 * @return - String
	 */
	public String getFirstNameErrorMsg() {
		String firstNameMsg = properties.getProperty("firstNameMsg");
		if (firstNameMsg != null)
			return firstNameMsg;
		else
			throw new RuntimeException("First Name Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getLastName
	 * @description - By using this method we can get the Last Name property, from
	 *              the property file
	 * @return - String
	 */
	public String getLastName() {
		String lastName = properties.getProperty("lastName");
		if (lastName != null)
			return lastName;
		else
			throw new RuntimeException("Last Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getLastName
	 * @description - By using this method we can get the Last Name Error Message
	 *              property, from the property file
	 * @return - String
	 */
	public String getLastNameErrorMsg() {
		String lastNameMsg = properties.getProperty("lastNameMsg");
		if (lastNameMsg != null)
			return lastNameMsg;
		else
			throw new RuntimeException("Last Name Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getMobileNumber
	 * @description - By using this method we can get the Mobile Number property,
	 *              from the property file
	 * @return - String
	 */
	public String getMobileNumber() {
		String mobileNumber = properties.getProperty("mobileNumber");
		if (mobileNumber != null)
			return mobileNumber;
		else
			throw new RuntimeException("Mobile Number not specified in the SBM.properties file");
	}

	/**
	 * @name : getMobileNumLessThn10
	 * @description - By using this method we can get the Mobile Number less than 10
	 *              property, from the property file
	 * @return - String
	 */
	public String getMobileNumLessThn10() {
		String mobileNumLessThn10 = properties.getProperty("mobileNumLessThn10");
		if (mobileNumLessThn10 != null)
			return mobileNumLessThn10;
		else
			throw new RuntimeException("Mobile Number less than 10 not specified in the SBM.properties file");
	}

	/**
	 * @name : getErrMsgWhnMobileNumLessThn10
	 * @description - By using this method we can get the Error Message When Mobile
	 *              Number less than 10 digits property, from the property file
	 * @return - String
	 */
	public String getErrMsgWhnMobileNumLessThn10() {
		String errMsgWhnMobileNumLessThn10 = properties.getProperty("errMsgWhnMobileNumLessThn10");
		if (errMsgWhnMobileNumLessThn10 != null)
			return errMsgWhnMobileNumLessThn10;
		else
			throw new RuntimeException(
					"Error Message When Mobile Number less than 10 digits not specified in the SBM.properties file");
	}

	/**
	 * @name : getMobileNumberErrorMsg
	 * @description - By using this method we can get the Mobile Number Error
	 *              Message property, from the property file
	 * @return - String
	 */
	public String getMobileNumberErrorMsg() {
		String mobileNumberMsg = properties.getProperty("mobileNumberMsg");
		if (mobileNumberMsg != null)
			return mobileNumberMsg;
		else
			throw new RuntimeException("Mobile Number Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidMobileNum
	 * @description - By using this method we can get the Invalid Mobile Number
	 *              property, from the property file
	 * @return - String
	 */
	public String getInvalidMobileNum() {
		String invalidMobileNum = properties.getProperty("invalidMobileNum");
		if (invalidMobileNum != null)
			return invalidMobileNum;
		else
			throw new RuntimeException("Invalid Mobile Number not specified in the SBM.properties file");
	}

	/**
	 * @name : getErrMsgWhnEntrInvalidNum
	 * @description - By using this method we can get the Invalid Mobile Number
	 *              Error Message property, from the property file
	 * @return - String
	 */
	public String getErrMsgWhnEntrInvalidNum() {
		String errMsgWhnEntrInvalidNum = properties.getProperty("errMsgWhnEntrInvalidNum");
		if (errMsgWhnEntrInvalidNum != null)
			return errMsgWhnEntrInvalidNum;
		else
			throw new RuntimeException("Invalid Mobile Number Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getEmailAddress
	 * @description - By using this method we can get the Email Address
	 *              property,from the property file
	 * @return - String
	 */
	public String getEmailAddress() {
		String emailAddress = properties.getProperty("emailAddress");
		if (emailAddress != null)
			return emailAddress;
		else
			throw new RuntimeException("Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getEmailAddLessThn6
	 * @description - By using this method we can get the Email Address Less than 6
	 *              characters property, from the property file
	 * @return - String
	 */
	public String getEmailAddLessThn6() {
		String emailAddLessThn6 = properties.getProperty("emailAddLessThn6");
		if (emailAddLessThn6 != null)
			return emailAddLessThn6;
		else
			throw new RuntimeException("Email Address Less than 6 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getErrMsgWhnEmailAddLessThn6
	 * @description - By using this method we can get the Error Message when Email
	 *              Address Less than 6 characters property, from the property file
	 * @return - String
	 */
	public String getErrMsgWhnEmailAddLessThn6() {
		String errMsgWhnEmailAddLessThn6 = properties.getProperty("errMsgWhnEmailAddLessThn6");
		if (errMsgWhnEmailAddLessThn6 != null)
			return errMsgWhnEmailAddLessThn6;
		else
			throw new RuntimeException(
					"Error Message when Email Address Less than 6 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidEmailAdd
	 * @description - By using this method we can get the Invalid Email Address
	 *              property, from the property file
	 * @return - String
	 */
	public String getInvalidEmailAdd() {
		String invalidEmailAdd = properties.getProperty("invalidEmailAdd");
		if (invalidEmailAdd != null)
			return invalidEmailAdd;
		else
			throw new RuntimeException("Invalid Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidEmailAdd
	 * @description - By using this method we can get the Error Message when Invalid
	 *              Email Address property, from the property file
	 * @return - String
	 */
	public String getErrMsgWhnInvalidEmailAdd() {
		String errMsgWhnInvalidEmailAdd = properties.getProperty("errMsgWhnInvalidEmailAdd");
		if (errMsgWhnInvalidEmailAdd != null)
			return errMsgWhnInvalidEmailAdd;
		else
			throw new RuntimeException(
					"Error Message when Invalid Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getEmailAddressErrorMsg
	 * @description - By using this method we can get the Email Address Error
	 *              Message property, from the property file
	 * @return - String
	 */
	public String getEmailAddressErrorMsg() {
		String emailAddressMsg = properties.getProperty("emailAddressMsg");
		if (emailAddressMsg != null)
			return emailAddressMsg;
		else
			throw new RuntimeException("Email Address Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getPassword
	 * @description - By using this method we can get the Password property, from
	 *              the property file
	 * @return - String
	 */
	public String getPassword() {
		String password = properties.getProperty("password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getPasswordLessThn8
	 * @description - By using this method we can get the Password Less than 10
	 *              characters property, from the property file
	 * @return - String
	 */
	public String getPasswordLessThn8() {
		String passwordLessThn10 = properties.getProperty("passwordLessThn8");
		if (passwordLessThn10 != null)
			return passwordLessThn10;
		else
			throw new RuntimeException("Password Less than 10 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getErrMsgWhnPassLessThn8
	 * @description - By using this method we can get the Error message when
	 *              Password Less than 10 characters property, from the property
	 *              file
	 * @return - String
	 */
	public String getErrMsgWhnPassLessThn8() {
		String errMsgWhnPassLessThn8 = properties.getProperty("errMsgWhnPassLessThn8");
		if (errMsgWhnPassLessThn8 != null)
			return errMsgWhnPassLessThn8;
		else
			throw new RuntimeException(
					"Error message when Password Less than 10 characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getConfirmPassword
	 * @description - By using this method we can get the Confirm Password property,
	 *              from the property file
	 * @return - String
	 */
	public String getConfirmPassword() {
		String confirmPassword = properties.getProperty("confirmPassword");
		if (confirmPassword != null)
			return confirmPassword;
		else
			throw new RuntimeException("Confirm Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getPasswordErrorMsg
	 * @description - By using this method we can get the Password Error Message
	 *              property, from the property file
	 * @return - String
	 */
	public String getPasswordErrorMsg() {
		String passwordMsg = properties.getProperty("passwordMsg");
		if (passwordMsg != null)
			return passwordMsg;
		else
			throw new RuntimeException("Password Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getRetypeYourPasswordErrorMsg
	 * @description - By using this method we can get the Retype Your Password Error
	 *              Message property, from the property file
	 * @return - String
	 */
	public String getRetypeYourPasswordErrorMsg() {
		String retypePasswordMsg = properties.getProperty("retypePasswordMsg");
		if (retypePasswordMsg != null)
			return retypePasswordMsg;
		else
			throw new RuntimeException("Retype Your Password Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getProductDeletedSuccessMsg
	 * @description - By using this method we can get the Product Deleted Success
	 *              Message property, from the property file
	 * @return - String
	 */
	public String getProductDeletedSuccessMsg() {
		String passwordMsg = properties.getProperty("productDeletedMsg");
		if (passwordMsg != null)
			return passwordMsg;
		else
			throw new RuntimeException("Product Deleted Success Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getNoInternetConn
	 * @description - By using this method we can get the No Internet connection
	 *              text property, from the property file
	 * @return - String
	 */
	public String getNoInternetConn() {
		String noInternetConn = properties.getProperty("noInternetConn");
		if (noInternetConn != null)
			return noInternetConn;
		else
			throw new RuntimeException("No internet connection text not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangeFirstName
	 * @description - By using this method we can get the First Name property, from
	 *              the property file
	 * @return - String
	 */
	public String getChangeFirstName() {
		String changeFirstName = properties.getProperty("changeFirstName");
		if (changeFirstName != null)
			return changeFirstName;
		else
			throw new RuntimeException("get First Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangeLastName
	 * @description - By using this method we can get the Last Name property, from
	 *              the property file
	 * @return - String
	 */
	public String getChangeLastName() {
		String changeLastName = properties.getProperty("changeLastName");
		if (changeLastName != null)
			return changeLastName;
		else
			throw new RuntimeException("Last Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangeCountryCode
	 * @description - By using this method we can get the Country Code property,
	 *              from the property file
	 * @return - String
	 */
	public String getChangeCountryCode() {
		String countryCode = properties.getProperty("changeCountryCode");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Country Code not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangeMobileNumber
	 * @description - By using this method we can get the Mobile Number property,
	 *              from the property file
	 * @return - String
	 */
	public String getChangeMobileNumber() {
		String changeMobileNumber = properties.getProperty("changeMobileNumber");
		if (changeMobileNumber != null)
			return changeMobileNumber;
		else
			throw new RuntimeException("Mobile Number not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxFirstName
	 * @description - By using this method we can get the Max First Name property,
	 *              from the property file
	 * @return - String
	 */
	public String getMaxFirstName() {
		String maxFirstName = properties.getProperty("maxFirstName");
		if (maxFirstName != null)
			return maxFirstName;
		else
			throw new RuntimeException("Max First Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxLastName
	 * @description - By using this method we can get the Max Last Name property,
	 *              from the property file
	 * @return - String
	 */
	public String getMaxLastName() {
		String maxLastName = properties.getProperty("maxLastName");
		if (maxLastName != null)
			return maxLastName;
		else
			throw new RuntimeException("Max Last Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxNameLength
	 * @description - By using this method we can get the Max Name length property,
	 *              from the property file
	 * @return - String
	 */
	public int getMaxNameLength() {
		int maxNameLength = properties.getProperty("maxNameLength").length();
		if (maxNameLength != 0)
			return maxNameLength;
		else
			throw new RuntimeException("Max Name length not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxEmailAddress
	 * @description - By using this method we can get the Max Email Address Error
	 *              Message property, from the property file
	 * @return - String
	 */
	public String getMaxEmailAddress() {
		String maxEmailAddress = properties.getProperty("maxEmailAddress");
		if (maxEmailAddress != null)
			return maxEmailAddress;
		else
			throw new RuntimeException("Max Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxEmailAddressLength
	 * @description - By using this method we can get the Max Email Address Length
	 *              property, from the property file
	 * @return - String
	 */
	public int getMaxEmailAddressLength() {
		int maxEmailLength = properties.getProperty("maxEmailLength").length();
		if (maxEmailLength != 0)
			return maxEmailLength;
		else
			throw new RuntimeException("Max Email Address Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxPassword
	 * @description - By using this method we can get the Max Password property,
	 *              from the property file
	 * @return - String
	 */
	public String getMaxPassword() {
		String maxPassword = properties.getProperty("maxPassword");
		if (maxPassword != null)
			return maxPassword;
		else
			throw new RuntimeException("Max Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxPasswordLength
	 * @description - By using this method we can get the Max Password Length
	 *              property, from the property file
	 * @return - String
	 */
	public int getMaxPasswordLength() {
		int maxPasswordLength = properties.getProperty("maxPasswordLength").length();
		if (maxPasswordLength != 0)
			return maxPasswordLength;
		else
			throw new RuntimeException("Max Password Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getTitleEditProfile
	 * @description - By using this method we can get the Title Edit Profile
	 *              property, from the property file
	 * @return - String
	 */
	public String getTitleEditProfile() {
		String titleEditProfile = properties.getProperty("titleEditProfile");
		if (titleEditProfile != null)
			return titleEditProfile;
		else
			throw new RuntimeException("Title Edit Profile not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangeEmailAddress
	 * @description - By using this method we can get the Email Address property,
	 *              from the property file
	 * @return - String
	 */
	public String getChangeEmailAddress() {
		String changeEmailAddress = properties.getProperty("changeEmailAddress");
		if (changeEmailAddress != null)
			return changeEmailAddress;
		else
			throw new RuntimeException("Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateVehicleType
	 * @description - By using this method we can get the Update Vehicle Type
	 *              property, from the property file
	 * @return - String
	 */
	public String getUpdateVehicleType() {
		String updateVehicleType = properties.getProperty("updateVehicleType");
		if (updateVehicleType != null)
			return updateVehicleType;
		else
			throw new RuntimeException("Update Vehicle Type not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateVehicleManufacturer
	 * @description - By using this method we can get the Update Vehicle
	 *              Manufacturer property, from the property file
	 * @return - String
	 */
	public String getUpdateVehicleManufacturer() {
		String updateVehicleManufacturer = properties.getProperty("updateVehicleManufacturer");
		if (updateVehicleManufacturer != null)
			return updateVehicleManufacturer;
		else
			throw new RuntimeException("Update Vehicle Manufacturer not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateVehicleModel
	 * @description - By using this method we can get the Update Vehicle Model
	 *              property, from the property file
	 * @return - String
	 */
	public String getUpdateVehicleModel() {
		String updateVehicleModel = properties.getProperty("updateVehicleModel");
		if (updateVehicleModel != null)
			return updateVehicleModel;
		else
			throw new RuntimeException("Update Vehicle Model not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateYear
	 * @description - By using this method we can get the Update Year property, from
	 *              the property file
	 * @return - String
	 */
	public String getUpdateYear() {
		String updateYear = properties.getProperty("updateYear");
		if (updateYear != null)
			return updateYear;
		else
			throw new RuntimeException("Update Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateModelYear
	 * @description - By using this method we can get the Model Year property, from
	 *              the property file
	 * @return - String
	 */
	public String getUpdateModelYear() {
		String updateModelYear = properties.getProperty("updateModelYear");
		if (updateModelYear != null)
			return updateModelYear;
		else
			throw new RuntimeException("Update Model Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateDay
	 * @description - By using this method we can get the Update Day property, from
	 *              the property file
	 * @return - String
	 */
	public String getUpdateDay() {
		String updateDays = properties.getProperty("updateDays");
		if (updateDays != null)
			return updateDays;
		else
			throw new RuntimeException("Update Day not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateMonth
	 * @description - By using this method we can get the Update Month property,
	 *              from the property file
	 * @return - String
	 */
	public String getUpdateMonth() {
		String updateMonth = properties.getProperty("updateMonth");
		if (updateMonth != null)
			return updateMonth;
		else
			throw new RuntimeException("Update Month not specified in the SBM.properties file");
	}

	/**
	 * @name : getArea
	 * @description - By using this method we can get the Area
	 *              property, from the property file
	 * @return - String
	 */
	public String getArea() {
		String area = properties.getProperty("area");
		if (area != null)
			return area;
		else
			throw new RuntimeException("Area not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getCountry
	 * @description - By using this method we can get the Country
	 *              property, from the property file
	 * @return - String
	 */
	public String getCountry() {
		String country = properties.getProperty("country");
		if (country != null)
			return country;
		else
			throw new RuntimeException("Country not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getState
	 * @description - By using this method we can get the State
	 *              property, from the property file
	 * @return - String
	 */
	public String getState() {
		String state = properties.getProperty("state");
		if (state != null)
			return state;
		else
			throw new RuntimeException("State not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getCity
	 * @description - By using this method we can get the City
	 *              property, from the property file
	 * @return - String
	 */
	public String getCity() {
		String city = properties.getProperty("city");
		if (city != null)
			return city;
		else
			throw new RuntimeException("City not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicleType
	 * @description - By using this method we can get the Vehicle Type property,
	 *              from the property file
	 * @return - String
	 */
	public String getVehicleType() {
		String vehicleType = properties.getProperty("vehicleType");
		if (vehicleType != null)
			return vehicleType;
		else
			throw new RuntimeException("Vehicle Type not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicleManufacturer
	 * @description - By using this method we can get the Vehicle Manufacturer
	 *              property, from the property file
	 * @return - String
	 */
	public String getVehicleManufacturer() {
		String vehicleManufacturer = properties.getProperty("vehicleManufacturer");
		if (vehicleManufacturer != null)
			return vehicleManufacturer;
		else
			throw new RuntimeException("Vehicle Manufacturer not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicleModel
	 * @description - By using this method we can get the Vehicle Model property,
	 *              from the property file
	 * @return - String
	 */
	public String getVehicleModel() {
		String vehicleModel = properties.getProperty("vehicleModel");
		if (vehicleModel != null)
			return vehicleModel;
		else
			throw new RuntimeException("Vehicle Model not specified in the SBM.properties file");
	}

	/**
	 * @name : getYear
	 * @description - By using this method we can get the Year property, from the
	 *              property file
	 * @return - String
	 */
	public String getYear() {
		String year = properties.getProperty("year");
		if (year != null)
			return year;
		else
			throw new RuntimeException("Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYear
	 * @description - By using this method we can get the Model Year property, from
	 *              the property file
	 * @return - String
	 */
	public String getModelYear() {
		String modelYear = properties.getProperty("modelYear");
		if (modelYear != null)
			return modelYear;
		else
			throw new RuntimeException("Model Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getDay
	 * @description - By using this method we can get the Day property, from the
	 *              property file
	 * @return - String
	 */
	public String getDay() {
		String day = properties.getProperty("days");
		if (day != null)
			return day;
		else
			throw new RuntimeException("Day not specified in the SBM.properties file");
	}

	/**
	 * @name : getMonth
	 * @description - By using this method we can get the Month property, from the
	 *              property file
	 * @return - String
	 */
	public String getMonth() {
		String month = properties.getProperty("month");
		if (month != null)
			return month;
		else
			throw new RuntimeException("Month not specified in the SBM.properties file");
	}

	/**
	 * @name : getPurchasedLocation
	 * @description - By using this method we can get the Purchased Location
	 *              property, from the property file
	 * @return - String
	 */
	public String getPurchasedLocation() {
		String purchasedLocation = properties.getProperty("purchasedLocation");
		if (purchasedLocation != null)
			return purchasedLocation;
		else
			throw new RuntimeException("Purchased Location not specified in the SBM.properties file");
	}

	/**
	 * @name : getExistUnqiueID
	 * @description - By using this method we can get the Unique ID property, from
	 *              the property file
	 * @return - String
	 */
	public String getExistUnqiueID() {
		String uID = properties.getProperty("existUnqiueID");
		if (uID != null)
			return uID;
		else
			throw new RuntimeException("Unique ID not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateUniqueID
	 * @description - By using this method we can get the Unique ID property, from
	 *              the property file
	 * @return - String
	 */
	public String getUpdateUniqueID() {
		String uID = properties.getProperty("updateUniqueID");
		if (uID != null)
			return uID;
		else
			throw new RuntimeException("Unique ID not specified in the SBM.properties file");
	}

	/**
	 * @name : getUniqueId
	 * @description - By using this method we can get the unique ID value
	 * @return - String
	 */
	public String getUniqueId() {
		String uniqueid = properties.getProperty("uniqueid");
		if (uniqueid != null)
			return uniqueid;
		else
			throw new RuntimeException("Unique ID not specified in the SBM.properties file");
	}

	/**
	 * @name : getUniqueIdToAddProduct
	 * @description - By using this method we can get the unique ID value
	 * @return - String
	 */
	public String getUniqueIdToAddProduct() {
		String uIDToAddProduct = properties.getProperty("uIDToAddProduct");
		if (uIDToAddProduct != null)
			return uIDToAddProduct;
		else
			throw new RuntimeException("Unique ID not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidAssertToken
	 * @description - By using this method we can get the Invalid Asset Token value
	 * @return
	 */
	public String getInvalidAssetToken() {
		String countryCode = properties.getProperty("invalidassetToken");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Invalid Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getPopUpText
	 * @description - By using this method we can get the PopUp Text
	 * @return
	 */
	public String getPopUpText() {
		String succPopUptxt = properties.getProperty("succpopuptext");
		if (succPopUptxt != null)
			return succPopUptxt;
		else
			throw new RuntimeException("Success PopUp text not specified in the SBM.properties file");
	}

	/**
	 * @name : getAssetToken
	 * @description - get the Asset Token property, from the property file
	 * @return - String
	 */
	public String getAssetToken() {
		String assetToken = properties.getProperty("assetToken");
		if (assetToken != null)
			return assetToken;
		else
			throw new RuntimeException("Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getExistAssetToken
	 * @description - get the Asset Token property, from the property file
	 * @return - String
	 */
	public String getExistAssetToken() {
		String assetToken = properties.getProperty("existAssetToken");
		if (assetToken != null)
			return assetToken;
		else
			throw new RuntimeException("Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getAssetToken
	 * @description - get the Asset Token property, from the property file
	 * @return - String
	 */
	public String getUpdateAssetToken() {
		String updateAssetToken = properties.getProperty("updateAssetToken");
		if (updateAssetToken != null)
			return updateAssetToken;
		else
			throw new RuntimeException("Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getAssetToken
	 * @description - get the Asset Token property, from the property file
	 * @return - String
	 */
	public String getAssetTokenToAddProduct() {
		String assetTokenToAddProduct = properties.getProperty("assetTokenToAddProduct");
		if (assetTokenToAddProduct != null)
			return assetTokenToAddProduct;
		else
			throw new RuntimeException("Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getSameAssetToken
	 * @description - get the Same Asset Token property, from the property file
	 * @return - String
	 */
	public String getSameAssetToken() {
		String sameAssettoken = properties.getProperty("sameAssettoken");
		if (sameAssettoken != null)
			return sameAssettoken;
		else
			throw new RuntimeException("Same Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getDeleteproductAstTkn
	 * @description - get the delete product Asset Token property, from the property
	 *              file
	 * @return - String
	 */
	public String getDeleteproductAstTkn() {
		String deleteproductAstTkn = properties.getProperty("deleteproductAstTkn");
		if (deleteproductAstTkn != null)
			return deleteproductAstTkn;
		else
			throw new RuntimeException("Detele Product Asset Token not specified in the SBM.properties file");
	}

	/**
	 * @name : getChangePassword
	 * @description - get the New Password property, from the property file
	 * @return - String
	 */
	public String getNewPassword() {
		String newPassword = properties.getProperty("newPassword");
		if (newPassword != null)
			return newPassword;
		else
			throw new RuntimeException("New Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getRetypeNewPassword
	 * @description - get the Retype New Password property, from the property file
	 * @return - String
	 */
	public String getRetypeNewPassword() {
		String retypePassword = properties.getProperty("retypePassword");
		if (retypePassword != null)
			return retypePassword;
		else
			throw new RuntimeException("Retype New Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getNewPasswordErrMSg
	 * @description - get the New Password Error message property, from the property
	 *              file
	 * @return - String
	 */
	public String getNewPasswordErrMSg() {
		String newPasswordErrMsg = properties.getProperty("newPasswordErrMsg");
		if (newPasswordErrMsg != null)
			return newPasswordErrMsg;
		else
			throw new RuntimeException("New Password Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getRetypeNewPasswordErrMsg
	 * @description - get the Retype New Password Error message property, from the
	 *              property file
	 * @return - String
	 */
	public String getRetypeNewPasswordErrMsg() {
		String retypePasswordErrMsg = properties.getProperty("retypePasswordErrMsg");
		if (retypePasswordErrMsg != null)
			return retypePasswordErrMsg;
		else
			throw new RuntimeException("Retype New Password Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getCurrentPasswordErrMSg
	 * @description - get the Current Password Error message property, from the
	 *              property file
	 * @return - String
	 */
	public String getCurrentPasswordErrMSg() {
		String currentPasswordErrMSg = properties.getProperty("currentPasswordErrMSg");
		if (currentPasswordErrMSg != null)
			return currentPasswordErrMSg;
		else
			throw new RuntimeException("Current Password Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidCuurentPasswordErrMsg
	 * @description - get the Invalid Current Password Error message property, from
	 *              the property file
	 * @return - String
	 */
	public String getInvalidCuurentPasswordErrMsg() {
		String invalidCuurentPasswordErrMsg = properties.getProperty("invalidCuurentPasswordErrMsg");
		if (invalidCuurentPasswordErrMsg != null)
			return invalidCuurentPasswordErrMsg;
		else
			throw new RuntimeException(
					"Invalid Current Password Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getCurrentAndNewPasswordSameErrMsg
	 * @description - get the Current Password and New Password same Error message
	 *              property, from the property file
	 * @return - String
	 */
	public String getCurrentAndNewPasswordSameErrMsg() {
		String currentAndNewPasswordSameErrMsg = properties.getProperty("currentAndNewPasswordSameErrMsg");
		if (currentAndNewPasswordSameErrMsg != null)
			return currentAndNewPasswordSameErrMsg;
		else
			throw new RuntimeException(
					"Current Password and New Password same Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getCountryCode
	 * @description - get the Country Code property, from the property file
	 * @return - String
	 */
	public String getCountryCode() {
		String countryCode = properties.getProperty("countryCode");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("CountryCode not specified in the SBM.properties file");
	}

	/**
	 * @name : getVoltage
	 * @description - By using this method we can get the voltage value
	 * @return - String
	 */
	public String getVoltage() {
		String countryCode = properties.getProperty("voltage");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Voltage not specified in the SBM.properties file");
	}

	/**
	 * @name : getCurrent
	 * @description - By using this method we can get the current value
	 * @return - String
	 */
	public String getCurrent() {
		String countryCode = properties.getProperty("current");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Current not specified in the SBM.properties file");
	}

	/**
	 * @name : getTemperature
	 * @description - By using this method we can get the temperature value
	 * @return String
	 */
	public String getTemperature() {
		String countryCode = properties.getProperty("temperature");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Temperature not specified in the SBM.properties file");
	}

	/**
	 * @name : getStatusNotification1
	 * @description - By using this method we get the Status Notification
	 * @return String
	 */
	public String getStatusNotification1() {
		String countryCode = properties.getProperty("notification1");
		if (countryCode != null)
			return countryCode;
		else
			throw new RuntimeException("Notification1 not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidCurrentPassword
	 * @description get the Invalid Current Password property, from the property
	 *              file
	 * @return - String
	 */
	public String getInvalidCurrentPassword() {
		String invalidCurrentPwd = properties.getProperty("invalidCurrentPwd");
		if (invalidCurrentPwd != null)
			return invalidCurrentPwd;
		else
			throw new RuntimeException("Invalid Current Password not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthFirstName
	 * @description - By using this message we can get the Less than min length
	 *              First name
	 * @return String
	 */
	public String getLessThanMinLengthFirstName() {
		String lessMinFN = properties.getProperty("lessThanMinLengthFN");
		if (lessMinFN != null)
			return lessMinFN;
		else
			throw new RuntimeException("Less Than Min Length First Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthFirstNameErrMsg
	 * @description - By using this message we can get the Less than min length
	 *              First name Error message
	 * @return String
	 */
	public String getLessThanMinLengthFirstNameErrMsg() {
		String lessMinFNErrMsg = properties.getProperty("lessThanMinLengthFNErrMsg");
		if (lessMinFNErrMsg != null)
			return lessMinFNErrMsg;
		else
			throw new RuntimeException(
					"Less Than Min Length First Name error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthPhoneNumber
	 * @description - By using this message we can get the Less than min length
	 *              Phone Number
	 * @return String
	 */
	public String getLessThanMinLengthPhoneNumber() {
		String lessMinPhnNum = properties.getProperty("lessThanMinLengthPhnNum");
		if (lessMinPhnNum != null)
			return lessMinPhnNum;
		else
			throw new RuntimeException("Less Than Min Length Phone Number not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthPhoneNumberErrMsg
	 * @description - By using this message we can get the Less than min length
	 *              Phone Number Error message
	 * @return String
	 */
	public String getLessThanMinLengthPhoneNumberErrMsg() {
		String lessMinPhnNumErrMsg = properties.getProperty("lessThanMinLengthPhNumErrMsg");
		if (lessMinPhnNumErrMsg != null)
			return lessMinPhnNumErrMsg;
		else
			throw new RuntimeException(
					"Less Than Min Length Phone Number Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthEmailAddress
	 * @description - By using this message we can get the Less than min length
	 *              Email Address
	 * @return String
	 */
	public String getLessThanMinLengthEmailAddress() {
		String lessMinEmailAdd = properties.getProperty("lessThanMinLengthEmailAdd");
		if (lessMinEmailAdd != null)
			return lessMinEmailAdd;
		else
			throw new RuntimeException("Less Than Min Length Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getLessThanMinLengthEmailAddressErrMsg
	 * @description - By using this message we can get the Less than min length
	 *              Email Address Error Message
	 * @return String
	 */
	public String getLessThanMinLengthEmailAddressErrMsg() {
		String lessMinEmailAddErrMsg = properties.getProperty("lessThanMinLengthEmailAddErrMsg");
		if (lessMinEmailAddErrMsg != null)
			return lessMinEmailAddErrMsg;
		else
			throw new RuntimeException(
					"Less Than Min Length Email Address Error Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxLengthFirstName
	 * @description - By using this message we can get the max length First Name
	 * @return String
	 */
	public String getMaxLengthFirstName() {
		String maxLengthFN = properties.getProperty("maxLengthFN");
		if (maxLengthFN != null)
			return maxLengthFN;
		else
			throw new RuntimeException("Max Length First Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstNameMaxLength
	 * @description - By using this message we can get the First Name max length
	 * @return String
	 */
	public String getFirstNameMaxLength() {
		String fnMxLnth = properties.getProperty("firstNameMaxLnth");
		if (fnMxLnth != null)
			return fnMxLnth;
		else
			throw new RuntimeException("First Name Max Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxLengthLastName
	 * @description - By using this message we can get the max length Last Name
	 * @return String
	 */
	public String getMaxLengthLastName() {
		String maxLengthLN = properties.getProperty("maxLengthLN");
		if (maxLengthLN != null)
			return maxLengthLN;
		else
			throw new RuntimeException("Max Length Last Name not specified in the SBM.properties file");
	}

	/**
	 * @name : getLastNameMaxLength
	 * @description - By using this message we can get the Last Name max length
	 * @return String
	 */
	public String getLastNameMaxLength() {
		String lnMxLnth = properties.getProperty("lastNameMaxLnth");
		if (lnMxLnth != null)
			return lnMxLnth;
		else
			throw new RuntimeException("First Name Max Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getPhoneNumMaxLength
	 * @description - By using this message we can get the Phone Number max length
	 * @return String
	 */
	public String getPhoneNumMaxLength() {
		String phoneNumMaxLnth = properties.getProperty("phoneNumMaxLnth");
		if (phoneNumMaxLnth != null)
			return phoneNumMaxLnth;
		else
			throw new RuntimeException("Phone Number Max Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getMaxLengthEmailAddress
	 * @description - By using this message we can get the Max length Email Address
	 * @return String
	 */
	public String getMaxLengthEmailAddress() {
		String maxLengthEmail = properties.getProperty("maxLengthEmail");
		if (maxLengthEmail != null)
			return maxLengthEmail;
		else
			throw new RuntimeException("Maximum Length Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getEmailMaxLength
	 * @description - By using this message we can get the Email Address max length
	 * @return String
	 */
	public String getEmailMaxLength() {
		String emailMaxLnth = properties.getProperty("emailMaxLnth");
		if (emailMaxLnth != null)
			return emailMaxLnth;
		else
			throw new RuntimeException("Email Address Max Length not specified in the SBM.properties file");
	}

	/**
	 * @name : getPswdWithoutUpperCase
	 * @description - By using this message we can get the Password (without upper
	 *              case)
	 * @return String
	 */
	public String getPswdWithoutUpperCase() {
		Log.info("Get the Password with out Upper case");
		String pswdWithOutUpperCase = properties.getProperty("pswdWithOutUpperCase");
		if (pswdWithOutUpperCase != null)
			return pswdWithOutUpperCase;
		else
			throw new RuntimeException("Password with out Uppercase not specified in the SBM.properties file");
	}

	/**
	 * @name : getOCRPaswdErrorMsg
	 * @description - By using this message we can get the Password Error Message
	 * @return String
	 */
	public String getOCRPaswdErrorMsg() {
		String ocrPaswdErrorMsg = properties.getProperty("ocrPaswdErrorMsg");
		if (ocrPaswdErrorMsg != null)
			return ocrPaswdErrorMsg;
		else
			throw new RuntimeException("OCR password error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getPswdWithoutLowerCase
	 * @description - By using this message we can get the Password (without lower
	 *              case)
	 * @return String
	 */
	public String getPswdWithoutLowerCase() {
		Log.info("Get the Password with out lower case");
		String pswdWithOutLowerCase = properties.getProperty("pswdWithOutLowerCase");
		if (pswdWithOutLowerCase != null)
			return pswdWithOutLowerCase;
		else
			throw new RuntimeException("Password with out Lower case not specified in the SBM.properties file");
	}

	/**
	 * @name : getPswdWithoutSpecialChar
	 * @description - By using this message we can get the Password (without Special
	 *              Characters)
	 * @return String
	 */
	public String getPswdWithoutSpecialChar() {
		Log.info("Get the Password with out Special Characters");
		String pswdWithOutSpecialChar = properties.getProperty("pswdWithOutSpecialChar");
		if (pswdWithOutSpecialChar != null)
			return pswdWithOutSpecialChar;
		else
			throw new RuntimeException("Password with out special characters not specified in the SBM.properties file");
	}

	/**
	 * @name : getPswdWithoutNumeric
	 * @description - By using this message we can get the Password (without Numeric
	 *              characters)
	 * @return String
	 */
	public String getPswdWithoutNumeric() {
		Log.info("Get the Password with out numeric characters");
		String pswdWithOutNumeric = properties.getProperty("pswdWithOutNumeric");
		if (pswdWithOutNumeric != null)
			return pswdWithOutNumeric;
		else
			throw new RuntimeException("Password with out Numeric not specified in the SBM.properties file");
	}

	/**
	 * @name : getAlreadyRegiEmailAddErrMsg
	 * @description - By using this we can get Already Registered Email Address
	 * @return String
	 */
	public String getAlreadyRegiEmailAddErrMsg() {
		Log.info("Get the Password with out numeric characters");
		String alreadyRegiEmailAddErrMsg = properties.getProperty("alreadyRegiEmailAddErrMsg");
		if (alreadyRegiEmailAddErrMsg != null)
			return alreadyRegiEmailAddErrMsg;
		else
			throw new RuntimeException("Already Registered Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstNameErrMsg
	 * @description - By using this method we can get the First name error message
	 * @return String
	 */
	public String getFirstNameErrMsg() {
		String fstNmErrMsg = properties.getProperty("firstNameErrorMsg");
		if (fstNmErrMsg != null)
			return fstNmErrMsg;
		else
			throw new RuntimeException("FirstName error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getLastNameErrMsg
	 * @description - By using this method we can get the Last name error message
	 * @return String
	 */
	public String getLastNameErrMsg() {
		String lstNmErrMsg = properties.getProperty("lastNameErrorMsg");
		if (lstNmErrMsg != null)
			return lstNmErrMsg;
		else
			throw new RuntimeException("LastName error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getMobileNumberErrMsg
	 * @description - By using this message we can get the Mobile Number Error
	 *              message
	 * @return String
	 */
	public String getMobileNumberErrMsg() {
		String mbNumErrMsg = properties.getProperty("phoneNumberErrorMsg");
		if (mbNumErrMsg != null)
			return mbNumErrMsg;
		else
			throw new RuntimeException("Mobile Number error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrLessThnManuYr
	 * @description - By using this message we can get the Model Year less than
	 *              Manufactured Year
	 * @return String
	 */
	public String getModelYrLessThnManuYr() {
		String modelYrLessThnManuYr = properties.getProperty("modelYrLessThnManuYr");
		if (modelYrLessThnManuYr != null)
			return modelYrLessThnManuYr;
		else
			throw new RuntimeException(
					"Model Year less than Manufactured Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrLessThnManuYr
	 * @description - By using this message we can get the Model Year less than 2000
	 *              Year
	 * @return String
	 */
	public String getModelYrLessThn2000() {
		String modelYrLessThn2000 = properties.getProperty("modelYrLessThn2000");
		if (modelYrLessThn2000 != null)
			return modelYrLessThn2000;
		else
			throw new RuntimeException("Model Year less than 2000 Year not specified in the SBM.properties file");
	}

	/**
	 * @name : manufacturerYrLessThn2000
	 * @description - By using this message we can get the Manufacturer Year less
	 *              than 2000 Year
	 * @return String
	 */
	public String getManufacturerYrLessThn2000() {
		String manufacturerYrLessThn2000 = properties.getProperty("manufacturerYrLessThn2000");
		if (manufacturerYrLessThn2000 != null)
			return manufacturerYrLessThn2000;
		else
			throw new RuntimeException(
					"Manufacturer Year less than 2000 Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrLessThnManuYr
	 * @description - By using this message we can get the Model Year less than 2000
	 *              Error message
	 * @return String
	 */
	public String getModelYrLessThn2000ErrMsg() {
		String modelYrLessThn2000ErrMsg = properties.getProperty("modelYrLessThn2000ErrMsg");
		if (modelYrLessThn2000ErrMsg != null)
			return modelYrLessThn2000ErrMsg;
		else
			throw new RuntimeException(
					"Model Year less than 2000 Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getManufacturerYrLessThn2000ErrMsg
	 * @description - By using this message we can get the Manufactured Year less
	 *              than 2000 Error message
	 * @return String
	 */
	public String getManufacturerYrLessThn2000ErrMsg() {
		String manufacturerYrLessThn2000ErrMsg = properties.getProperty("manufacturerYrLessThn2000ErrMsg");
		if (manufacturerYrLessThn2000ErrMsg != null)
			return manufacturerYrLessThn2000ErrMsg;
		else
			throw new RuntimeException(
					"Manufactured Year less than 2000 Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrGrtrThnCurrYr
	 * @description - By using this message we can get the Model Year greater than
	 *              Current Year
	 * @return String
	 */
	public String getModelYrGrtrThnCurrYr() {
		String modelYrGrtrThnCurrYr = properties.getProperty("modelYrGrtrThnCurrYr");
		if (modelYrGrtrThnCurrYr != null)
			return modelYrGrtrThnCurrYr;
		else
			throw new RuntimeException("Model Year greater than Current Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrLessThnManuYrErrMsg
	 * @description - By using this message we can get the Model Year less than
	 *              Manufactured Year Error Message
	 * @return String
	 */
	public String getModelYrLessThnManuYrErrMsg() {
		String modelYrLessThnManuYrErrMsg = properties.getProperty("modelYrLessThnManuYrErrMsg");
		if (modelYrLessThnManuYrErrMsg != null)
			return modelYrLessThnManuYrErrMsg;
		else
			throw new RuntimeException(
					"Model Year less than Manufactured Year not specified in the SBM.properties file");
	}

	/**
	 * @name : getModelYrGrtrThnCurrYrErrMsg
	 * @description - By using this message we can get the Model Year greater than
	 *              Current Year Error message
	 * @return String
	 */
	public String getModelYrGrtrThnCurrYrErrMsg() {
		String modelYrGrtrThnCurrYrErrMsg = properties.getProperty("modelYrGrtrThnCurrYrErrMsg");
		if (modelYrGrtrThnCurrYrErrMsg != null)
			return modelYrGrtrThnCurrYrErrMsg;
		else
			throw new RuntimeException(
					"Model Year greater than Current Year Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getAssetTokenErrMsg
	 * @description - By using this message we can get the Asset Token Error message
	 * @return String
	 */
	public String getAssetTokenErrMsg() {
		String assetTokenErrMsg = properties.getProperty("assetTokenErrMsg");
		if (assetTokenErrMsg != null)
			return assetTokenErrMsg;
		else
			throw new RuntimeException("Asset Token Error message not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicalManufacturerToastMessage
	 * @description - By using this message we can get the First name Error Toast
	 *              Message
	 * @return String
	 */
	public String getVehicalManufacturerToastMessage() {
		Log.info("Get the Vehical Manufacturer error toast message");
		String vehiclManufacturerErrorToastMsg = properties.getProperty("vehiclManufacturerErrorToastMsg");
		if (vehiclManufacturerErrorToastMsg != null)
			return vehiclManufacturerErrorToastMsg;
		else
			throw new RuntimeException("First Name Error Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getSaveButtonText
	 * @description - By using this method we can get the Save button text
	 * @return String
	 */
	public String getSaveButtonText() {
		Log.info("Get the Save Button text");
		String saveBtnTxt = properties.getProperty("saveBtnTxt");
		if (saveBtnTxt != null)
			return saveBtnTxt;
		else
			throw new RuntimeException("First Name Error Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicleModelToastMessage
	 * @description - By using this method we can get the Vehicle Model error toast
	 *             message
	 * @return String
	 */
	public String getVehicleModelToastMessage() {
		Log.info("Get Vehicle Model error message ");
		String vehicleModelErrorToastMsg = properties.getProperty("vehicleModelErrorToastMsg");
		if (vehicleModelErrorToastMsg != null)
			return vehicleModelErrorToastMsg;
		else
			throw new RuntimeException("Vehicle Model Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getVehicleTypeToastMessage
	 * @description - By using this method we can get the Vehicle Type error toast
	 *             message
	 * @return String
	 */
	public String getVehicleTypeToastMessage() {
		Log.info("Get Vehicle Type error message ");
		String vehicleTypeErrorToastMsg = properties.getProperty("vehicleTypeErrorToastMsg");
		if (vehicleTypeErrorToastMsg != null)
			return vehicleTypeErrorToastMsg;
		else
			throw new RuntimeException("Vehicle Type Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getManufactureYearToastMessage
	 * @description - By using this method we can get the Manufacure year error toast
	 *             message
	 * @return String
	 */
	public String getManufactureYearToastMessage() {
		Log.info("Get Vehicle Manufacture year error message ");
		String manufacturedYearErrorToastMsg = properties.getProperty("manufacturedYearErrorToastMsg");
		if (manufacturedYearErrorToastMsg != null)
			return manufacturedYearErrorToastMsg;
		else
			throw new RuntimeException("Manufactured Year Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getAssetTokenToastMessage
	 * @description - By using this method we can get the Asset Token error toast
	 *             message
	 * @return String
	 */
	public String getAssetTokenToastMessage() {
		Log.info("Get Asset Token error message ");
		String assetTokenErrorToastMsg = properties.getProperty("assetTokenErrorToastMsg");
		if (assetTokenErrorToastMsg != null)
			return assetTokenErrorToastMsg;
		else
			throw new RuntimeException("Asset Token Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidAssetTokenToastMessage
	 * @description - By using this method we can get the Invalid Asset Token error
	 *             toast message
	 * @return String
	 */
	public String getInvalidAssetTokenToastMessage() {
		Log.info("Get Invalid Asset Token error message ");
		String invalidAssetTokenErrorToastMsg = properties.getProperty("invalidAssetTokenErrorToastMsg");
		if (invalidAssetTokenErrorToastMsg != null)
			return invalidAssetTokenErrorToastMsg;
		else
			throw new RuntimeException("Invalid Asset Token Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getUniqueIdToastMessage
	 * @description - By using this method we can get the Unique ID Token error toast
	 *             message
	 * @return String
	 */
	public String getUniqueIdToastMessage() {
		Log.info("Get Unique id Token error message ");
		String uniqueIdErrorToastMsg = properties.getProperty("uniqueIdErrorToastMsg");
		if (uniqueIdErrorToastMsg != null)
			return uniqueIdErrorToastMsg;
		else
			throw new RuntimeException("Unique ID Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidUniqueId
	 * @description - By using this method we can get the invalid unique id
	 * @return
	 */
	public String getInvalidUniqueId() {
		Log.info("Get Invlid Unique id");
		String invalidUniqueId = properties.getProperty("invalidUniqueId");
		if (invalidUniqueId != null)
			return invalidUniqueId;
		else
			throw new RuntimeException("Invalid Unique ID Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidUniqueIdToastMessage
	 * @description - By using this method we can get the Invalid Unique ID Token
	 *             error toast message
	 * @return String
	 */
	public String getInvalidUniqueIdToastMessage() {
		Log.info("Get Invalid Unique id Token error message ");
		String invalidUniqueIdErrorToastMsg = properties.getProperty("invalidUniqueIdErrorToastMsg");
		if (invalidUniqueIdErrorToastMsg != null)
			return invalidUniqueIdErrorToastMsg;
		else
			throw new RuntimeException("Invalid Unique ID Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getCountryErrorMsg
	 * @description - By using this method we can get the Country Error toast
	 *             message
	 * @return String
	 */
	public String getCountryErrorMsg() {
		Log.info("Get Country Error toast message ");
		String countryErrorMsg = properties.getProperty("countryErrorMsg");
		if (countryErrorMsg != null)
			return countryErrorMsg;
		else
			throw new RuntimeException("Country Error Toast Message not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getStateErrorMsg
	 * @description - By using this method we can get the State Error toast
	 *             message
	 * @return String
	 */
	public String getStateErrorMsg() {
		Log.info("Get State Error toast message ");
		String stateErrorMsg = properties.getProperty("stateErrorMsg");
		if (stateErrorMsg != null)
			return stateErrorMsg;
		else
			throw new RuntimeException("State Error Toast Message not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getCityErrorMsg
	 * @description - By using this method we can get the City Error toast
	 *             message
	 * @return String
	 */
	public String getCityErrorMsg() {
		Log.info("Get City Error toast message ");
		String cityErrorMsg = properties.getProperty("cityErrorMsg");
		if (cityErrorMsg != null)
			return cityErrorMsg;
		else
			throw new RuntimeException("City Error Toast Message not specified in the SBM.properties file");
	}
	
	/**
	 * @name : getInvalidLessModelYear
	 * @description - By using this method we can get the Model year less than
	 *              manufactured year
	 * @return
	 */
	public String getInvalidLessModelYear() {
		Log.info("Get Model year less than Manufactured year");
		String invalidModelYear = properties.getProperty("invalidModelYear");
		if (invalidModelYear != null)
			return invalidModelYear;
		else
			throw new RuntimeException("Invalid Model year not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidModelYearToastMessage
	 * @description - By using this method we can get the Invalid Model year toast
	 *              message
	 * @return
	 */
	public String getInvalidLessModelYearToastMessage() {
		Log.info("Get Invalid Model year toast message");
		String invalidLessModelYearToastMsg = properties.getProperty("invalidLessModelYearToastMsg");
		if (invalidLessModelYearToastMsg != null)
			return invalidLessModelYearToastMsg;
		else
			throw new RuntimeException("Invalid Model year Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidGreaterModelYear
	 * @description - By using this method we can get the Invalid Greater Model year
	 * @return String
	 */
	public String getInvalidGreaterModelYear() {
		Log.info("Get Invalid Greater Model year");
		String invalidGreaterYear = properties.getProperty("invalidGreaterYear");
		if (invalidGreaterYear != null)
			return invalidGreaterYear;
		else
			throw new RuntimeException("Invalid Greater Model year not specified in the SBM.properties file");
	}

	/**
	 * @name : getCreateAccountTxt
	 * @description - By using this method we can get the Create Account button text
	 * @return String
	 */
	public String getCreateAccountTxt() {
		Log.info("Get Create Account button text");
		String createAccountBtnTxt = properties.getProperty("createAccountBtnTxt");
		if (createAccountBtnTxt != null)
			return createAccountBtnTxt;
		else
			throw new RuntimeException("Create Account button text not specified in the SBM.properties file");
	}

	/**
	 * @name : getFirstNamescroll
	 * @description - By using this method we can get the First Name: text
	 * @return String
	 */
	public String getFirstNamescroll() {
		Log.info("Get Create Account button text");
		String firstNamescroll = properties.getProperty("firstNamescroll");
		if (firstNamescroll != null)
			return firstNamescroll;
		else
			throw new RuntimeException("First Name: text not specified in the SBM.properties file");
	}

	/**
	 * @name : getPurchasedLocScroll
	 * @description - By using this method we can get the Purchased Location: text
	 * @return String
	 */
	public String getPurchasedLocScroll() {
		Log.info("Get Create Account button text");
		String purchasedLocScroll = properties.getProperty("purchasedLocScroll");
		if (purchasedLocScroll != null)
			return purchasedLocScroll;
		else
			throw new RuntimeException("Purchased Location: text not specified in the SBM.properties file");
	}

	/**
	 * @name : getUpdateBtnTxt
	 * @description - By using this method we can get the Update button text
	 * @return String
	 */
	public String getUpdateBtnTxt() {
		Log.info("Get Create Account button text");
		String updateBtnTxt = properties.getProperty("updateBtnTxt");
		if (updateBtnTxt != null)
			return updateBtnTxt;
		else
			throw new RuntimeException("Update button text not specified in the SBM.properties file");
	}

	/**
	 * @name : getAlreadyRegisteredEmailAddress
	 * @description - By using this method we can get the Already Registered Email
	 *              Address
	 * @return String
	 */
	public String getAlreadyRegisteredEmailAddress() {
		String alreadyRegisteredEmailAddress = properties.getProperty("alreadyRegisteredEmailAddress");
		if (alreadyRegisteredEmailAddress != null)
			return alreadyRegisteredEmailAddress;
		else
			throw new RuntimeException("Already Registered Email Address not specified in the SBM.properties file");
	}

	/**
	 * @name : getUnRegisteredEmailAddress
	 * @description - By using this method we can get the Unregistered email address
	 * @return String
	 */
	public String getUnRegisteredEmailAddress() {
		Log.info("Get the UnRegistered Email Address");
		String unRegEmailAddress = properties.getProperty("unRegEmailAddress");
		if (unRegEmailAddress != null)
			return unRegEmailAddress;
		else
			throw new RuntimeException("UnRegistered Email address not specified in the SBM.properties file");
	}

	/**
	 * @name : getUnRegisteredEmailErrorToastMsg
	 * @description - By using this method we can get the Unregistered email address
	 * @return String
	 */
	public String getUnRegisteredEmailErrorToastMsg() {
		Log.info("Get the UnRegistered Email Address Error Toast Message");
		String unRegEmailErrorMsg = properties.getProperty("unRegEmailErrorMsg");
		if (unRegEmailErrorMsg != null)
			return unRegEmailErrorMsg;
		else
			throw new RuntimeException(
					"UnRegistered Email address Error Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getRegisteredEmailAddress
	 * @description - By using this method we can get the Registered email address
	 * @return String
	 */
	public String getRegisteredEmailAddress() {
		Log.info("Get the Registered Email Address Error Toast Message");
		String regEmailAddress = properties.getProperty("regEmailAddress");
		if (regEmailAddress != null)
			return regEmailAddress;
		else
			throw new RuntimeException(
					"UnRegistered Email address Error Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidCodeErrorToastMsg
	 * @description - By using this method we can get the Invalid Code Error Toast
	 *              Message
	 * @return String
	 */
	public String getInvalidCodeErrorToastMsg() {
		Log.info("Get the Invalid Code Error Toast Message");
		String invalidCodeErrorMsg = properties.getProperty("invalidCodeErrorMsg");
		if (invalidCodeErrorMsg != null)
			return invalidCodeErrorMsg;
		else
			throw new RuntimeException("Invalid Code Error Toast Message not specified in the SBM.properties file");
	}

	/**
	 * @name : getInvalidCode
	 * @description - By using this method we can get the Invalid Code
	 * @return String
	 */
	public String getInvalidCode() {
		Log.info("Get the Invalid Code");
		String invalidCode = properties.getProperty("invalidCode");
		if (invalidCode != null)
			return invalidCode;
		else
			throw new RuntimeException("Invalid Code not specified in the SBM.properties file");
	}

}
