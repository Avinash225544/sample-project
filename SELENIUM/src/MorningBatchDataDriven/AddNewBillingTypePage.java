package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewBillingTypePage {
	
    @FindBy(name="name0")	
	private WebElement billingTypeName;
	
	@FindBy(xpath="//input[@value='Create Billing Type(s)']")
	private WebElement createBillingTypebutton;
	
	public AddNewBillingTypePage()
	{
	  PageFactory.initElements(BaseClass.driver,this);
	}

	public void enterBillingTypename(String name)
	{
		billingTypeName.sendKeys(name);
	}
	
	public void clickOnCreateBillingTypeButton()
	{
		 createBillingTypebutton.click();
	}
	

}
