package com.STM.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_PublicLayers extends BaseClass{
	
	@Test(priority=1)
	public void publiclayersection() throws InterruptedException, IOException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("publicLayers")).click();
		Thread.sleep(1500);
		WebElement layername=driver.findElement(By.xpath("//td[text()='Layer Name']"));
		WebElement type=driver.findElement(By.xpath("//td[text()='Type']"));
		WebElement description=driver.findElement(By.xpath("//td[text()='Description']"));
		WebElement createlayerbtn=driver.findElement(By.id("createLayerButton"));
		WebElement searchbyname=driver.findElement(By.xpath("//input"));
		
		if(layername.isDisplayed() && type.isDisplayed() && description.isDisplayed() && createlayerbtn.isDisplayed() && searchbyname.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the required fields are present in the Public Layers sections");
		}
		else {
			capturescreen(driver, "publiclayersection");
			Assert.assertTrue(false);
			logger.info("All the required fields are not present in the Public Layers sections");
		}
	}
	
	@Test(priority=2)
	public void createlayersection() throws InterruptedException, IOException{
		
		driver.findElement(By.id("createLayerButton")).click();
		Thread.sleep(3000);
		WebElement Layername=driver.findElement(By.name("layer_name"));
		WebElement geometrytype=driver.findElement(By.xpath("(//button)[5]"));
		WebElement colour=driver.findElement(By.xpath("(//button)[6]"));
		WebElement linewidth=driver.findElement(By.name("line_width"));
		WebElement linetype=driver.findElement(By.xpath("//p[text()=' Simple Line']"));
		WebElement layerdescription=driver.findElement(By.name("description"));
		WebElement shapefilebtn=driver.findElement(By.xpath("//button[text()='Import from shape file']"));
		WebElement fieldName=driver.findElement(By.xpath("(//input)[5]"));
		WebElement fieldType=driver.findElement(By.xpath("//span[text()='Text(string)']"));
		WebElement layerunit=driver.findElement(By.xpath("(//button)[9]"));
		WebElement fieldlength=driver.findElement(By.xpath("(//input)[6]"));
		WebElement fieldprecision=driver.findElement(By.xpath("(//input)[7]"));
		WebElement fielddescription=driver.findElement(By.xpath("(//textarea)[2]"));
		WebElement setdomainvalue=driver.findElement(By.xpath("(//input)[8]"));
		WebElement addfieldbtn=driver.findElement(By.xpath("//button[text()='Add Field']"));
		WebElement name=driver.findElement(By.xpath("//td[text()='Name']"));
		WebElement type=driver.findElement(By.xpath("(//td[text()='Type'])[2]"));
		WebElement length=driver.findElement(By.xpath("//td[text()='Length']"));
		WebElement precision=driver.findElement(By.xpath("//td[text()='Precision']"));
		WebElement unit=driver.findElement(By.xpath("//td[text()='Unit']"));
		WebElement description=driver.findElement(By.xpath("(//td[text()='Description'])[2]"));
		WebElement domainvalues=driver.findElement(By.xpath("//td[text()='Domain Values']"));
		WebElement createlayerbtn=driver.findElement(By.xpath("//button[text()='Create']"));
		
		if(Layername.isDisplayed() && geometrytype.isDisplayed() && colour.isDisplayed() && linewidth.isDisplayed() && linetype.isDisplayed()
			&& layerdescription.isDisplayed() && shapefilebtn.isDisplayed() && fieldName.isDisplayed() && fieldType.isDisplayed()
			&& layerunit.isDisplayed() && fieldlength.isDisplayed() && fieldprecision.isDisplayed() && fielddescription.isDisplayed()
			&& setdomainvalue.isDisplayed() && addfieldbtn.isDisplayed() && name.isDisplayed() && type.isDisplayed() && length.isDisplayed()
			&& precision.isDisplayed() && unit.isDisplayed() && description.isDisplayed() && domainvalues.isDisplayed() && createlayerbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the required sections are displayed in Create layer Button");
		}
		else {
			capturescreen(driver, "createlayersection");
			Assert.assertTrue(false);
			logger.info("All the required sections are not displayed in Create layer Button");
		}
	}
	
	@Test(priority=3)
	public void newlayer() throws InterruptedException, IOException{
		driver.findElement(By.name("layer_name")).sendKeys("Layer123");
		Select geometry = new Select(driver.findElement(By.xpath("(//select)[1]")));
		Select linetype = new Select(driver.findElement(By.xpath("(//select)[2]")));
		Select fieldtype = new Select(driver.findElement(By.xpath("(//select)[3]")));
		Select units = new Select(driver.findElement(By.xpath("(//select)[4]")));
		geometry.selectByVisibleText("LineString");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[6]")).click();
		driver.findElement(By.xpath("(//div)[71]")).click();
		driver.findElement(By.xpath("//div[text()='#C0392B']")).click();
		driver.findElement(By.name("line_width")).sendKeys("10");
		linetype.selectByVisibleText("Dashed Line");
		Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys("Layer for Test");
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Check");
		fieldtype.selectByVisibleText("Decimal(double)");
		Thread.sleep(2000);
		units.selectByVisibleText("Meters (m)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea)[2]")).sendKeys("New Field");
		driver.findElement(By.xpath("(//input)[8]")).sendKeys("50,60,70");
		driver.findElement(By.xpath("//button[text()='Add Field']")).click();
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		WebElement newlayer=driver.findElement(By.xpath("//div[text()='Layer Layer123 created successfully']"));
		if(newlayer.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("New Layer is created successfully");
		}
		else {
			capturescreen(driver, "newlayer");
			Assert.assertTrue(false);
			logger.info("New Layer is not created");
		}
	}
	
	@Test(priority=4)
	public void editlayerbtn() throws InterruptedException, IOException{
		
		driver.findElement(By.id("1layerEdit")).click();
		Select geometry = new Select(driver.findElement(By.xpath("(//select)[1]")));
		geometry.selectByVisibleText("Polygon");
		Thread.sleep(2000);
		Select linetype = new Select(driver.findElement(By.xpath("(//select)[2]")));
		linetype.selectByVisibleText("Simple Line");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		
		WebElement editlayer=driver.findElement(By.xpath("//div[text()='Public layer updated successfully']"));
		if(editlayer.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the fields in the edit layer are editable and edit layer button is working correctly");
		}
		else {
			capturescreen(driver, "editlayerbtn");
			Assert.assertTrue(false);
			logger.info("Edit Layer is not working properly");
		}
	}
	
	@Test(priority=5)
	public void deletelayerbtn() throws InterruptedException, IOException{
		driver.findElement(By.id("1deleteLayer")).click();
		WebElement dellayer=driver.findElement(By.xpath("//div[text()='Layer Deleted successfully']"));
		if(dellayer.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Layer is deleted successfully");
		}
		else {
			capturescreen(driver, "deletelayerbtn");
			Assert.assertTrue(false);
			logger.info("Layer is not deleted");
		}
		
		driver.findElement(By.id("logout")).click();
	}
}
