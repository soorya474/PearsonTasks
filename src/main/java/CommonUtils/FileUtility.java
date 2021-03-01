package CommonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * @author Soorya
 * to get the data from property file
 */

public class FileUtility {
	
	public String getKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IConstant.FilePath);
		Properties Pobj=new Properties();
		Pobj.load(fis);
		String value=Pobj.getProperty(key);
		return value;
		
	}

}

