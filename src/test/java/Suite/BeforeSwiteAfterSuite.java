package Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSwiteAfterSuite {
	
	@BeforeSuite
	public void BeforeSwite () {
		System.out.println("Datasetup successful");
	}
	
	@AfterSuite
public void sfterSuite () {
	System.out.println("Datacleanup  successful after all test cases ");	
}
}
