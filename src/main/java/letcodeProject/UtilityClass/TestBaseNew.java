package letcodeProject.UtilityClass;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Listeners;
    import org.testng.annotations.Parameters;

    @Listeners(letcodeProject.UtilityClass.ListernersClass.class)
	public class TestBaseNew {
		
		

		Logger log = Logger.getLogger("letcodeProject");
		public static WebDriver driver;
	 
		@Parameters("browserName")
		@BeforeMethod
		public void setUp(String browserName)
		{
			if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
			}
			else
			{
				log.info("show exception");
			}
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser Opened");
			
			driver.manage().window().maximize();
			log.info("Browser Maximized");
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://letcode.in");
			log.info("URL Opened");
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
			log.info("Browser Closed");
		}
	}


