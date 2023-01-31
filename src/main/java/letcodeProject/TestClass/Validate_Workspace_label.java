package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;

public class Validate_Workspace_label extends TestBaseClass {

	@Test
	public void check_workspace_label()
	{
		HomePOMClass a= new HomePOMClass(driver);
		String expectedResult ="Explore Workspace";
		String actualResult = a.check_workspace();
		log.info(actualResult);
		AssertJUnit.assertEquals(actualResult, expectedResult);
		boolean ExpectedR1 = true;
		boolean ActualR1 = a.check_workspace_again();
		AssertJUnit.assertEquals(ActualR1,ExpectedR1);
	}
}
