package letcodeProject.TestClass;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.AlertPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_prompt_alert extends TestBaseClass{

	@Test
	public void check_prompt_alert()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver); 
		b.click_dialog();
		AlertPOMClass c = new AlertPOMClass(driver);
		c.click_prompt_alert();
		Alert alt =driver.switchTo().alert();
		alt.sendKeys("dhanashri");
		String actualResult =alt.getText();
		String expectedResult ="Enter your name";
		Assert.assertEquals(actualResult, expectedResult);
		alt.accept();
	}
}
