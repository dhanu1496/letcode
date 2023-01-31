package letcodeProject.POMClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPOMClass {
 private WebDriver driver;
 
 
@FindBy(xpath="//button[@id='confirm']") private WebElement confirm_alert;

public void click_confirm_alert() throws InterruptedException {
	confirm_alert.click();
//	Thread.sleep(5000);
	
} 

 
@FindBy(xpath="//button[@id='prompt']") private WebElement prompt_alert;

public void click_prompt_alert() {
	prompt_alert.click();
	
} 

@FindBy(xpath="//button[@id='modern']") private WebElement sweet_alert;

public void click_sweet_alert() {
	sweet_alert.click();
	
} 




 public AlertPOMClass(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 
 }
}
