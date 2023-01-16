package ui.Testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Suite.BeforeSwiteAfterSuite;

public class BeforeSwiteafterSuitePart2 extends BeforeSwiteAfterSuite { // here we don't need to use Main method. coz we re not returning anything just
							// executing test cases
 
	
//	@BeforeMethod             //key notes1 here beforeMethod will be executed in every test case before and after every test cases AfterMethod will be executed then it will go for another test case will do the same
//	public void connectDB ()
//	{
//		System.out.println("DB Connected");
//	}
//	@AfterMethod
//	public void disconnectDB ()
//	{
//		System.out.println("DB disConnected");
//	}
//	
	
	@Test(priority =1, description = "this is login test")    //here if you don't put priority . it will execute in alphabetic order 
	public void test1() {                           //description is not mandatory .if you write it  it's makes it easier to find result 
		System.out.println("test1 successfull");

	}

	@Test (priority=2)  
	public void test2() {
		System.out.println("test2 successful");
	}
@Test
	public void standby() { // here i didn't use @Test so it going to execute nor to be counted
		System.out.println("succuessfull ");
	}
}
