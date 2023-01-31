package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMClass {
   private WebDriver driver;
   
   @FindBy(xpath="//a[text()='Sign out']") private WebElement signout;
   
   public void click_signout()
   {
	   signout.click();
   }
   
   public  LogoutPOMClass (WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
}
