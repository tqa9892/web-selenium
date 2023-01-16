package ui.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practices {
	
	
	@Test(dataProvider="setdata")
	public void datatest1 (String title, String fr, String ls) {
		
	}

	@DataProvider
	public Object[][] setdata(){
		
		
		return new Object[][] {
			{"father", "safiq", "U"},
			{"mother","Saleha", "b"},
			{"son","Am","you"}
		};
	}
	

}
