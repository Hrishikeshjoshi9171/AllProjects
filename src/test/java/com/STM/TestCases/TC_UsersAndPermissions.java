package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_UsersAndPermissions extends BaseClass {
	
	@Test(priority=1)
	public void UsersandPermissions() throws InterruptedException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userManagement")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("activeTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("blockedTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deletedTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pendingApprovalTab")).click();
		Thread.sleep(2000);
		
		WebElement active=driver.findElement(By.id("activeTab"));
		WebElement blocked=driver.findElement(By.id("blockedTab"));
		WebElement deleted=driver.findElement(By.id("deletedTab"));
		WebElement pendingapproval=driver.findElement(By.id("pendingApprovalTab"));
		Thread.sleep(2500);
		
		if(active.isDisplayed() && blocked.isDisplayed() && deleted.isDisplayed() && pendingapproval.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It contains all the required sections in Users & Permissions");
		}
		
		else
		{
			Assert.assertTrue(false);
			logger.info("It doesn't contain all the required sections in Users & Permissions");
		}
 }
	
	@Test(priority=2)
	public void pendingapproval() throws InterruptedException {
		
		WebElement name = driver.findElement(By.xpath("//span[text()='Rohit Sharma ']"));
		WebElement email = driver.findElement(By.xpath("//td[text()='rohit@ceinsys.com']"));
		WebElement approve = driver.findElement(By.id("approveButton"));
		WebElement reject = driver.findElement(By.id("rejectButton"));
		
		if(name.isDisplayed() && email.isDisplayed() && approve.isDisplayed() && reject.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It contains all the required components in Pending Approval Page");
		}
		else {
			Assert.assertTrue(false);
			logger.info("It doesn't contain all the required components in Pending Approval Page");
		}
	}
	
	@Test(priority=3)
	public void RejectButton() throws InterruptedException{
		
		driver.findElement(By.xpath("(//button[@id='rejectButton'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement message=driver.findElement(By.xpath("//div[text()='Rahul rejected successfully']"));
		
		if(message.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The user details are erased, Reject button is working properly");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The user details are not erased, Reject button is not working");
		}
	}
	
	@Test(priority=4)
	public void AcceptButton() throws InterruptedException{
		
		driver.findElement(By.id("approveButton")).click();
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.xpath("//div[text()='Rohit approved successfully']"));
		
		if(name.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The user is approved");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The user is not approved");
		}
	}
	
	@Test(priority=5)
	public void Activesection() throws InterruptedException{
		driver.findElement(By.id("activeTab")).click();
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.xpath("//span[text()='Hrishikesh Joshi']"));
		WebElement mailid=driver.findElement(By.xpath("//span[text()='hrishikesh@ceinsys.com']"));
		WebElement editbtn=driver.findElement(By.id("editButton"));
		WebElement moreactionsbtn=driver.findElement(By.id("moreActions"));
		
		if(user.isDisplayed() && mailid.isDisplayed() && editbtn.isDisplayed() && moreactionsbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The Active section contains all the required fields");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The Active section doesn't contain all the required fields");
		}		
	}
	
	@Test(priority=6)
	public void EditButton() throws InterruptedException{
		
		driver.findElement(By.id("editButton")).click();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.name("email"));
		WebElement superrole=driver.findElement(By.xpath("//label[text()='SUPER']"));
		WebElement adminrole=driver.findElement(By.xpath("//label[text()='ADMIN']"));
		WebElement userrole=driver.findElement(By.xpath("//label[text()='USER']"));
		WebElement moderatorrole=driver.findElement(By.xpath("//label[text()='MODERATOR']"));
		WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
		WebElement cancelbtn=driver.findElement(By.xpath("//button[text()='Cancel']"));
		if(firstname.isDisplayed() && lastname.isDisplayed() && email.isDisplayed() && superrole.isDisplayed()
		&& adminrole.isDisplayed() && userrole.isDisplayed() && moderatorrole.isDisplayed() && savebtn.isDisplayed() && cancelbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The Edit button contains all the required components");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The Edit Button doesn't contain all the required components");
		}
		superrole.click();
		savebtn.click();
	}
	
	@Test(priority=7)
	public void MoreActionsbtn() throws InterruptedException {
		
		driver.findElement(By.id("moreActions")).click();
		Thread.sleep(3000);
		WebElement blockbtn=driver.findElement(By.id("blockButton"));
		WebElement deleteuserbtn=driver.findElement(By.id("deleteButton"));
		
		if(blockbtn.isDisplayed() && deleteuserbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The More Actions button contains all the required components");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The More Actions Button doesn't contain all the required components");
		}
	}
	
	@Test(priority=8)
	public void blockbtn() throws InterruptedException{
		
		driver.findElement(By.id("blockButton")).click();
		Thread.sleep(2000);
		WebElement userblock=driver.findElement(By.xpath("//div[text()='Hrishikesh blocked successfully']"));
		if(userblock.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("User is blocked");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The User is not Blocked");
		}
	}
	
	@Test(priority=9)
	public void BlockedSection() throws InterruptedException{
		
		driver.findElement(By.id("blockedTab"));
		Thread.sleep(3000);
		WebElement unblockbtn=driver.findElement(By.id("unblockButton"));
		WebElement name=driver.findElement(By.xpath("//td[text()='Name']"));
		WebElement createdon=driver.findElement(By.xpath("//td[text()='Created On']"));
		if(unblockbtn.isDisplayed() && name.isDisplayed() && createdon.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Blocked section contains all the required sections");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Blocked section doesn't contain all the required sections");
		}
		
		unblockbtn.click();
		Thread.sleep(2000);
		WebElement unblockuser=driver.findElement(By.xpath("//div[text()='Hrishikesh unblocked successfully']"));
		
		if(unblockuser.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The user is unblocked and the unblock button is working correctly");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The user is not unblocked and the unblock button is not working correctly");
		}
	}
	
	@Test(priority=10)
	public void deleteuserbtn() throws InterruptedException{
		driver.findElement(By.id("activeTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("moreActions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		
		WebElement deleteuser=driver.findElement(By.xpath("//div[text()='Hrishikesh deleted successfully']"));
		if(deleteuser.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The user is deleted");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The user is not deleted");
		}
	}
	
	@Test(priority=11)
	public void DeletedSection() throws InterruptedException{
		
		driver.findElement(By.id("deletedTab")).click();
		Thread.sleep(3000);
		
		WebElement restorebtn=driver.findElement(By.id("restoreButton"));
		WebElement name=driver.findElement(By.xpath("//td[text()='Name']"));
		WebElement createdon=driver.findElement(By.xpath("//td[text()='Created On']"));
		if(restorebtn.isDisplayed() && name.isDisplayed() && createdon.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Deleted section contains all the required sections");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Deleted section doesn't contain all the required sections");
		}
		
		restorebtn.click();
		Thread.sleep(2000);
		WebElement restoreuser=driver.findElement(By.xpath("//div[text()='Hrishikesh restored successfully']"));
		
		if(restoreuser.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The user is restored and the restore button is working correctly");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The user is not restored and the restore button is not working correctly");
		}
		
		driver.findElement(By.id("logout")).click();
	}
}