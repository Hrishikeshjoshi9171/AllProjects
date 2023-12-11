package com.STM.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
			Assert.assertTrue(false);
			logger.info("Create Group button doesn't contain all the required sections");
		}
	}
	
	@Test(priority=3)
	public void newgroupcreate() throws InterruptedException, IOException{
		
		driver.findElement(By.id("groupName")).sendKeys("Test2");
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
	public void editbutton() throws InterruptedException{
		
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
		driver.findElement(By.xpath("(//button[@id='deleteButtonn'])[1]")).click();
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
			Assert.assertTrue(false);
			logger.info("All the sections in the user group are not getting edited");
		}
	}
}
