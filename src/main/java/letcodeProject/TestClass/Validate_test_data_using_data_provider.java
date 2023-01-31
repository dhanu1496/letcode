package letcodeProject.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.DataProviderPOMClass;
import letcodeProject.POMClass.HomePOMClass;

public class Validate_test_data_using_data_provider extends TestBaseClass{

	@Test(dataProvider="login_test_data",dataProviderClass=DataProviderPOMClass.class)
	public void check_login_details_using_dataprovider(String email, String password) throws InterruptedException
	{
		HomePOMClass a = new HomePOMClass(driver);
		a.click_login();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

		
		WebElement errormsg = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
		String actual = errormsg.getText();
		log.info(actual);
		String expected = "Error: There is no user record corresponding to this identifier. The user may have been deleted.";
		 Assert.assertEquals(actual,expected);
	}
	}

