package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_options_count_of_dropdown extends TestBaseClass{

	@Test
	public void check_options_count()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c = new DropdownPOMClass(driver);
		int expectedCount =6;
		int actualCount = c.to_count_options_in_dropdown();
		log.info(actualCount);
		Assert.assertEquals(actualCount,expectedCount);
	}
}
