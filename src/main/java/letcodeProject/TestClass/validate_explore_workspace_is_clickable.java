package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;

public class validate_explore_workspace_is_clickable extends TestBaseClass{

	@Test
	public void check_workspace_click_functionality()
	{
		HomePOMClass b = new HomePOMClass(driver);
		b.explore_workspace();
		String expectedURL = "https://letcode.in/test";
		String actualURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualURL,expectedURL);
		String expectedTitle = "LetCode - Testing Hub";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		boolean expectedResult = true;
		boolean actualResult = b.check_workspace_clickable();
		Assert.assertEquals(actualResult,expectedResult);
	}
}
