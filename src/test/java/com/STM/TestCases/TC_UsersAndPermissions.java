package com.STM.TestCases;

public class TC_UsersAndPermissions extends BaseClass{
  @Test(priority=1)
	public void UsersandPermissions() throws InterruptedException{
		
		driver.findElement(By.name("email")).sendKeys("admin@ceinsys.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userManagement")).click();
		Thread.sleep(2000);
		
		WebElement active=driver.findElement(By.xpath("//a[text()='Active']"));
		active.click();
		Thread.sleep(2000);
		WebElement blocked=driver.findElement(By.xpath("//a[text()='Blocked']"));
		blocked.click();
		Thread.sleep(2000);
		WebElement deleted=driver.findElement(By.xpath("//a[text()='Deleted']"));
		deleted.click();
		Thread.sleep(2000);
		WebElement pendingapproval=driver.findElement(By.xpath("//a[text()='Pending Approval']"));
		pendingapproval.click();
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
		
		WebElement name = driver.findElement(By.xpath("//span[text()='Pritesh Kadam']"));
		WebElement createdon = driver.findElement(By.xpath("//td[text()='November 1st, 2023']"));
		WebElement approve = driver.findElement(By.xpath("//button[text()='Approve']"));
		WebElement reject = driver.findElement(By.xpath("//button[text()='Reject']"));
		
		if(name.isDisplayed() && createdon.isDisplayed() && approve.isDisplayed() && reject.isDisplayed())
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
		
		driver.findElement(By.xpath("(//button[text()='Reject'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement message=driver.findElement(By.xpath("//div[text()='Robert rejected successfully']"));
		
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
		
		driver.findElement(By.xpath("//button[text()='Approve']")).click();		
		WebElement name=driver.findElement(By.xpath("//div[text()='Pranav approved successfully']"));
		if(name.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("The user is approved");
		}
		else {
			Assert.assertTrue(true);
			logger.info("The user is not approved");
		}
	}
}
