package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; // brackate is called paranthesis

import Common.browserClass;

public class ScreeshotTestng extends browserClass {

	public void errorscreenshot() throws IOException {
		Date currenttime = new Date();
		String screenshotfilename = currenttime.toString().replace(" ", "-").replace(":", "-");

		System.out.println(screenshotfilename);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // copied this file form
																							// https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/TakesScreenshot.html
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));
}

}
