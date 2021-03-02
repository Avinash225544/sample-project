package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.qspiders.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
	WebElement w1=	driver.findElement(By.xpath("//span[text()='Telangana']"));
	//driver.navigate().refresh();
	Actions a=new Actions(driver);
	a.moveToElement(w1).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[1]/footer[1]/a[1]/span[2]")).click();
driver.findElement(By.xpath("//span[text()='Enroll']")).click();
	}

}
