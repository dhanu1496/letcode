package letcodeProject.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.SliderPOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;
import letcodeProject.UtilityClass.TestBaseNew;

public class Validate_Slider extends TestBaseNew{

	@Test
	public void move_slider()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b= new WorkspacePOMCLass(driver);
		b.click_slider();
		SliderPOMClass c= new SliderPOMClass(driver);
		c.click_on_slider();
		String Expected = "Word limit : 50";
		String Actual =c.get_text_of_limit();
		Assert.assertEquals(Actual, Expected);
	}
}
