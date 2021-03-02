package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage {
	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="name")
	private WebElement projectNameTextfield;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;


	public AddNewProjectPage()
	{
	  PageFactory.initElements(BaseClass.driver,this);
	}

	
 	public  void selectCustomerNamefromDropdown(String name)
 	{
        Select s1=new Select(customerDropdown);
        s1.selectByVisibleText(name);
 	}
 	
 	public void enterProjectname(String name)
 	{
        projectNameTextfield.sendKeys(name);
 	}
 	
 	public void clickOnCreateProject()
 	{
 		createProjectButton.click();
 	}
}
