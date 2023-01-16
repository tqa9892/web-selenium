package ui.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterGroupClass { // here we don't need to use Main method. coz we re not returning anything just
							// executing test cases

	
	@BeforeClass
	public void beforeClassstart () {
		System.out.println("it's start to execute beforeClassstart ");
	}
	
	
	@AfterClass
	public void afterClassstart () {
		System.out.println("it will be executed after all the method in the class executed ");
	}
	
	

	
	
	

@BeforeGroups(value="regression") //this before test after test are an example of Annotation
	public void Beforegroup() { // if i only run group in a class just add @BeforeGroups(value="regression")
		System.out.println("succuessfull before regression ");
	}
  @AfterGroups(value="regression")
public void afterGroupregression() { //
	System.out.println("succuessfull after regression ");
}

@Test(groups="regression"  )  
public void loginapplication () {
	System.out.println("login first for application ");
}

@Test(groups="regression"  )                  
public void logoutapplication () {
	System.out.println("logout for application ");

}

@Test(groups={"regression", "Bvt"}  )  
public void connectDB1 ()
{
	System.out.println("DB Connected");
}  
}
