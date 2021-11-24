package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {
	@Before
	public void beforeFirstScenarion() {
		System.out.println("befor first steps of scenarion\n");
	}
	@After
	public void afterLastStepOfScenario() {
		System.out.println("\n after the last steps of scenarion");
		
	}
	@Before("@second")
	public void beforeFirst() {
		System.out.println("second second second");
	}
	
	//output should be
	
	/* befor first steps of scenarion 
	 * will be running before scenario but after hooks   - 1
	 * will be running before scenario but after hooks  -2
	 * user is on the home page
	 * user enters username and password
	 * user clicks on the login button
	 * user is navigated to home page
	 * after the last steps of scenarion
	 * second second second
	 * befor first steps of scenarion
	 * 
	 * */
}
