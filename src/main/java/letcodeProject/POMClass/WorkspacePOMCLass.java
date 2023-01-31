package letcodeProject.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkspacePOMCLass {
private WebDriver driver;
private Actions act;

@FindBy(xpath="//p[text()=' Input ']") private WebElement input;

public boolean check_input_text()
{
	boolean a =input.isDisplayed();
    return a;	
}

@FindBy(xpath="//a[text()='AUI - 5']") private WebElement slider;

public void click_slider()
{
	slider.click();
}

@FindBy(xpath="/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/header/div/figure/img") private WebElement input_img;

public boolean check_img_visible()
{
	boolean a = input_img.isDisplayed();
	return a;
}

@FindBy(xpath="//a[text()='Drop-Down']") private WebElement Dropdown_link;

public void click_dropdown()
{
Dropdown_link.click();	
}

@FindBy(xpath="//a[text()='Dialog']") private WebElement dialog;

public void click_dialog()
{
	 dialog.click();
}

@FindBy(xpath="//a[text()='Tabs']") private WebElement tabs;

public void click_tabs()
{
tabs.click();	
}

@FindBy(xpath="//a[text()='Simple table']") private WebElement SimpleTable;

public void click_SimpleTable()
{
	SimpleTable.click();	


}

public WorkspacePOMCLass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	act=new Actions(driver);
}
}
