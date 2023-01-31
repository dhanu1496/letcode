package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_default_option_selected_in_dropdown extends TestBaseClass{

	@Test
	public void check_default_option_selected_in_dropdown()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		String expectedResult = "Select Fruit";
		String actualResult = c.to_check_default_option();
		Assert.assertEquals(actualResult,expectedResult);
		
	}
}
