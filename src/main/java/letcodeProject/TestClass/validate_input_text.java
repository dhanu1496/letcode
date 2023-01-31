package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_input_text extends TestBaseClass {

	@Test
	public void is_input_text_visible()
	{
		HomePOMClass a = new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass c = new WorkspacePOMCLass(driver);
		boolean expectedResult = true;
		boolean actualResult =c.check_input_text();
		Assert.assertEquals(actualResult, expectedResult);
	}
}
