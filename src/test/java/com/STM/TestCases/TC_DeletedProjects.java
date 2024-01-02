package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DeletedProjects extends BaseClass{
	
	@Test
	public void deletedprojects() throws InterruptedException{
		
//		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
//		driver.findElement(By.name("password")).sendKeys("Admin@123");
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.id("deletedProjectsTab")).click();
		driver.findElement(By.xpath("(//button[text()='Restore'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement restoremessage=driver.findElement(By.xpath("//div[text()='Project Hrishikesh Testing Restored']"));
		
		if(restoremessage.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The project is restored");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The project is not restored");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("allProjectsTab")).click();
		
		WebElement projdisplay=driver.findElement(By.xpath("//p[text()='Hrishikesh Testing']"));
		
		if(projdisplay.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The restored project is displayed in the My Projects Section");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The restored project is not displayed in the My Projects Section");
		}
	}
}
