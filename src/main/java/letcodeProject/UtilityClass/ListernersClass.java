package letcodeProject.UtilityClass;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersClass extends TestBaseNew implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test is Started");
		try {
			TakeScreenshotClass.takes_screenshot(driver, "Started_page");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is success");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test is Fail");
	}

	public void onTestSkipped(ITestResult result) {
		
	System.out.println("Test is skipped");
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Test is finised");
	}

	
}
