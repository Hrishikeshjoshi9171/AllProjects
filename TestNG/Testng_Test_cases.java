package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Test_cases {
	@Test 
	public void m1() {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
	@Test
	public void m2() {
		int i=1;
		int div=1/0;
		System.out.println(div);
	}
}
