package letcodeProject.POMClass;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPOMClass {

	private WebDriver driver;
	private Select s ;
	private Select s1;
	private Actions act;
	
	@FindBy(xpath="//select[@id='fruits']") private WebElement dropdown;
	
	public String click_on_dropdown()
	{
		dropdown.click();
		s.selectByIndex(2);
		WebElement a = s.getFirstSelectedOption();
		String b = a.getText();
		return b;
	}
	
	public String to_check_default_option()
	{
		WebElement a = s.getFirstSelectedOption();
		String b = a.getText();
		return b;
	}
	
	public int to_count_options_in_dropdown()
	{
	List<WebElement> a = s.getOptions();
	 int b = a.size();
	 return b;
	}
	
	public boolean to_check_single_selection()
	{
		boolean a=s.isMultiple();
		return a;
	}
	
	@FindBy(xpath ="/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div/p") private WebElement mango;
	
	public String verify_text_from_selected_option()
	{
		dropdown.click();
		s.selectByVisibleText("Mango");
		String a =mango.getText();
		return a;
	}
	
	@FindBy(xpath="/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[2]/div/div[1]/select") private WebElement multiselected;
	
	public boolean check_multiselection()
	{
		boolean a = s1.isMultiple();
		return a;
	}
	
	public boolean check_multiple_selection_again()
	{
		s1.selectByVisibleText("Ant-Man");
		act.keyDown(Keys.CONTROL).perform();
		s1.selectByVisibleText("The Avengers");
		act.keyUp(Keys.CONTROL).perform();
		boolean a= s1.isMultiple();
		return a;
	}
	
	public String multiple_selection_text()
	{
		s1.selectByVisibleText("Ant-Man");
		act.keyDown(Keys.CONTROL).perform();
		s1.selectByVisibleText("The Avengers");
		act.keyUp(Keys.CONTROL).perform();
		List<WebElement> a = s1.getAllSelectedOptions();
		for(WebElement i : a)
		{
		System.out.println(i.getText()); 
			
		}
	return "";
	}
	
	
	
	
	
	public DropdownPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		s= new Select(dropdown);
		s1= new Select(multiselected);
		act = new Actions(driver);
	}
}
