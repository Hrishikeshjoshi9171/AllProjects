package com.STM.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties props;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=props.getProperty("baseURL");
		return url;
	}
	
	public String getEmail()
	{
	String email=props.getProperty("correctemail");
	return email;
	}
	
	public String getEmail1()
	{
		String email1=props.getProperty("wrongemail");
		return email1;
	}
	
	public String getEmail2()
	{
		String email2=props.getProperty("otheremail");
		return email2;
	}
	
	public String getPassword()
	{
	String password=props.getProperty("correctpassword");
	return password;
	}
	
	public String getPassword1()
	{
	String password1=props.getProperty("wrongpassword");
	return password1;
	}
	
	public String getChromePath()
	{
	String chromepath=props.getProperty("chromepath");
	return chromepath;
	}
	
	public String getMSEdgePath()
	{
	String msedgepath=props.getProperty("msedgepath");
	return msedgepath;
	}
	
}
