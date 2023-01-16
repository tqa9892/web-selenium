package ui.Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class HowToSkipTestInTestNG {
	
	Boolean conditionalskipping = true;
	
	
	@Test (enabled=false)   //here even before executing skipped it . it's not even count in test execution list
	public void skipTest () {
		System.out.println("skipping directly by this method");
	}

	@Test
	public void skipTestfourcefully () {  // here we forcefully skipping the test by using throw new 
		System.out.println("skipping test by force using throw new skipexcepton method");
	throw new SkipException ("skipped this test fourcefully");
	}
	
	@Test
	
	public void skipTestbyCondition () {  //here is the conditional if thing happen then execute if not just skipped the test
		//System.out.println("skipping by condition");
		if (conditionalskipping = true) {
			System.out.println("Executing coz condition fullfilled");
		}
		else {
			System.out.println("condition skipped");
			throw new SkipException ("condition didn't fulfilled so skipped");
		
		}
	}
}
