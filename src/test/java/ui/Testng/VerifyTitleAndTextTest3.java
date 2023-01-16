package ui.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest3 {

	@Test
	public void titletest() {

		SoftAssert softassert = new SoftAssert(); //
		String expectedtitle = "Electronics, Cars,(add dummy ) Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		// Assert.assertEquals(actualtitle, expectedtitle); // hard Assert will stop
		// execute further if tit's find any failed case

		// System.out.println("before assert start");

		softassert.assertEquals(actualtitle, expectedtitle, "Title execution");
		//System.out.println("before test execute");

		softassert.assertEquals(actualtext, expectedtext, "test execution");
		//System.out.println("after all execution");
		driver.close();
		softassert.assertAll(); // very important line if we don't add this line test will say itpass the test
								// cases

	}

}
