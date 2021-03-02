package ddkd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ddkd.Filelib;

public class BaseTest implements IAutoconsts
{
public static WebDriver driver;
public  void openBrower() throws Throwable
{
	
	Filelib flib = new Filelib();
	String browser=flib.readPropData(PROP_PATH,"browser");
	System.out.println(browser);
if(browser.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","c://driverss/chromedriver.exe");
	driver = new ChromeDriver();
	
}
else if(browser.equals("firefox"))
{
	driver = new FirefoxDriver();
}
else
{
	System.out.println("dabba fellow, give correct browser name..");
}
String appUrl=flib.readPropData(PROP_PATH,"url");
driver.get(appUrl);
}
public  void closeBrower()
{
	driver.quit();
}
}