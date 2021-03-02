package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata {

	public static void main(String[] args) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream("D:\\testdata\\Book1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
	String value =	wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(value);
	}

}
