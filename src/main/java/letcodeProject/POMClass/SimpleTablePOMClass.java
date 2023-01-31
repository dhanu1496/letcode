package letcodeProject.POMClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleTablePOMClass {
private WebDriver driver;
private Actions act;
private int a;
private int b;
private String data;

@FindBy(xpath="//table[@id='shopping']//tbody//tr//td[2]") private List<WebElement> all_prices;
public int get_all_prices()
{
	int sum_price=0;
	for(WebElement p :all_prices)
	{
		sum_price = sum_price+Integer.parseInt(p.getText());
	}
	
   int getTotal = sum_price;
   return getTotal;
    }

    @FindBy(xpath="/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tfoot/td[2]/b") private WebElement Total;

     public int get_Total_Price()
     {
	int actualTotal = Integer.parseInt(Total.getText());
	return actualTotal;
    }
     
     @FindBy(xpath="//table[@id='simpletable']//tbody/tr//td[2]") private WebElement raj;
     
     public String get_text_raj()
     {
    	 String a = raj.getText();
    	 return a;
     }
     
     @FindBy(xpath="//input[@id='second']") private WebElement checkbox;
     
     public void click_on_checkbox()
     {
    	 checkbox.click();
     }
     
     public boolean status_of_checkbox()
     {
    	 boolean a =checkbox.isSelected();
    	 return a;
     }
     
     @FindBy(xpath="//table[@id='simpletable']") private WebElement table2;
     
     public void move_to_table2()
     {
    	 act.moveToElement(table2);
     }
     
     @FindBy (xpath="//table[@id='simpletable']//tbody//tr") private List<WebElement> rows;
     
     public int get_rows()
     {
        int a =rows.size();
        
    	 return a;
     }
     
    @FindBy (xpath="//table[@id='simpletable']//tbody//tr") private List<WebElement> cols;
     
     public int get_cols()
     {
        int b =cols.size();
       
    	 return b;
     }
     
     public String get_text_from_table()
     {
     for(int i=1;i<=a;i++) 
     {	
    	 for(int j=1;j<=b;j++) 
    	 {
     String data = driver.findElement(By.xpath("//table[@id='simpletable']//tbody//tr["+a+"]//td["+b+"]")).getText();

    }
    }
     return data;
    }
     
     public SimpleTablePOMClass (WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	act = new Actions(driver);
    }
    }