package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertyFile {

	String projPath =System.getProperty("user.dir");
	Properties prop =new Properties();

	public String url() throws IOException 
	{
			InputStream input = new FileInputStream(projPath +"\\src\\main\\java\\config\\config.properties");
			prop.load(input);
			String url=prop.getProperty("url");
			return url;		
	}
}
