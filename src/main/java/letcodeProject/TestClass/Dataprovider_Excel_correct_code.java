package letcodeProject.TestClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.LoginPOMClass;
import letcodeProject.POMClass.LogoutPOMClass;
import letcodeProject.UtilityClass.ExcelUtility;

public class Dataprovider_Excel_correct_code extends TestBase{

	@Test(dataProvider="LoginTestData")
	public void data_from_Excel(String email, String password, String data) throws InterruptedException
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.click_login();
		
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	    driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	    Thread.sleep(4000);
	    
	   
	    LoginPOMClass b = new LoginPOMClass(driver);
//	    String actualResult = b.get_wlcm_text();
//	    log.info(actualResult);
////	    Assert.assertEquals(actualResult, expectedResult);
	    LogoutPOMClass c = new LogoutPOMClass(driver); 
	    
	  //Asserstion by using popup text
	  		WebElement popup = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
	  		String  s= popup.getText();
	  		Thread.sleep(2000);
	  		System.out.println(s);
	  		
	  		

//	  		if(data.equals("valid"))
//	  		{
//	  			String expected = "Welcome Dhanashri";
//	  			if(s.equals(expected))
//	  			{
//	  				Assert.assertTrue(true);
//	  			}
//	  			else
//	  			{
//	  				Assert.assertTrue(false);
//	  			}
//	  			
//	  		}
//	  		if(data.equals("invalidPassword"))
//	  		{
//	  			String expected = "Error: The password is invalid or the user does not have a password.";
//	  			if(s.equals(expected))
//	  			{
//	  				Assert.assertTrue(true);
//	  			}
//	  			else
//	  			{
//	  				Assert.assertTrue(false);
//	  			}
//	  			
//	  		}
//	  		
//	  		
//	  	
//	  		if(data.equals("invalidUsername"))
//	  		{
//	  			String expected = "Error: There is no user record corresponding to this identifier. The user may have been deleted.";
//	  			if(s.equals(expected))
//	  			{
//	  				Assert.assertTrue(true);
//	  			}
//	  			else
//	  			{
//	  				Assert.assertTrue(false);
//	  			}
//	  			
//	  		}
	  		//////////////////////
	  		//Asseration by using URL 
	  		String actualurl = driver.getCurrentUrl();
	  		
	  		
	  		
	  		if(data.equals("valid"))
	  		{
	  			String expected = "https://letcode.in/";
	  			if(actualurl.equals(expected))
	  			{
	  				Assert.assertTrue(true);
	  			}
	  			else
	  			{
	  				Assert.assertTrue(false);
	  			}
	  			
	  		}
	  		
	  		

	  		if(data.equals("invalidPassword"))
	  		{
	  			String expected = "https://letcode.in/signin";
	  			if(actualurl.equals(expected))
	  			{
	  				Assert.assertTrue(true);
	  			}
	  			else
	  			{
	  				Assert.assertTrue(false);
	  			}
	  		}
	  		
	  		if(data.equals("invalidUsername"))
	  		{
	  			String expected = "https://letcode.in/signin";
	  			if(actualurl.equals(expected))
	  			{
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
