package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserClass {
	
	public static WebDriver driver = null ;
	
	@BeforeSuite
	public void browsersetup () {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver ();
		 driver.manage().window().maximize();
		
	}
	
	@AfterSuite
	public void browserclosing () {
		driver.close();
	}

}
