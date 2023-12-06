package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_ListView extends BaseClass{
	
	@Test(priority=1)
	public void Editbutton() throws InterruptedException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("listView")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("editProjectBtn")).click();
		Thread.sleep(3000);
		
		WebElement projectname=driver.findElement(By.name("project_name"));
		WebElement projectdescription=driver.findElement(By.name("description"));
		WebElement startat=driver.findElement(By.xpath("//button[text()='December 6th, 2023']"));
		WebElement edit=driver.findElement(By.xpath("//button[text()='Edit']"));
		Thread.sleep(2000);
		
		if(projectname.isDisplayed() && projectdescription.isDisplayed() && startat.isDisplayed() && edit.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Edit section contains the required fields");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Edit section doesn't contain the required sections");
		}
		edit.click();
	}
	
	@Test(priority=2)
	public void deletebutton() throws InterruptedException{
		
		driver.findElement(By.id("deleteProjectBtn")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(1500);
		
		WebElement projdelete=driver.findElement(By.xpath("//div[text()='Project Test1 deleted successfully']"));
		if(projdelete.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Delete Button is working properly and the project gets deleted");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Delete Button is not working properly, the project is not deleted");
		}
	}
	
	public void addmemberbtn() throws InterruptedException{
		
		driver.findElement(By.id("addMemberProjectBtn")).click();
		Thread.sleep(3000);
		
		WebElement memberspage=driver.findElement(By.xpath("//span[text()='Members']"));
		WebElement addmembersbtn=driver.findElement(By.xpath("//button[text()='Add Members']"));
		WebElement account=driver.findElement(By.xpath("//td[text()='Account']"));
		WebElement projectrole=driver.findElement(By.xpath("//td[text()='Project Role']"));
		WebElement moreactions=driver.findElement(By.xpath("(//button)[8]"));
		WebElement sortby=driver.findElement(By.xpath("(//button)[6]"));
		
		if(memberspage.isDisplayed() && addmembersbtn.isDisplayed() && account.isDisplayed() && projectrole.isDisplayed()
			&& moreactions.isDisplayed() && sortby.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It redirects to Members page and all required sections in members page are displayed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("It does not redirect to Members page");
		}
		driver.findElement(By.id("logout")).click();
	}
}
