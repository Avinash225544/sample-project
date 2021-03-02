package datadriven;

public class Example1 
{
	public static void main(String[] args) throws Throwable 
	{
		Filelib flib=new Filelib();
		int rc = flib.getRowCount("D:\\testdata\\Book1.xlsx", "sheet1");
		for(int i=0;i<=rc;i++)
		{
			String value=flib.getdata("D:\\testdata\\Book1.xlsx", "sheet1",i,0);
			System.out.println(value);
			String value1=flib.getdata("D:\\testdata\\Book1.xlsx", "sheet1",i,1);
			System.out.println(value1);
			
		}
}
}