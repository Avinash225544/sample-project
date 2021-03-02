package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	//Declaration
	@FindBy(name="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(name=" Login now ") private WebElement loginbutton;
	//Initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public WebElement getuntb()
	{
		return untb;
	}
	public WebElement getpwtb()
	{
		return pwtb;
	}
	public void clickonloginbutton()
	{
		 loginbutton.click();
	}
}
