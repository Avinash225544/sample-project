package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {

	@FindBy(linkText="Projects & Customers")
	private WebElement projectsAndCustomerLink;
	
	
	@FindBy(linkText="Settings")
	private WebElement Settings;
	
	
	
	public OpenTaskPage()
	{
	  PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnProjectsAndCustomerLink()
	{
		projectsAndCustomerLink.click();
	}
	
	public void clickOnSettings()
	{
		Settings.click();
	}
	
}
