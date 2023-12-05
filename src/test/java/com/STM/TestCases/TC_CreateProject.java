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
		
		driver.findElement(By.id("createProjects")).click();
		Thread.sleep(2000);
		WebElement projectname=driver.findElement(By.name("project_name"));
		WebElement projectdescription=driver.findElement(By.name("description"));
		WebElement startat=driver.findElement(By.xpath("//button[text()='December 11th, 2023']"));
		WebElement create=driver.findElement(By.xpath("//button[text()='Create']"));
		Thread.sleep(2000);
		
		if(projectname.isDisplayed() && projectdescription.isDisplayed() && startat.isDisplayed() && create.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Create project button contains the required fields");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Create project button doesn't contain the required sections");
		}
	}
	
	@Test(priority=2)
	public void createproject() throws InterruptedException{
		
		driver.findElement(By.name("project_name")).sendKeys("Hrishikesh Testing");
		driver.findElement(By.name("description")).sendKeys("This project is for checking");
		driver.findElement(By.xpath("//button[text()='December 11th, 2023']")).click();
		driver.findElement(By.xpath("//button[text()='11']")).click();
		driver.findElement(By.xpath("//button[text()='December 11th, 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		Thread.sleep(3000);
		
		WebElement project=driver.findElement(By.xpath("//p[text()='Hrishikesh Testing']"));
		Thread.sleep(3000);
		
		if(project.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The project is displayed on the Dashboard");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The project is not displayed on the Dashboard");
		}
	}
	
	@Test(priority=3)
	public void deletebutton() throws InterruptedException{
		driver.findElement(By.xpath("(//button[@id='deleteProject'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		
		WebElement deletemessage=driver.findElement(By.xpath("//div[text()='Project Hrishikesh Testing deleted successfully']"));
		
		if(deletemessage.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The project is deleted");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The project is not deleted");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("deletedProjectsTab")).click();
		WebElement deletedproject=driver.findElement(By.xpath("//span[text()='Hrishikesh Testing']"));
		if(deletedproject.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The project is displayed in deleted section");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The project is not displayed in deleted section");
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void projectview() throws InterruptedException{
		
		driver.findElement(By.id("allProjectsTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createProjects")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("project_name")).sendKeys("sjdbodbouabojdasnvbsifboajnbfisbgobsigvbsibgobguib");
		driver.findElement(By.name("description")).sendKeys("This project is for checking. ksdnsbisbjanibsigvbosndvl vbsognaobosdnosndo");
		driver.findElement(By.xpath("//button[text()='December 11th, 2023']")).click();
		driver.findElement(By.xpath("//button[text()='26']")).click();
		driver.findElement(By.xpath("//button[text()='December 11th, 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		WebElement delbtn=driver.findElement(By.xpath("(//button[@id='deleteProject'])[1]"));
		WebElement searchbyname=driver.findElement(By.id("searchByProjectName"));
		if(delbtn.isDisplayed() && searchbyname.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("If the project name, description is long then also the fields like 'delete button' and 'search by name' are visible");
		}
		else {
			Assert.assertTrue(false);
			logger.info("If the project name, description is long then the required fields not are visible");
		}
	}
}
