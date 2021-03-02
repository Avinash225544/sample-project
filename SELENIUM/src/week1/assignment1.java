package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","c://driverss/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.qspiders.com");
		WebElement w1 = driver.findElement(By.xpath("//span[text()='Telangana']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Batches']/ancestor::a[@class='button is-persian is-small has-text-weight-semibold']")).click();
	Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Enroll']")).click();
	}

}
