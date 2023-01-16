package ui.Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Common.browserClass;
import Listener1.testnglistener;
//@Listeners(testnglistener.class)  // if i call in suite level or in testng xml file i dont need this line just add listener there and 
public class ScreenShotForFailedTestCases extends browserClass  {
	
	@Test
	public void test0() {                    //Screenshot steps for Failed Test  
		System.out.println("test 0 in");  //steps1:declare browser in external class .
                                          //steps 2: create Listener in diff class file 
	}                                     //step3 : create screenshot class and method in utilities package
	                                     //Steps4: then we call the screenshot class and call screen shot method in listener failed method hover on method and add try catch
	                                     // steps5: create test cases and add testng 
	@Test                                //steps6: convert test cases class in testng.xml file 
	public void test1() {                //steps:7: add listener and classes, method or test cases if necessary            
	driver.get("https://www.amazone.com"); //run testng. xml file if any error find it will take screenshot in screenshot folder. make sure you refresh the project to see screen shot
	
Assert.assertTrue(false);
	}

	@Test (timeOut= 3000)
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test2 now");
	}
@Test(dependsOnMethods="test2")
	public void standby() { // here i didn't use @Test so it going to execute nor to be counted
		System.out.println("test 3 moment ");
	}
}
