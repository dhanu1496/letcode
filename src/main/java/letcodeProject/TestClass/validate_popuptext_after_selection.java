package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_popuptext_after_selection extends TestBaseClass {

	@Test
	public void check_popup_text()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		String expectedResult = "You have selected Mango";
		String actualResult = c.verify_text_from_selected_option();
		AssertJUnit.assertEquals(actualResult, expectedResult);
	}
}
