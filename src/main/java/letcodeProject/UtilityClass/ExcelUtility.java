package letcodeProject.UtilityClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path = null;
	
	
	//for how many rows are there
	public int  getRowCount(String sheetName) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		 
		wb.close();
		fi.close();
		return rowcount;	
	}
	
	
	//for how many columns or cells are there
	public int  getCellCount(String sheetName, int rownum) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		 
		wb.close();
		fi.close();
		return cellcount;	
	}
	
	// to read data and fetch data  from excel sheet
	public String getCellData(String sheetName,int rownum,int cellnum) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try {
			data = formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data = "";
			
		}
		wb.close();
		fi.close();
		return data;
		
		
	}
	
	
	
	
	
	//constructor of excel utility class
	public ExcelUtility(String path)
	{
		this.path = path;
	}
}
