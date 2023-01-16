package ui.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test(groups="demo test")                         //here we can define Test and groups in class level . so it will execute all method  in this class  
public class GroupsDemoTest4 { 

	
	 @Test(groups="Regression Test"  )  
	public void loginapplication () {
		System.out.println("login first for application ");
	}
	
	 @Test(groups="Regression Test"  )                  
	public void logoutapplication () {
		System.out.println("logout for application ");
	////here if we go to configure and run only Regression group then only Regression group will be executed	
	}
	
	 @Test(groups={"Regression Test", "Bvt"}  )  
	public void connectDB ()
	{
		System.out.println("DB Connected");
	}
	 @Test(groups="Bvt"  )  
	public void disconnectDB ()
	{
		System.out.println("DB disConnected");
	}
	
	
	@Test(priority =1, groups="Bvt" ,description = "this is login test")    
	public void test1() {                          
		System.out.println("test1 successfull");
//here if we go to configure and run only Bvt group then only Bvt group will be executed
	}

	@Test (priority=2)
	public void test2() {
		System.out.println("test2 successful");
	}

	public void standby() {
		System.out.println("succuessfull "); ///key notes 1. if we don't define test in class level this method will not execute coz we didn't define @test
	} 
}
