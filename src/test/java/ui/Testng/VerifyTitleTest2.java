package ui.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest2 {
	
	@Test
	public void titletest () {
		
		String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver () ;
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();		
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();// assert.assertequals is hard coded
} //if any test cases failed it doesn't executed further it's stopped there. that's why we use softassert 
     //softassert execute all test cases and report all even if any test cases fail it doesn't stop 
	// it complete the full execution and report fail
}
