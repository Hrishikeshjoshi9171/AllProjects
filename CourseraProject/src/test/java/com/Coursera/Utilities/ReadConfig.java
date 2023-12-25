package com.Coursera.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getWebsiteURL()
	{
		String url=	prop.getProperty("baseURL");
		return url;
	}
	
	public String getUserEmail()
	{
		String useremail= prop.getProperty("useremail");
		return useremail;
	}
	
	public String getUserPassword()
	{
		String userpassword=prop.getProperty("userpassword");
		return userpassword;
	}
	
	public String getChromePath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getMsedgePath() {
		String msedgepath=prop.getProperty("msedgepath");
		return msedgepath;	
	}
}  

