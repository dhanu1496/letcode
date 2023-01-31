package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
  private WebDriver driver;
  private Actions act;
  
  @FindBy(xpath="//a[text()='Explore Workspace']") 
  WebElement explore_workspace;
  
  public void explore_workspace()
  {
	  explore_workspace.click();
  }
  
  public boolean check_workspace_clickable()
  {
	  boolean a = explore_workspace.isEnabled();
	  return a;
  }
  
 public String check_workspace()
  {
	act.moveToElement(explore_workspace);
	String a = explore_workspace.getText();
	return a;
  }
 
 public boolean check_workspace_again()
 {
	boolean a= explore_workspace.isDisplayed();
	return a;
 }
 
 @FindBy(xpath="//a[text()='Log in']") private WebElement login;
 
 public void click_login()
 {
	 login.click();
 }
  
  public HomePOMClass(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  act=new Actions(driver);
  }
  
}
