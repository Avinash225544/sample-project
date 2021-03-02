package hybridframe;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib 
{
	public String getdata(String path, String sheet,int row, int cell) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(path);
	Workbook	wb =WorkbookFactory.create(fis);
	 String value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	public String readPropData(String propPath, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String Propvalue=prop.getProperty(key,"Incorrecg key");
		return Propvalue;
	}
	public int getRowCount(String path, String sheet) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook	wb =WorkbookFactory.create(fis);
		int rc=wb.getSheet(sheet).getLastRowNum();
		return rc;
	}
	
	
	

}
