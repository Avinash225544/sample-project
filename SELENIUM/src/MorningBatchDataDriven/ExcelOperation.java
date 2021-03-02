package MorningBatchDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {

	public static String readData(String sheetName,int rownumber,int cellNumber) throws 
EncryptedDocumentException, IOException
	{
		
		FileInputStream fis=new FileInputStream(".//data//userdata.xlsx");
		 Workbook w1 = WorkbookFactory.create(fis);
        String s=w1.getSheet(sheetName).getRow(rownumber).getCell(cellNumber).getStringCellValue();
        return s;
	
		
	}
	
   public static void writeData(String sheetName,int rowNumber,int cellNumber,String cellData) throws 
EncryptedDocumentException, IOException
	{
	   FileInputStream fis=new FileInputStream(".//data//userdata.xlsx");
       Workbook w1=WorkbookFactory.create(fis);
w1.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(cellData);
FileOutputStream fos=new FileOutputStream(".//data/userdata.xlsx");
w1.write(fos); 

	
	
	}
}
