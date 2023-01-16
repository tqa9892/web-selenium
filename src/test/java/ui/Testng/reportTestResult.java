package ui.Testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Common.browserClass;
import Listener1.testnglistener;
 
public class reportTestResult extends browserClass  {
	
	@Test
	public void test0() {                    //Retry steps for re-executing Failed Test  
		System.out.println("test 0 in");  //steps1:create a new class in common and copy paste retry code from link
		                                 // https://testng.org/doc/documentation-main.html#rerunning 
                                       //steps 2: create listener and implements 'IAnnotationTransformer' and right click on class
		                              //source/ override and add
		//  transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
	}                                     //step3 :go to failed test cases class
	                                   
	                                    
	@Test                                
	public void test1() {                         
	driver.get("https://reportng.uncommons.org/"); 
	
Assert.assertTrue(false);
Reporter.log("failed intentionally");
	}
	public void browsetest2 () {
		Reporter.log("final test rp");
		System.out.println("vsjchg");
	}

	
}
