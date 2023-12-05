package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_UserGroups extends BaseClass{
	
	@Test(priority=1)
	public void UserGroupPage() throws InterruptedException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("userGroup")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("blockedTabb")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("deletedTabb")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("activeTabb")).click();
		Thread.sleep(1500);
		
		WebElement activetab=driver.findElement(By.id("activeTabb"));
		WebElement blockedtab=driver.findElement(By.id("activeTabb"));
		WebElement deletedtab=driver.findElement(By.id("activeTabb"));
		
		if(activetab.isDisplayed() && blockedtab.isDisplayed() && deletedtab.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the sections are displayed in User Groups");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All sections are not displayed in User Groups");
		}
	}
	
	@Test(priority=2)
	public void creategroup() throws InterruptedException{
		
		driver.findElement(By.id("createGroupButton")).click();
		Thread.sleep(3000);
		
	}
}
