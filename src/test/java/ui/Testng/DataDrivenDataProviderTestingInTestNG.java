package ui.Testng;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDataProviderTestingInTestNG {
	@Test(dataProvider ="dataset1")
	public void Test1usingdata (String rc1, String rc2) {   //for ex: login test some case we have to test with dummy id and pass so we put some test data to find out the test result  
		System.out.println(rc1+"   "+rc2); // all data execute by Iterate method 
	}   
	
	@DataProvider
	public Object[][] dataset1 ()
	{
	return new Object[][] {   
	{"id", "pass"},
	{"name","Sabbir"},
	{"middle", "Ahmed"},
	{"Last"," Ripon"},
	{"full", "SAR"}
	
	};
}
}
