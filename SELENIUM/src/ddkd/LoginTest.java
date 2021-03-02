package ddkd;

import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
	public static void main(String[] args) throws Throwable 
	{
		BaseTest bt=new BaseTest();
		bt.openBrower();
		Filelib fl=new Filelib();
		String un = fl.readPropData(PROP_PATH, "username");
		String pw = fl.readPropData(PROP_PATH, "password");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@type='submit']")).click();


		//bt.closeBrower();

	}

}
