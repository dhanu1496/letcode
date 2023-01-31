package letcodeProject.TestClass;

import java.util.List;

import org.apache.poi.xwpf.usermodel.SimpleTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.SimpleTablePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Validate_WebTable extends TestBase{

	@Test
	public void add_prices_from_webtable()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b= new WorkspacePOMCLass(driver);
		b.click_SimpleTable();		

		SimpleTablePOMClass c = new SimpleTablePOMClass(driver);
		int  calculatedResult = c.get_all_prices();
		int presentResult = c.get_Total_Price();
		
		Assert.assertEquals( presentResult, calculatedResult);
	}
	
}
