package letcodeProject.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
 
public class TakeScreenshotClass {
	
	public static void takes_screenshot(WebDriver driver, String ScreenshotName ) throws IOException {
	
		Date d = new Date();
	DateFormat d1 = new SimpleDateFormat("MM-dd-yyyy & HH-mm-ss");
	String date = d1.format(d);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Screenshot\\"+ScreenshotName+date+".jpg");
	 FileHandler.copy(source, dest);
	}
}
