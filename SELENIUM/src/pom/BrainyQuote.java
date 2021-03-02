package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrainyQuote
{

	@FindBy(xpath=("//i[@class='home-search fa fa-search']")) private WebElement auadd;
public BrainyQuote(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getauadd()
{
	
	return auadd;
}

}
