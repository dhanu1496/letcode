package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.UtilityClass.TakeScreenshotClass;

public class Validate_Url extends TestBaseClass{

	@Test
	public void validate_URL_Functionality() throws IOException
	{
		TakeScreenshotClass.takes_screenshot(driver,"homepage");
	  String expectedURL="https://letcode.in/";	
	  log.info(expectedURL);
      String actualURL =driver.getCurrentUrl();
      log.info(actualURL);
      AssertJUnit.assertEquals(actualURL, expectedURL);
      String expectedTitle = "LetCode with Koushik";
      log.info(expectedTitle);
      String actualTitle = driver.getTitle();
      log.info(actualTitle);
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	
}
