package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {

	private WebDriver driver;
	
	@FindBy(xpath="")private WebElement username;
	
	public void send_username()
	{
		username.sendKeys();
	}
	
    @FindBy(xpath="")private WebElement password;
	
	public void send_password()
	{
		
	}
	
  @FindBy(xpath="//div[text()=' Welcome Dhanashri ']")private WebElement wlcm_text;
	
	public String get_wlcm_text()
	{
		String a =wlcm_text.getText();
		return a;
	}
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
