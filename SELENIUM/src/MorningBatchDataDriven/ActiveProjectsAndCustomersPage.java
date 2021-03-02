package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage {

	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewprojectButton;

	
	public ActiveProjectsAndCustomersPage()
	{
	  PageFactory.initElements(BaseClass.driver,this);
	}
	
	
	public void clickOnAddNewcustomerButton()
	{
	      addNewCustomerButton.click();
	}
	
	public String  retriveSuccessMessage()
	{
		  String s=successMessage.getText();
		  return s;
	}
	
	public void clickOnAddNewprojectButton()
	{
	   addNewprojectButton.click();	
	}
}
