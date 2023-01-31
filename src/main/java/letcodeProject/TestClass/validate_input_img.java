package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_input_img extends TestBaseClass{

	@Test
	public void validate_input_img_present()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b= new WorkspacePOMCLass(driver);
		boolean expectedResult = true;
		boolean actualResult= b.check_img_visible();
		AssertJUnit.assertEquals(actualResult, expectedResult);
	}
}
