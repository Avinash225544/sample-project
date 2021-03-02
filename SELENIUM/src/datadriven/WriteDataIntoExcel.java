package datadriven;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Throwable 
	{
		Filelib flib=new Filelib();
		flib.setData("D:\\testdata\\Book1.xlsx", "sheet1", 4, 8, "raghav");

	}

}
