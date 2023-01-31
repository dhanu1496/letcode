package letcodeProject.TestClass;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;

public class LoginDataUsingDataProvider extends TestBaseClass{

	@DataProvider(name="login_test_data")
	
	public Object[][] test_data()
	{
		Object[][] a = new Object[2][2];
		a[0][0] = "Dhanashri";
		a[0][1] = "shinde";
		
		a[1][0] = "Suraj";
		a[1][1] = "ramteke";
		
		return a;
	}
	
	@Test(dataProvider="login_test_data")
	public void check_login_details_using_dataprovider(String email, String password)
	{
		HomePOMClass a = new HomePOMClass(driver);
		a.click_login();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
}
