package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class validate_click_dropdown extends TestBaseClass{

	@Test
	public void click_dropdown()
	{
		HomePOMClass a = new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_dropdown();
		DropdownPOMClass c= new DropdownPOMClass(driver);
		String actualResult = c.click_on_dropdown();
		log.info(actualResult);
		String expectedResult ="Mango";
		Assert.assertEquals(actualResult,expectedResult);
		
	}
}
