package letcodeProject.POMClass;

import org.testng.annotations.DataProvider;

public class DataProviderPOMClass {

	
	
@DataProvider(name="login_test_data")
	
	public Object[][] test_data()
	{
		Object[][] a = new Object[2][2];
		a[0][0] = "Dhanashri@gmail.com";
		a[0][1] = "shinde";
		
		a[1][0] = "Suraj@gmail.com";
		a[1][1] = "ramteke";
		
		return a;
	}
}
