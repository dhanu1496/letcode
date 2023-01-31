package letcodeProject.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.AlertPOMClass;
import letcodeProject.POMClass.DropdownPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WindowsPOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_child_window extends TestBaseClass{

	@Test
	 public void handle_multiple_windows() throws InterruptedException
	 {
		HomePOMClass a = new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b = new WorkspacePOMCLass(driver);
		b.click_tabs();
		WindowsPOMClass c = new WindowsPOMClass(driver);
		c.click_on_multiple_windows();
		List<String> allAddresses = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(allAddresses.get(1));
//	    Thread.sleep(3000);
	    AlertPOMClass d = new AlertPOMClass(driver);
	    d.click_confirm_alert();
//	    Thread.sleep(3000);
	    Alert alt = driver.switchTo().alert();
		String actualResult = alt.getText();
		String expectedResult = "Are you happy with LetCode?";
		
		Assert.assertEquals(actualResult, expectedResult);
		alt.accept();
	    driver.switchTo().window(allAddresses.get(2));
//	    Thread.sleep(3000);
	    DropdownPOMClass e = new DropdownPOMClass(driver);
	//    Thread.sleep(3000);
	    String actualResult1 = e.click_on_dropdown();
		log.info(actualResult1);
		String expectedResult1 ="Mango";
		Assert.assertEquals(actualResult1,expectedResult1);
	 }
}
