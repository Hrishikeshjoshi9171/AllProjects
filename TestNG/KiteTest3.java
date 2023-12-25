package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest3 {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
	@Test(enabled=true)
	public void kiteloginpage() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	@Test(enabled=false)
	public void kitelogoTest() {
		boolean b=driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		System.out.println(b);
	}
	@Test(enabled=true)
	public void forgetlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
		System.out.println(b1);
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
