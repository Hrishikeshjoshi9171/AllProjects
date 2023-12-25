package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest6 {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
	@Test(priority=1,groups="Title")
	public void kiteloginpage() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	@Test(priority=2,groups="Title")
	public void kitelogoTest() {
		boolean b=driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=3,groups="logo")
	public void forgetlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
		System.out.println(b1);
	}
	@Test(priority=4,groups="logo")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=5,groups="Link Test")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=6,groups="Link Test")
	public void test3() {
		System.out.println("Test3");
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
