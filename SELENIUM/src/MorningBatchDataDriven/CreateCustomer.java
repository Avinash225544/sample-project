package MorningBatchDataDriven;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
	//specific code
	String cn=ExcelOperation.readData("Sheet2",1,0);
	String exp=ExcelOperation.readData("Sheet2",1,1);
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnProjectsAndCustomerLink();
    ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
    apcp.clickOnAddNewcustomerButton();
    AddNewCustomerPage ancp=new AddNewCustomerPage();
    ancp.enterCustomerName(cn);
    ancp.clickOnCreateCustomerButton();
    String act=apcp.retriveSuccessMessage();
    ExcelOperation.writeData("Sheet2",1,2, act);
	try
	{
		Assert.assertEquals(act,exp);
		ExcelOperation.writeData("Sheet2",1,3,"PASS");
	}
   catch(AssertionError rv)
	{
	   ExcelOperation.writeData("Sheet2",1,3,"FAIL");
	}
	}
	
	
}
