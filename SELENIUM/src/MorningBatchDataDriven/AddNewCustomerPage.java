package MorningBatchDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
    
	@FindBy(name="name")
	private WebElement customerNameTextfied;
	
    @FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
    
    public AddNewCustomerPage()
    {
      PageFactory.initElements(BaseClass.driver,this);
    }
	
	public void enterCustomerName(String name)
	{
		customerNameTextfied.sendKeys(name);
	}
	
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
}
