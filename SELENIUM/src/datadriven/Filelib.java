package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {

	public String getdata(String path, String sheet,int row, int cell) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(path);
	Workbook	wb =WorkbookFactory.create(fis);
	 String value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public int getRowCount(String path, String sheet) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(path);
		Workbook	wb =WorkbookFactory.create(fis);
		int rc=wb.getSheet(sheet).getLastRowNum();
		return rc;
	}
	public void setData(String path, String sheet, int row, int cell, String data) throws Throwable 
	{
		FileInputStream fis= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		
	}
	public String readPropData(String propPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String Propvalue=prop.getProperty(key,"Incorrecg key");
		return Propvalue;
	}
	
	

	}

