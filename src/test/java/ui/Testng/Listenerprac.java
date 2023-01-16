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

import Listener1.testnglistener;
//@Listeners(testnglistener.class)  // if i call in suite level or in testng xml file i dont need this line just add listener there and 
public class Listenerprac  {
	
	@Test
	public void test0() {                            
		System.out.println("test 0 in");

	}
	
	
	@Test    
	public void test1() {                            
		System.out.println("test1 in");
Assert.assertTrue(false);
	}

	@Test (timeOut= 1000)
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test2 now");
	}
@Test(dependsOnMethods="test2")
	public void standby() { // here i didn't use @Test so it going to execute nor to be counted
		System.out.println("test 3 moment ");
	}
}
