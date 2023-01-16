package ui.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class realexampleofDataProvider {
	
	@Test(dataProvider="dataset")
	public void logincheck (String id, String pass) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver ();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(id);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
		
	}

	
	@DataProvider
	public Object[][] dataset () {
		
		return new Object [][] {
			{"standard_user","secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
				
			};
		}
		
	}
