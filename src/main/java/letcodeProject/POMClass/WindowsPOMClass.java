package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsPOMClass {

	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='multi']") private WebElement multiwindows;
	
	public void click_on_multiple_windows()
	{
		multiwindows.click();
	}
	
	
	
	public WindowsPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
