package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		WebElement Admin=driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"));
		
		WebElement UserManagement=driver.findElement(By.xpath("//a[@id=\"menu_admin_UserManagement\"]"));
		
		WebElement User=driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]"));
		
		//MouseOver to Admin Tab
//		act.moveToElement(Admin).build().perform();
//		Thread.sleep(3000);
//		
//		//MouseOver to UserManagement
//		act.moveToElement(UserManagement).build().perform();
//		Thread.sleep(3000);
//		
//		//MouseOver to User
//		act.moveToElement(User).build().perform();
//		Thread.sleep(3000);
		
		//Instead of writing three statements we can write one statement
		act.moveToElement(Admin).moveToElement(UserManagement).moveToElement(User).build().perform();
		User.click();
	}

}
