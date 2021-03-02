package MorningBatchDataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBill extends BaseClass {
	
	@Test
	public void testCreateBill() throws EncryptedDocumentException, IOException
	{
		String bn=ExcelOperation.readData("Sheet4",1,0);
		String exp=ExcelOperation.readData("Sheet4",1,1);
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnSettings();
		BillingTypePage btp=new BillingTypePage();
		btp.addNewBillingTypeButton();
		AddNewBillingTypePage anbt=new AddNewBillingTypePage();
		anbt.enterBillingTypename(bn);
		anbt.clickOnCreateBillingTypeButton();
	String act=btp.retriveSuccesssMessage();
	 ExcelOperation.writeData("Sheet4",1,2, act);
		try
		{
			Assert.assertEquals(act,exp);
			ExcelOperation.writeData("Sheet4",1,3,"PASS");
		}
	   catch(AssertionError rv)
		{
		   ExcelOperation.writeData("Sheet4",1,3,"FAIL");
		
		
	}

	}
	}
