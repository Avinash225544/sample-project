package MorningBatchDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	//public static ChromeDriver driver;//declartion
	//in the above code driver is ChromeDriver type, so driver is a specific ref-var
//a ref-var which can hold only one type of object is a specific ref-var
//Here, is a specific ref-var because it can store only Chromeobject
//which should not declare driver as a specific ref-var, rather we should
//declare driver as generic ref-var	
	//solution--declare driver as WebDriver type
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() throws EncryptedDocumentException, IOException
	{ 
	String url=ExcelOperation.readData("Sheet1",1,0);
	String browser=ExcelOperation.readData("Sheet1",1,3);
	if(browser.equals("chrome"))
	{
	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		//ChromeDriver driver=new ChromeDriver();
		//declaration-------//initialization
		//int i=10
		//any variable  declared inside a method is local variable
		//local variable cannot be outside the method
		driver=new ChromeDriver();//initialization
	}
	else if(browser .equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/firefoxdriver.exe");
		driver=new FirefoxDriver();
	}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@AfterTest
	public void  closeBrowser()
	{
		driver.close();
	}
	
	@BeforeClass
	public void login() throws EncryptedDocumentException, IOException
	{
		String un =ExcelOperation.readData("Sheet1",1,1);
		String psd =ExcelOperation.readData("Sheet1",1,2);	
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(psd);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	
	@AfterClass
	public void logout()
	{
	 driver.findElement(By.className("logoutImg")).click();	
	}
}
