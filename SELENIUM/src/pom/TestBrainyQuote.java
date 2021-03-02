package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrainyQuote {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","c://driverss/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.brainyquote.com");
		BrainyQuote bq=new BrainyQuote(driver);
		bq.getauadd().sendKeys("William Shakespeare");
		
		

	}

}
