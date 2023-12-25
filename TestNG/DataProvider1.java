package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;
	@Test(dataProvider="Logintestdata")
	public void Logintest(String Username,String Password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(Username);
		
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	@DataProvider(name="Logintestdata")
	public Object[][] logindata(){
		//Correct Username and Password
		Object[][] data=new Object[4][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		//Correct Username and Wrong Password
		data[1][0]="Admin";
		data[1][1]="admin231";
		
		//Wrong Username and Correct Password
		data[2][0]="fsvffv";
		data[2][1]="admin123";
		
		//Wrong Username and Wrong Password
		data[3][0]="Adminw";
		data[3][1]="khdc7r56";
		
		return data;
	}
	
}
