package Common;

import org.testng.annotations.DataProvider;

public class dataFileStore {
	
@DataProvider
public Object[][] dataset () {
		
		return new Object [][] {
			{"standard_user","secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"},
				{"jhdsjsk","kjdhjsh"}
				
			};
		}

}
