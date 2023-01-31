package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_all_selected_options_text extends TestBaseClass{

	@Test
	public void get_selected_options_text()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		
		String actualResult =c.multiple_selection_text();
		log.info(actualResult);
		
	}
}
