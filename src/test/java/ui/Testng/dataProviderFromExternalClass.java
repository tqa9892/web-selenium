package ui.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Common.browserClass;
import Common.dataFileStore;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderFromExternalClass  extends browserClass {
	
@Test(dataProvider="dataset", dataProviderClass =dataFileStore.class)
	public void websitelaunch (String id, String pass) {

	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys(id);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("login-button")).click();
	
}
	
	

}
