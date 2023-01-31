package letcodeProject.TestClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import letcodeProject.POMClass.HomePOMClass;
import letcodeProject.POMClass.SimpleTablePOMClass;
import letcodeProject.POMClass.WorkspacePOMCLass;

public class Retrive_data_from_WebTable extends TestBase{

	@Test
	public void retrive_table_data()
	{
		HomePOMClass a= new HomePOMClass(driver);
		a.explore_workspace();
		WorkspacePOMCLass b= new WorkspacePOMCLass(driver);
		b.click_SimpleTable();		

		SimpleTablePOMClass c = new SimpleTablePOMClass(driver);
		
//		int rows = driver.findElements(By.xpath("//table[@id='simpletable']//tbody//tr")).size();
//	
//		int columns = driver.findElements(By.xpath("//table[@id='simpletable']//thead//th")).size();
//	
//		for(int r=1; r<=rows;r++)
//		{
//			for(int t=1;t<=columns;t++)
//			{
//			String data = driver.findElement(By.xpath("//table[@id='simpletable']//tbody//tr["+r+"]//td["+t+"]")).getText();
//		    System.out.print(data+"    ");
//			}
//			System.out.println();
//			}
		
		int totalRows =c.get_rows();
		log.info(totalRows);
		int totalcols =c.get_cols();
		log.info(totalcols);
		String text = c.get_text_from_table();
		log.info(text);
	}
}
