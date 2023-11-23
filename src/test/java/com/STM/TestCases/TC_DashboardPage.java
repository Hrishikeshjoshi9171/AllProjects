package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DashboardPage extends BaseClass{
	
	@Test(priority=1)
	public void Dashboard() throws InterruptedException { //Verify whether all the fields/components/sections are present on the dashboard
		
//		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
//		driver.findElement(By.name("password")).sendKeys("Admin@123");
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(3000);
		
		WebElement myprojects=driver.findElement(By.id("myProjects"));
		WebElement userpermissions=driver.findElement(By.id("userManagement"));
		userpermissions.click();
		Thread.sleep(2000);
		WebElement usergroups=driver.findElement(By.id("userGroup"));
		usergroups.click();
		Thread.sleep(2000);
		WebElement publiclayers=driver.findElement(By.id("publicLayers"));
		publiclayers.click();
		Thread.sleep(2000);
		myprojects.click();
		Thread.sleep(2000);
		WebElement projectname=driver.findElement(By.xpath("//p[text()='Louisa County ']"));
		WebElement allprojects=driver.findElement(By.xpath("//a[text()='All Projects']"));
		WebElement deletedprojects=driver.findElement(By.xpath("//a[text()='Deleted Projects']"));
		deletedprojects.click();
		Thread.sleep(2000);
		myprojects.click();
		Thread.sleep(2000);
//		WebElement mapview=driver.findElement(By.id("radix-:r58:-trigger-Map")); mapview.isDisplayed() &&
//		WebElement listview=driver.findElement(By.id("radix-:r58:-trigger-List"));  listview.isDisplayed() &&
		WebElement createproject=driver.findElement(By.xpath("//p[text()='Create Project ']"));
		WebElement darkmode=driver.findElement(By.id("themeToggler"));
		WebElement logout=driver.findElement(By.id("logout"));
		
		if(myprojects.isDisplayed() && userpermissions.isDisplayed() && usergroups.isDisplayed() && publiclayers.isDisplayed() && projectname.isDisplayed() 
				&& allprojects.isDisplayed() && deletedprojects.isDisplayed() && createproject.isDisplayed()
				&& darkmode.isDisplayed() && logout.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the sections are present on the Dashboard");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All sections are not present on the Dashboard");
		}
	}
	
	@Test(priority=2)
	public void Darkmode() throws InterruptedException {
		
		driver.findElement(By.id("themeToggler")).click();
		Thread.sleep(3000);
		WebElement colour=driver.findElement(By.xpath("//p[text()='Hrishikesh Testing ']"));
		String rgba=colour.getCssValue("color");
//		String hex=Color.fromString(rgba).asHex();
//		System.out.println("Colour is: " + rgba); rgba(59, 130, 246, 1)
//		System.out.println("Hex code for the colour is: "+ hex); #3b82f6
		String expectedcolor="rgba(59, 130, 246, 1)";
		
		if(rgba.equals(expectedcolor))
		{
			Assert.assertTrue(true); //Assert.assertEquals(rgba, expectedcolor)
			logger.info("The Appearance is changed to Dark mode");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("The Appearance is not changed to Dark mode");
		}
	}
	
	@Test(priority=3)
	public void Logout() throws InterruptedException {
		
		driver.findElement(By.id("logout")).click();
		WebElement logout=driver.findElement(By.xpath("//p[text()='Log in to your account.']"));
		if(logout.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It logs out from the current page and redirects to the login page");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("It does not logout from the current page");
		}
	}
}
