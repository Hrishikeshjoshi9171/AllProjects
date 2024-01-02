package com.STM.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_ManageSection extends BaseClass{
	
	@Test(priority=1)
	public void Memberssection() throws InterruptedException, IOException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//p[text()='Test1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Manage']")).click();
		Thread.sleep(3000);
		WebElement account=driver.findElement(By.xpath("//td[text()='Account']"));
		WebElement projectrole=driver.findElement(By.xpath("//td[text()='Project Role']"));
		WebElement addmemberbtn=driver.findElement(By.xpath("//button[text()='Add Members']"));
		WebElement searchbyname=driver.findElement(By.xpath("//input"));
		WebElement sortby=driver.findElement(By.xpath("(//button)[6]"));
		
		if(account.isDisplayed() && projectrole.isDisplayed() && addmemberbtn.isDisplayed() && searchbyname.isDisplayed() && sortby.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Members section contains all the required fields");
		}
		else {
			capturescreen(driver, "Memberssection");
			Assert.assertTrue(false);
			logger.info("Members section doesn't contain all the required fields");
		}
	}
	
	@Test(priority=2)
	public void addmemberbtn() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//button[text()='Add Members']")).click();
		Thread.sleep(3000);
		
		WebElement user=driver.findElement(By.xpath("//button[text()='Select User']"));
		WebElement projectrole=driver.findElement(By.xpath("//span[text()='Select Project Role']"));
		WebElement addmemberbtn=driver.findElement(By.xpath("//button[text()='Add Member']"));
		WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
		
		if(user.isDisplayed() && projectrole.isDisplayed() && addmemberbtn.isDisplayed() && savebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Add Members button contains all the required fields");
		}
		else {
			capturescreen(driver, "addmemberbtn");
			Assert.assertTrue(false);
			logger.info("Add Members button doesn't contain all the required fields");
		}
	}
	@Test(priority=3)
	public void addnewmember() throws InterruptedException, IOException {
		
		Select user=new Select(driver.findElement(By.xpath("(//button)[9]")));
		user.selectByVisibleText("Pranav");
		Thread.sleep(2000);
		Select projectrole=new Select(driver.findElement(By.xpath("(//button)[10]")));
		projectrole.selectByVisibleText("Owner");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		WebElement newmember=driver.findElement(By.xpath("//div[text()='Members Added successfully']"));
		if(newmember.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("New Member added successfully");
		}
		else {
			capturescreen(driver, "addmembersbtn");
			Assert.assertTrue(false);
			logger.info("New Member is not added");
		}
	}
	
	@Test(priority=4)
	public void moreactions() throws InterruptedException, IOException{
		
		driver.findElement(By.xpath("(//button)[9]")).click();
		Thread.sleep(3000);
		WebElement assignlayer=driver.findElement(By.xpath("//div[text()='Assign layer...']"));
		WebElement changerole=driver.findElement(By.xpath("//div[text()='Change Role']"));
		WebElement deletemember=driver.findElement(By.xpath("//div[text()='Delete']"));
		
		if(assignlayer.isDisplayed() && changerole.isDisplayed() && deletemember.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("More Actions button contains all the required fields");
		}
		else {
			capturescreen(driver, "moreactions");
			Assert.assertTrue(false);
			logger.info("More Actions button doesn't contain all the required fields");
		}
	}
	
	@Test(priority=5)
	public void assignlayersection() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//div[text()='Assign layer...']")).click();
		Thread.sleep(3000);
		WebElement selectlayer=driver.findElement(By.xpath("//button[text()='Select Layer']"));
		WebElement addlayerbtn=driver.findElement(By.xpath("//button[text()='Add Layer']"));
		WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
		if(selectlayer.isDisplayed() && addlayerbtn.isDisplayed() && savebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Assign Layer contains all the required sections");
		}
		else {
			capturescreen(driver, "assignlayersection");
			Assert.assertTrue(false);
			logger.info("Assign Layer doesn't contain all the required fields");
		}
	}
	
	@Test(priority=6)
	public void addlayerbtnwithoutselectinglayer() throws InterruptedException, IOException{
		driver.findElement(By.xpath("//button[text()='Add Layer']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		WebElement errormsg=driver.findElement(By.xpath("//div[text()='Unable to add Layer try again']"));
		WebElement errormsg1=driver.findElement(By.xpath("//div[text()='Unable to assign layer, try again']"));
		
		if(errormsg.isDisplayed() && errormsg1.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("When empty layer is assigned, it gives an error message");
		}
		else {
			capturescreen(driver, "addlayerbtnwithoutselectinglayer");
			Assert.assertTrue(false);
			logger.info("Empty layer is assigned");
		}
	}
	
	@Test(priority=7)
	public void assignlayer() throws InterruptedException, IOException {
		
		Select assignlayer=new Select(driver.findElement(By.xpath("(//button)[10]")));
		assignlayer.selectByVisibleText("TestLayer2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[10]")).click();
		driver.findElement(By.xpath("//button[text()='Add Layer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[12]")).click();
		Thread.sleep(2000);
		assignlayer.selectByVisibleText("Bridge");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[10]")).click();
		driver.findElement(By.xpath("//button[text()='Add Layer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement layerassign=driver.findElement(By.xpath("div[text()='Layer/s assigned successfully']"));
		if(layerassign.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Layer is assigned successfully");
		}
		else {
			capturescreen(driver, "assignlayer");
			Assert.assertTrue(false);
			logger.info("Layer is not assigned");
		}
	}
	
	@Test(priority=8)
	public void changerolebtn() throws InterruptedException, IOException{
		
		driver.findElement(By.xpath("(//button)[9]")).click();
		driver.findElement(By.xpath("//div[text()='Change Role']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[9]")).click();
		driver.findElement(By.xpath("//div[text()='Change Role']")).click();
		Thread.sleep(2000);
		Select role=new Select(driver.findElement(By.xpath("(//select)[2]")));
		role.selectByVisibleText("Admin");
		Thread.sleep(2000);
		WebElement rolechangemsg=driver.findElement(By.xpath("//div[text()='Role Changed successfully']"));
		if(rolechangemsg.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Role is changed successfully");
		}
		else {
			capturescreen(driver, "changerolebtn");
			Assert.assertTrue(false);
			logger.info("Role is not changed");
		}
	}
	
	@Test(priority=9)
	public void deletememberbtn() throws InterruptedException, IOException{
		
		driver.findElement(By.xpath("(//button)[9]")).click();
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(2000);
		WebElement memberdelete=driver.findElement(By.xpath("//div[text()='Member Deleted successfully']"));
		if(memberdelete.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The member is deleted successfully");
		}
		else {
			capturescreen(driver, "deletememberbtn");
			Assert.assertTrue(false);
			logger.info("The member is not deleted");
		}
	}
	
	@Test(priority=10)
	public void settingssection() throws InterruptedException, IOException{
		
		driver.findElement(By.xpath("//span[text()='Settings']")).click();
		Thread.sleep(3000);
		WebElement setting=driver.findElement(By.xpath("//td[text()='Setting']"));
		WebElement description=driver.findElement(By.xpath("//td[text()='Description']"));
		WebElement value=driver.findElement(By.xpath("//td[text()='Value']"));
		WebElement editbtn=driver.findElement(By.xpath("//button[text()='Edit']"));
		WebElement autosave=driver.findElement(By.xpath("//td[text()='AutoSaveGeometriesInLayer']"));
		WebElement snappoint=driver.findElement(By.xpath("//td[text()='SnapPointToGeometriesRange']"));
		WebElement linewidth=driver.findElement(By.xpath("//td[text()='GeometryLineWidth']"));
		
		if(setting.isDisplayed() && description.isDisplayed() && value.isDisplayed() && editbtn.isDisplayed()
		   && autosave.isDisplayed() && snappoint.isDisplayed() && linewidth.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Settings Section contains all the required fields");
		}
		else {
			capturescreen(driver, "settingssection");
			Assert.assertTrue(false);
			logger.info("Settings Section doesn't contain all the required fields");
		}
	}
}
