package ddkd;

import java.io.FileInputStream;
import java.util.Properties;

public class Filelib {

	public String readPropData(String propPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String Propvalue=prop.getProperty(key,"Incorrecg key");
		return Propvalue;
	}
	
	}
