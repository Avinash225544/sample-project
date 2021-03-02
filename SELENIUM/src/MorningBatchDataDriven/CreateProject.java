package MorningBatchDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateProject extends BaseClass {
	@Test
	public void testcreateProject() throws EncryptedDocumentException, IOException
	{
      String cn=ExcelOperation.readData("Sheet3",1,0);
      String pn=ExcelOperation.readData("Sheet3",1,1);
      String exp=ExcelOperation.readData("Sheet3",1,2);
      OpenTaskPage otp=new OpenTaskPage();
      otp.clickOnProjectsAndCustomerLink();
      ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
      apcp.clickOnAddNewprojectButton();
      AddNewProjectPage anpp=new AddNewProjectPage();
      anpp.selectCustomerNamefromDropdown(cn);
      anpp.enterProjectname(pn);
      anpp.clickOnCreateProject();
      String act=apcp.retriveSuccessMessage();
      ExcelOperation.writeData("Sheet3",1,3,act);
    //STep 4 compare exp and act 
    try
    {
    	Assert.assertEquals(exp,act);
    	ExcelOperation.writeData("Sheet3",1,4,"Pass");
    }
    catch(AssertionError rv)
    {
    	ExcelOperation.writeData("Sheet3",1,4,"Fail");
    	    	
    
    
	}

}
}