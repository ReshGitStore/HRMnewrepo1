package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashboard  {
	
	//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
	

	@FindBy(xpath="//*[@id=\"menu_dashboard_index\"]/b") 
	public static WebElement Dashbaord;
	@FindBy(xpath="//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/td") 
	public static WebElement PendingLevereq ;
	
	@FindBy ()
	


}
