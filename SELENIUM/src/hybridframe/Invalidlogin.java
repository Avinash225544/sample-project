package hybridframe;

import org.openqa.selenium.By;

import hybridframe.BaseTest;
import hybridframe.Filelib;

public class Invalidlogin extends BaseTest
{
	public static void main(String[] args) throws Throwable 
	{

		BaseTest bt = new BaseTest();
		bt.openBrower();
		Filelib fi = new Filelib();
// int rc = fi.getRowCount("D:/testdata/Book2.xlsx","Sheet1");
//for(int i=2;i==rc;i++)
		//
			String un = fi.getdata("D:/testdata/Book2.xlsx","Sheet1", 2,0);
			String pwd = fi.getdata("D:/testdata/Book2.xlsx","Sheet1",2,1);
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(3000);
			driver.findElement(By.id("pwd")).sendKeys(pwd);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
		//
		
			bt.closeBrower();
			Thread.sleep(3000);
	}

}
