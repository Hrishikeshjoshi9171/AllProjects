package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_Assertion1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
	@Test
	public void Username() throws InterruptedException {
		WebElement Username =driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		//AssertTrue
		Assert.assertTrue(Username.isDisplayed()); //True
		Username.sendKeys("GP8097");
		Thread.sleep(3000);
		
		Assert.assertTrue(Password.isDisplayed());
		Password.sendKeys("gms@0110");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Test(enabled=false)
	public void Pass() throws InterruptedException {
        WebElement Username =driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		//AssertFalse
		Assert.assertFalse(Username.isDisplayed());
		Username.sendKeys("GP8097");
		Thread.sleep(3000);
		
		Assert.assertFalse(Password.isDisplayed());
		Password.sendKeys("gms@0110");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Test
	public void kitelogin() {
		boolean b=driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b,true);
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
