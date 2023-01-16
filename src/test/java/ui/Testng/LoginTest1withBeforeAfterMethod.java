package ui.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1withBeforeAfterMethod  { //
	
	
	
	@Test(priority =1, description = "this is login test")    
	public void test1() {                            
		System.out.println("test1 successfull");

	}

	@Test (priority=2)
	public void test2() {
		System.out.println("test2 successful");
	}

	public void standby() { // here i didn't use @Test so it going to execute nor to be counted
		System.out.println("succuessfull ");
	}
}
