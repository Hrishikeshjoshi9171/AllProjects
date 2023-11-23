package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_CreateProject extends BaseClass {
	
	@Test(priority=1)
	public void createprojectbutton() throws InterruptedException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='Create Project ']")).click();
		WebElement projectname=driver.findElement(By.name("project_name"));
		WebElement projectdescription=driver.findElement(By.name("description"));
		WebElement startat=driver.findElement(By.xpath("(//button)[10]"));
		WebElement create=driver.findElement(By.xpath("//button[text()='Create']"));
		
		if(projectname.isDisplayed() && projectdescription.isDisplayed() && startat.isDisplayed() && create.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It contains the required fields");
		}
		else {
			Assert.assertTrue(false);
			logger.info("It doesn't contain the required sections");
		}
	}
	
	@Test(priority=2)
	public void createproject() throws InterruptedException{
		driver.findElement(By.name("project_name")).sendKeys("Testing1");
		driver.findElement(By.name("description")).sendKeys("This project is for checking");
		driver.findElement(By.xpath("(//button)[10]")).click();
		driver.findElement(By.xpath("//button[text()='24']")).click();
		driver.findElement(By.xpath("(//button)[10]")).click();
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}
}
