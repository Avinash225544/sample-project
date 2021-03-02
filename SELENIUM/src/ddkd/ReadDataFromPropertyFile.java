package ddkd;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable 
	{
	FileInputStream	fis=new FileInputStream("./data/config.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String val=prop.getProperty("browser", "incorrect key");
	System.out.println(val);
	}

}
