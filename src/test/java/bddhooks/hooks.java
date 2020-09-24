package bddhooks;

import appApayloUtilities.Log;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooks{
	
	@Before
	public void Before(Scenario scenario) {
		Log.initializeLog();		
		Log.info("**********************************************");
		Log.info(" Started Working on Scenario : " + scenario.getName());
		Log.info("**********************************************");
		
	}

	@After
	public void After(Scenario scenario) {
		Log.info("**********************************************");
		Log.info(" Completed Working on Scenario : " + scenario.getName());
		Log.info("**********************************************");
		

	}

}
