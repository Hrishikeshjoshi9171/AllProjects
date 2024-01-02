package com.STM.SmokeSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.STM.TestCases.BaseClass;

public class SmokeTest extends BaseClass {
	
	@Test(priority=1)
	public void signuptest() throws InterruptedException{
		
		driver.findElement(By.id("signupRedirect")).click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));
		WebElement signupbtn= driver.findElement(By.id("signup"));
		
		if (firstname.isDisplayed() && lastname.isDisplayed() && email.isDisplayed() && password.isDisplayed()
				&& confirmpassword.isDisplayed() && signupbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Signup section has all the required fields");
		} 
		else
		{
			Assert.assertTrue(false);
			logger.info("Signup section doesn't has all the required fields");
		}
		
		firstname.sendKeys("User");
		lastname.sendKeys(" ");
		email.sendKeys("user@ceinsys.com");
		password.sendKeys("User@123");
		confirmpassword.sendKeys("User@123");
		signupbtn.click();
		Thread.sleep(2000);
		
		WebElement signup = driver.findElement(By.xpath("//div[text()='Signup successfully']"));
		
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup is successful");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup unsuccessful");
		}
		
		driver.findElement(By.id("signupRedirect")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Rahul");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("email")).sendKeys("rahul@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Rahul@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Rahul@123");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void logintest() throws InterruptedException{
//		driver.findElement(By.id("redirectLogin")).click();
		
		WebElement email=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement loginbtn=driver.findElement(By.id("login"));
		
		if(email.isDisplayed() && password.isDisplayed() && loginbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Login section contains all the mandatory fields");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login section doesn't contain all the mandatory fields");
		}
		
		email.sendKeys("admin@ceinsys.com");
		password.sendKeys("Admin@123");
		loginbtn.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=3)
	public void UsersPermissionsPage() throws InterruptedException{
//		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
//		driver.findElement(By.name("password")).sendKeys("Admin@123");
//		driver.findElement(By.id("login")).click();
		
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
		
		driver.findElement(By.xpath("(//button[@id='rejectButton'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement userreject=driver.findElement(By.xpath("//div[text()='User rejected successfully']"));
		
		if(userreject.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("User is Rejected");
		}
		else {
			Assert.assertTrue(false);
			logger.info("User is not Rejected");
		}
		
		driver.findElement(By.id("approveButton")).click();
		Thread.sleep(2000);
		
		WebElement userapprove=driver.findElement(By.xpath("//div[text()='Rahul approved successfully']"));
		
		if(userapprove.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("User is Approved");
		}
		else {
			Assert.assertTrue(false);
			logger.info("User is not Approved");
		}
		
		driver.findElement(By.id("activeTab")).click();
		Thread.sleep(2500);
		
		WebElement active=driver.findElement(By.id("activeTab"));
		WebElement blocked=driver.findElement(By.id("blockedTab"));
		WebElement deleted=driver.findElement(By.id("deletedTab"));
		WebElement pendingapproval=driver.findElement(By.id("pendingApprovalTab"));		
		WebElement editbtn=driver.findElement(By.id("editButton"));
		WebElement morebtn=driver.findElement(By.xpath("(//button[@id='moreButton'])[1]"));
		
		if(active.isDisplayed() && blocked.isDisplayed() && deleted.isDisplayed() && pendingapproval.isDisplayed() && editbtn.isDisplayed()
				&& morebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("It contains all the required sections in Users & Permissions");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("It doesn't contain all the required sections in Users & Permissions");
		}
		
		morebtn.click();
		Thread.sleep(2000);
		
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
		
		deleteuserbtn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void createproject() throws InterruptedException{
		
		driver.findElement(By.id("myProjects")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createProjects")).click();
		
		WebElement projectname=driver.findElement(By.name("project_name"));
		WebElement projectdescription=driver.findElement(By.name("description"));
		WebElement startat=driver.findElement(By.name("startAt"));
		WebElement create=driver.findElement(By.xpath("//button[text()='Create']"));
		Thread.sleep(2000);
		
		if(projectname.isDisplayed() && projectdescription.isDisplayed() && startat.isDisplayed() && create.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Create Project Button contains the required sections");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Create Project Button doesn't contain the required sections");
		}
		
		projectname.sendKeys("Test8");
		projectdescription.sendKeys("Project for Smoke Testing ");
		startat.click();
		driver.findElement(By.xpath("//button[text()='23']")).click();
		startat.click();
		create.click();
		Thread.sleep(2000);
		
		WebElement createproject=driver.findElement(By.xpath("//div[text()='Test8 created successfully']"));
		
		if(createproject.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Project is created and displayed in My projects section");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Project is not created");
		}
	}
	
	@Test(priority=5)
	public void deletedprojects() throws InterruptedException{
		
		driver.findElement(By.xpath("(//button[@id='deleteProject'])[6]")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		
		WebElement deletemessage=driver.findElement(By.xpath("//div[text()='Project Test8 deleted successfully']"));
		
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
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		WebElement deletedproject=driver.findElement(By.xpath("//span[text()='Test8']"));
		WebElement Restorebtn=driver.findElement(By.xpath("(//button[text()='Restore'])[33]"));
		
		if(deletedproject.isDisplayed() && Restorebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("The project is displayed in deleted section and Restore Button is available");
		}
		else {
			Assert.assertTrue(false);
			logger.info("The project is not displayed in deleted section");
		}
		Thread.sleep(2000);
		Restorebtn.click();
		driver.findElement(By.id("allProjectsTab")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void UserGroupPage() throws InterruptedException{
//		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
//		driver.findElement(By.name("password")).sendKeys("Admin@123");
//		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("userGroup")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("blockedTabb")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("deletedTabb")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("activeTabb")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("createGroupButton")).click();
		Thread.sleep(3000);
		WebElement groupname=driver.findElement(By.id("groupName"));
		WebElement selectuser=driver.findElement(By.name("selectUser"));
		WebElement grouprole=driver.findElement(By.name("groupRole"));
		WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
		if(groupname.isDisplayed() && selectuser.isDisplayed() && grouprole.isDisplayed() && savebtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Create Group button contains all the required sections");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Create Group button doesn't contain all the required sections");
		}
		
		groupname.sendKeys("Test8");
		selectuser.click();
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(2000);
		Select role=new Select(driver.findElement(By.xpath("(//select)[2]")));
		role.selectByVisibleText("Owner");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Owner']")).click();
		driver.findElement(By.xpath("//button[text()='Add Member']")).click();
		Thread.sleep(3000);
		savebtn.click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//button)[15]"));
		
		WebElement groupcreated=driver.findElement(By.xpath("//div[text()='Group created successfully']"));
		WebElement groupdisplay=driver.findElement(By.xpath("//span[text()='Test8']"));
		WebElement activetab=driver.findElement(By.id("activeTabb"));
		WebElement blockedtab=driver.findElement(By.id("blockedTabb"));
		WebElement deletedtab=driver.findElement(By.id("deletedTabb"));
		WebElement creategroup=driver.findElement(By.id("createGroupButton"));
		WebElement editgroupbtn=driver.findElement(By.id("editGroupButton"));
		WebElement actionsbtn=driver.findElement(By.id("moreGroupButton"));
		
		if(groupcreated.isDisplayed() && groupdisplay.isDisplayed() && activetab.isDisplayed() && blockedtab.isDisplayed()
			&& deletedtab.isDisplayed() && creategroup.isDisplayed() && editgroupbtn.isDisplayed() && actionsbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the sections are displayed in User Groups");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All sections are not displayed in User Groups");
		}
		
		driver.findElement(By.id("moreGroupButton")).click();
		Thread.sleep(2000);
		
		WebElement blockgroup=driver.findElement(By.id("blockButtonn"));
		WebElement deletegroup=driver.findElement(By.id("deleteButtonn"));
		if(blockgroup.isDisplayed() && deletegroup.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Actions button contains all the required sections");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Actions button doesn't contain all the required sections");
		}
		driver.findElement(By.id("deleteButtonn")).click();
		Thread.sleep(2500);
	}
	
	@Test(priority=7)
	public void publicLayers() throws InterruptedException{
//		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
//		driver.findElement(By.name("password")).sendKeys("Admin@123");
//		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("publicLayers")).click();
		Thread.sleep(2500);
		
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
		WebElement length=driver.findElement(By.xpath("(//input)[6]"));
		WebElement precision=driver.findElement(By.xpath("(//input)[7]"));
		WebElement fielddescription=driver.findElement(By.xpath("(//textarea)[2]"));
		WebElement setdomainvalue=driver.findElement(By.xpath("(//input)[8]"));
		WebElement addfieldbtn=driver.findElement(By.xpath("//button[text()='Add Field']"));
		WebElement createlayerbtn=driver.findElement(By.xpath("//button[text()='Create']"));
		
		if(Layername.isDisplayed() && geometrytype.isDisplayed() && colour.isDisplayed() && linewidth.isDisplayed() && linetype.isDisplayed()
			&& layerdescription.isDisplayed() && shapefilebtn.isDisplayed() && fieldName.isDisplayed() && fieldType.isDisplayed()
			&& layerunit.isDisplayed() && length.isDisplayed() && precision.isDisplayed() && fielddescription.isDisplayed()
			&& setdomainvalue.isDisplayed() && addfieldbtn.isDisplayed() && createlayerbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the required sections are displayed in Create layer Button");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All the required sections are not displayed in Create layer Button");
		}
		
		Select obj = new Select(driver.findElement(By.xpath("(//select)[1]")));
//		Select obj1=new Select(driver.findElement(By.xpath("//div[text()='Pick a color']")));
		Layername.sendKeys("TestLayer12");
//		geometrytype.click();
		Thread.sleep(2000);
		obj.selectByVisibleText("Polygon");
//		driver.findElement(By.xpath("//option[text()='Polygon']")).click();
		Thread.sleep(2000);
		colour.click();
		Thread.sleep(2000); //sendKeys("#FF5733");
//		obj1.selectByValue("#FF5733");
		driver.findElement(By.xpath("(//div)[89]")).click();
		driver.findElement(By.xpath("//div[text()='#e84118']")).click();
		layerdescription.sendKeys("Testing");
		fieldName.sendKeys("Check");
		fielddescription.sendKeys("Checking");
		setdomainvalue.sendKeys("10,20,30");
		addfieldbtn.click();
		createlayerbtn.click();	
		
//		driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		WebElement newlayer=driver.findElement(By.xpath("//div[text()='Layer TestLayer12 created successfully']"));
		WebElement createlayer=driver.findElement(By.id("createLayerButton"));
		WebElement editlayer=driver.findElement(By.id("1layerEdit"));
		WebElement deletelayer=driver.findElement(By.id("1deleteLayer"));
		WebElement layername=driver.findElement(By.xpath("//td[text()='Layer Name']"));
		WebElement type=driver.findElement(By.xpath("//td[text()='Type']"));
		WebElement description=driver.findElement(By.xpath("//td[text()='Description']"));
		
		if(newlayer.isDisplayed()&& createlayer.isDisplayed() && editlayer.isDisplayed() && deletelayer.isDisplayed()
				&& layername.isDisplayed() && type.isDisplayed() && description.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All the sections are displayed in Public Layers");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All the sections are not displayed in Public Layers");
		}
	}
	
	@Test(priority=8)
	public void projectsection() throws InterruptedException{
		
		driver.findElement(By.id("myProjects")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Test1']")).click();
		Thread.sleep(3000);
		
		WebElement Data=driver.findElement(By.xpath("//a[text()='Data']"));
		WebElement launchapp=driver.findElement(By.xpath("//span[text()='Launch App']"));
		WebElement downloadapp=driver.findElement(By.xpath("//span[text()='Download App']"));
		
		if(Data.isDisplayed() && launchapp.isDisplayed() && downloadapp.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All sections are available in Data in Projects");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All required sections are not available in Data in the Project");
		}
		
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[3]")).click();
		Thread.sleep(3000);
		
		WebElement name=driver.findElement(By.xpath("//td[text()='Name']"));
		WebElement created=driver.findElement(By.xpath("//td[text()='Created']"));
		WebElement location=driver.findElement(By.xpath("//td[text()='Location']"));
		WebElement uploadstatus=driver.findElement(By.xpath("//td[text()='Upload Status']"));
		WebElement actionsbtn=driver.findElement(By.xpath("(//button[contains(@type,'button')])[4]"));
		
		if(name.isDisplayed() && created.isDisplayed() && location.isDisplayed() && uploadstatus.isDisplayed() && actionsbtn.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All required fields are available in List view in Data in the Project");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All required sections are not available in Data in the Project");
		}
		
		actionsbtn.click();
		Thread.sleep(2500);
		WebElement open=driver.findElement(By.xpath("//li[text()='Open']"));
		WebElement details=driver.findElement(By.xpath("//li[text()='Details']"));
		WebElement deletepermanently=driver.findElement(By.xpath("//li[text()='Delete Permanently']"));
		if(open.isDisplayed() && details.isDisplayed() && deletepermanently.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("All required fields are available in Actions button");
		}
		else {
			Assert.assertTrue(false);
			logger.info("All required sections are not available in Actions button");
		}
		
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[2]")).click();
		Thread.sleep(2000);
	}
}
