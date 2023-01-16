package Listener1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.ScreeshotTestng;

public class reportLogListener extends ScreeshotTestng implements ITestListener {

	public void onTestStart(ITestResult result) {
	Reporter.log("test is starting"+result.getName());	
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test status is"+result.getStatus());	
	}

	public void onTestFailure (ITestResult result) {
		System.out.println("syso errorscreenshot");
		try {
			errorscreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href=C:\\eclipse-workspace\\WebPortalusingTestng\\screenshot\"> Test Results</a>");
	}

	

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log("reporterlog completed");
	}

}
