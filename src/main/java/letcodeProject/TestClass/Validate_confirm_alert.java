package letcodeProject.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.AlertPOMClass;
import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_confirm_alert extends TestBaseClass{
	
	@Test
	public void check_confirm_alert() throws InterruptedException
	{
	HomePOMClass a= new HomePOMClass(driver);
	a.explore_workspace();
	WorkspacePOMCLass b = new WorkspacePOMCLass(driver); 
	b.click_dialog();
	AlertPOMClass c = new AlertPOMClass(driver);
	c.click_confirm_alert();

	String expectedResult = "Are you happy with LetCode?";
	     
	WebDriverWait wait = new WebDriverWait(driver, 5);
         wait.until(ExpectedConditions.alertIsPresent());

         Alert alert = driver.switchTo().alert();
         String actualResult =alert.getText();
        
         Assert.assertEquals(actualResult, expectedResult);
         alert.accept();
}
}
