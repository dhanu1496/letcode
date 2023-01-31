package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.SimpleTablePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_checkbox extends TestBase{

	@Test
	
	public void click_checkbox() throws InterruptedException
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b= new WorkspacePOMCLass(driver);
		b.click_SimpleTable();		

		SimpleTablePOMClass c = new SimpleTablePOMClass(driver);
		c.move_to_table2();
		Thread.sleep(10000);
		String result1 = c.get_text_raj();
		
		if(result1.equals("Raj"))
		{
			c.click_on_checkbox();
			Thread.sleep(7000);
		}
		
		boolean expectedResult = true;
		boolean actualResult = c.status_of_checkbox();
		Assert.assertEquals(actualResult, expectedResult);
	}
}
