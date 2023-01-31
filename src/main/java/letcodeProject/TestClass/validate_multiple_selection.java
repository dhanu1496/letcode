package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_multiple_selection extends TestBaseClass {

	@Test
	public void check_multiple_selection()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		boolean expectedResult = true;
		boolean actualResult = c.check_multiselection();
		Assert.assertEquals(actualResult, expectedResult);
	}
}
