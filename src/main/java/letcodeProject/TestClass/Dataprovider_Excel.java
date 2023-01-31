package letcodeProject.TestClass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.LoginPOMClass;
import letcodeProject.POMClass.LogoutPOMClass;
import letcodeProject.UtilityClass.ExcelUtility;

public class Dataprovider_Excel extends TestBase{

	@Test(dataProvider="LoginTestData")
	public void data_from_Excel(String email, String password, String exp)
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.click_login();
		
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	    driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	    
	   
	    LoginPOMClass b = new LoginPOMClass(driver);
	    String actualResult = b.get_wlcm_text();
	    log.info(actualResult);
//	    Assert.assertEquals(actualResult, expectedResult);
	    LogoutPOMClass c = new LogoutPOMClass(driver); 
	    
	    
	    if(exp.equals("valid"))
	    {
	    	 String expectedResult = "Welcome Dhanashri";
	    	if(expectedResult.equals(actualResult))
	    	{
	    	//	c.click_signout();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    }
	    
	     if(exp.equals("invalidPassword"))
	    {
	    	String expectedResult ="Error: The password is invalid or the user does not have a password.";
	    	if(expectedResult.equals(actualResult))
	    	{
	    	//	c.click_signout();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    }
	    
	      if(exp.equals("invalidUsername"))
	    {
	    	String expectedResult = "Error: There is no user record corresponding to this identifier. The user may have been deleted.";
	    	if(expectedResult.equals(actualResult))
	    	{
	    	//	c.click_signout();
	    		Assert.assertTrue(true);
	    	}
	    	else {
	    	Assert.assertTrue(false);
	    	}
	    }
	    
	      if(exp.equals("invalidBoth"))
	    {
	    	String expectedResult ="Error: There is no user record corresponding to this identifier. The user may have been deleted.";
	    	if(expectedResult.equals(actualResult))
	    	{
	    	//	c.click_signout();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    }
	    
	}
	
	@DataProvider(name = "LoginTestData")
	public String[][] getData() throws IOException
	{
	String path = "./dataExcel\\Excelsheet_for_dataprovider.xlsx//";
	ExcelUtility xl = new ExcelUtility(path);
	int totalrows = xl.getRowCount("Sheet1");
	int totalcols = xl.getCellCount("Sheet1",1);
	String loginData[][] = new String[totalrows][totalcols] ;
	
	for(int r = 1;r<=totalrows;r++)
	{
		for(int c = 0;c<totalcols;c++)
		{
			loginData[r-1][c] = xl.getCellData("Sheet1", r, c);
		}
	}
	
	
	 
	return loginData;
	
	}
}
