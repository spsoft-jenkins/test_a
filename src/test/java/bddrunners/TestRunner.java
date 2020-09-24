package bddrunners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import appApayloDataproviders.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appApayloAPIFeatures"},
		glue = {"bddstepdefinitions","bddhooks"},
		plugin = {
		   "pretty",
	       "com.cucumber.listener.ExtentCucumberFormatter:target/appSBMExtentReport.html",
	       "html:target/appSBM_html_Reports",
	       "json:target/appSBM-results.json", "pretty:target/appSBM-pretty-results.txt",
	       "usage:target/appSBM-usage-results.json", "junit:target/appSBM-results.xml", 
	       },
		dryRun = false,
		tags = {"@API_Test"},
		monochrome = true)

public class TestRunner{
	
	@AfterClass
	public static void writeExtentReport() {
		String line = null;
		BufferedReader bufferedReader = null;
		Reporter.loadXMLConfig(new File(FileReaderManager.getConfigFileReader().getReportConfigPath()));
		Reporter.setSystemInfo("Organisation Name", "Sp Software Pvt Ltd");
		Reporter.setSystemInfo("User Name", "Ramakrishna");
		Reporter.setSystemInfo("Application Name", "Apaylo");
		Reporter.setSystemInfo("Operating System Type", "Windows");
		Reporter.setSystemInfo("Environment", "Staging");
		try {
			File logFile = new File("target/Logs/logfile.log");
			bufferedReader = new BufferedReader(new FileReader(logFile));
			while ((line = bufferedReader.readLine()) != null) {
				Reporter.setTestRunnerOutput(line.toString() + "<br/>");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
