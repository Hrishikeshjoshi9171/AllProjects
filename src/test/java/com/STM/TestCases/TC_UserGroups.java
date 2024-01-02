package com.STM.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_UserGroups extends BaseClass{
	
	@Test(priority=1)
	public void UserGroupPage() throws InterruptedException, IOException{
		
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
			capturescreen(driver, "UserGroupPage");
			Assert.assertTrue(false);
			logger.info("All sections are not displayed in User Groups");
		}
	}
	
	@Test(priority=2)
	public void creategroup() throws InterruptedException, IOException{
		
		driver.findElement(By.id("createGroupButton")).click();
		Thread.sleep(3000);
		
		WebElement groupname=driver.findElement(By.id("groupName"));
		WebElement selectuser=driver.findElement(By.name("selectUser"));
		WebElement grouprole=driver.findElement(By.name("groupRole"));
		WebElement addmember=driver.findElement(By.name("addMember"));
		WebElement delmember=driver.findElement(By.name("deleteGroupMember"));
		WebElement changerole=driver.findElement(By.name("editRole"));
		WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
		
		if(groupname.isDisplayed() && selectuser.isDisplayed() && grouprole.isDisplayed() && addmember.isDisplayed() && delmember.isDisplayed()
			&& changerole.isDisplayed() && savebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Create Group button contains all the required sections");
		}
		else {
			capturescreen(driver, "creategroup");
			Assert.assertTrue(false);
			logger.info("Create Group button doesn't contain all the required sections");
		}
	}
	
	@Test(priority=3)
	public void newgroupcreate() throws InterruptedException, IOException{
		
		driver.findElement(By.id("groupName")).sendKeys("Test1");
		driver.findElement(By.name("selectUser")).click();
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(2000);
		Select role=new Select(driver.findElement(By.xpath("(//select)[2]")));
		role.selectByVisibleText("Owner");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Member']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("deleteGroupMember")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("selectUser")).click();
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("editRole")).click();
		Thread.sleep(2000);
		Select role1=new Select(driver.findElement(By.name("editGroupRoleSelect")));
		role1.selectByVisibleText("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		
		WebElement usergroupcreate=driver.findElement(By.xpath("//div[text()='Group created successfully']"));
		if(usergroupcreate.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("User Group is create successfully");
		}
		else {
			capturescreen(driver, "newgroupcreate");
			Assert.assertTrue(false);
			logger.info("User Group is not created");
		}
	}
	
	@Test(priority=4)
	public void Activesection() throws InterruptedException, IOException{
		
		WebElement groupdisplay=driver.findElement(By.xpath("//span[text()='Test1']"));
		WebElement groupname=driver.findElement(By.xpath("//td[text()='Group Name']"));
		WebElement members=driver.findElement(By.xpath("//td[text()='Members']"));
		WebElement creategroupbtn=driver.findElement(By.id("createGroupButton"));
		WebElement editgroupbtn=driver.findElement(By.id("editGroupButton"));
		WebElement actionsbtn=driver.findElement(By.id("moreGroupButton"));
		
		if(groupdisplay.isDisplayed() && groupname.isDisplayed() && members.isDisplayed() && creategroupbtn.isDisplayed()
			&& editgroupbtn.isDisplayed() && actionsbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Active section in User Groups displays all the required sections");
		}
		else {
			capturescreen(driver, "Activesection");
			Assert.assertTrue(false);
			logger.info("Active section in User Groups doesn't display all the required sections");
		}
	}
	
	@Test(priority=5)
	public void editbutton() throws InterruptedException, IOException{
		
		driver.findElement(By.id("editGroupButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("groupName")).sendKeys("Test12");
		driver.findElement(By.id("selectUserButton")).click();
		driver.findElement(By.xpath("//div[text()='Hrishikesh']")).click();
		Thread.sleep(2000);
		Select role2=new Select(driver.findElement(By.id("selectGroupRole")));
		role2.selectByVisibleText("Owner");
		Thread.sleep(2000);
		driver.findElement(By.id("addMemberButton")).click();
		driver.findElement(By.xpath("(//button[@id='deleteButtonn'])[3]")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.id("changeRoleButton")).click();
		Select role3=new Select(driver.findElement(By.xpath("(//button)[10]")));
		role3.selectByVisibleText("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		
		WebElement editgroup=driver.findElement(By.xpath("//div[text()='Group data updated successfully']"));
		if(editgroup.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the sections in the user group can be edited");
		}
		else {
			capturescreen(driver, "editbutton");
			Assert.assertTrue(false);
			logger.info("All the sections in the user group are not getting edited");
		}
	}
	
	@Test(priority=6)
	public void Actionsbtn() throws InterruptedException, IOException{
		
		driver.findElement(By.id("moreGroupButton")).click();
		Thread.sleep(3000);
		WebElement blockbtn=driver.findElement(By.id("blockButtonn"));
		WebElement deletebtn=driver.findElement(By.id("deleteButtonn"));
		if(blockbtn.isDisplayed() && deletebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Block and Delete Group buttons are present in the Actions Button");
		}
		else {
			capturescreen(driver, "Actionsbtn");
			Assert.assertTrue(false);
			logger.info("Block and Delete Group buttons are not present in the Actions Button");
		}
	}
	
	@Test(priority=7)
	public void blockgroupbtn() throws InterruptedException, IOException{
		
		driver.findElement(By.id("blockButtonn")).click();
		WebElement groupblock=driver.findElement(By.xpath("//div[text()='Group blocked successfully']"));
		if(groupblock.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Group is blocked successfully");
		}
		else {
			capturescreen(driver, "blockgroupbtn");
			Assert.assertTrue(false);
			logger.info("User Group is not blocked");
		}
	}
	
	@Test(priority=8)
	public void Blockedsection() throws InterruptedException, IOException{
		
		driver.findElement(By.id("blockedTabb")).click();
		Thread.sleep(3000);
		WebElement groupname=driver.findElement(By.xpath("//td[text()='Group Name']"));
		WebElement members=driver.findElement(By.xpath("//td[text()='Members']"));
		WebElement unblockbtn=driver.findElement(By.xpath("//button[text()='Unblock']"));
		WebElement blockedgroup=driver.findElement(By.xpath("//span[text()='Production-Zone-1']"));
		
		if(groupname.isDisplayed() && members.isDisplayed() && unblockbtn.isDisplayed() && blockedgroup.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Blocked sections contains all the required fields");
		}
		else {
			capturescreen(driver, "Blockedsection");
			Assert.assertTrue(false);
			logger.info("Blocked sections doesn't contain all the required fields");
		}
		
		driver.findElement(By.id("1unBlockGroup")).click();
		Thread.sleep(3000);
		WebElement unblockmsg=driver.findElement(By.xpath("//div[text()='Group Unblocked successfully']"));
		if(unblockmsg.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Group unblocked successfully");
		}
		else {
			capturescreen(driver, "unblock");
			Assert.assertTrue(false);
			logger.info("Group is not unblocked");
		}
	}
	
	@Test(priority=9)
	public void deletegroupbtn() throws InterruptedException, IOException {
		
		driver.findElement(By.id("activeTabb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("moreGroupButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButtonn")).click();
		Thread.sleep(3000);
		WebElement deletegroup=driver.findElement(By.xpath("//div[text()='Group deleted successfully']"));
		if(deletegroup.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Group is deleted successfully");
		}
		else {
			capturescreen(driver, "deletegroupbtn");
			Assert.assertTrue(false);
			logger.info("Group is not deleted");
		}
	}
	
	@Test(priority=10)
	public void Deletedgroup() throws InterruptedException, IOException {
		
		driver.findElement(By.id("deletedTabb")).click();
		Thread.sleep(3000);
		WebElement groupname=driver.findElement(By.xpath("//td[text()='Group Name']"));
		WebElement members=driver.findElement(By.xpath("//td[text()='Members']"));
		WebElement restorebtn=driver.findElement(By.id("1restoreGroup"));
		WebElement deletedgroup=driver.findElement(By.xpath("//span[text()='Production-Zone-1']"));
		if(groupname.isDisplayed() && members.isDisplayed() && restorebtn.isDisplayed() && deletedgroup.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Deleted sections contains all the required fields");
		}
		else {
			capturescreen(driver, "Deletedgroup");
			Assert.assertTrue(false);
			logger.info("Deleted section doesn't contain all the required fields");
		}
		
		driver.findElement(By.id("1restoreGroup")).click();
		Thread.sleep(3000);
		WebElement restoremsg=driver.findElement(By.xpath("//div[text()='Group Restored successfully']"));
		if(restoremsg.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Group restored successfully");
		}
		else {
			capturescreen(driver, "restore");
			Assert.assertTrue(false);
			logger.info("Group is not restored");
		}
		
		driver.findElement(By.id("logout")).click();
	}
}
