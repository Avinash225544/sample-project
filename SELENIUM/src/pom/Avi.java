package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avi
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","c://driverss/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://190.210.184.180/login.do");
	
	Loginpage lp=new Loginpage(driver);
	driver.navigate().refresh();
	lp.getuntb().sendKeys("admin");
	lp.getpwtb().sendKeys("manager");
	
}
}
