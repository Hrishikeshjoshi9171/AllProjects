package com.Coursera.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Coursera.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException 
	{		
		logger.info("URL is Opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(useremail);
		logger.info("User-email is Entered");
		
		lp.setPassword(userpassword);
		logger.info("Password is Entered");
		
		lp.clicksubmit();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Coursera | Online Courses & Credentials From Top Educators. Join for Free"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
}
