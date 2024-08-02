package Com.Crm.JavaUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Com.Crm.BaseClass.Vtiger_Baseclass;

public class JavaUtilityVT
{
	public static String logindata(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\configerfile\\LoginFuntion.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}


}
