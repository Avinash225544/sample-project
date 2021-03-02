package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingTypePage {

	@FindBy(xpath="//input[@value='Add New Billing Type']")
	private WebElement addNewBillingTypeButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessge;
	
	
	public BillingTypePage()
	{
	  PageFactory.initElements(BaseClass.driver,this);
	}

	
	public void addNewBillingTypeButton()
	{
		addNewBillingTypeButton.click();
	}
	
	public String retriveSuccesssMessage()
	{
		String s=successMessge.getText();
		return s;
	}
	
	
}
