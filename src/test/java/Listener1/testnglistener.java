package Listener1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.ScreeshotTestng;

public class testnglistener extends ScreeshotTestng implements ITestListener{  // here to add the ITestlistener right click on class name testnglistener and  
// and go the source then click override/implement Method or add manually
	public void onTestStart(ITestResult result) {
		Reporter.log("name of the test method1"+result.getName());
	System.out.println("syso starting test");	
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test status"+result.getStatus());
	System.out.println("syso test is successful als");	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("error screenshot");
		try {
			errorscreenshot ();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\eclipse-workspace\\WebPortalusingTestng\\screenshot\\Mon-Nov-07-14-15-17-EST-2022.png\">screenshot</a>");
	}

	
	public void onTestSkipped(ITestResult result) {
	System.out.println("skipp");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("timeout failed ls");
	}

	public void onStart(ITestContext context) {
		System.out.println("on start");
		
	}

	public void onFinish(ITestContext context) {
	System.out.println("Test execution completed ls");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	}


