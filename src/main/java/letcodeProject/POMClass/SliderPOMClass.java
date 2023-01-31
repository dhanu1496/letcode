package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPOMClass {

	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='generate']") private WebElement Sliderr;
	
	public void click_on_slider()
	{
		act.dragAndDropBy(Sliderr, 692, 287).click().perform();
	}
	
	@FindBy (xpath="//h1[@class='subtitle has-text-info']") private WebElement wordlimit;
	
	public String get_text_of_limit()
	{
		String a =wordlimit.getText();
		return a;
	}
	
	public SliderPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
}
