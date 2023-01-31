package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_single_selection_in_dropdown extends TestBaseClass{

	@Test
	public void to_check_single_selection()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		boolean expectedResult = false;
		boolean actualResult =c.to_check_single_selection();
		Assert.assertEquals(actualResult, expectedResult);
	}
}
