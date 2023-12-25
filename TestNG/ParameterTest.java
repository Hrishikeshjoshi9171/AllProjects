package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;

	@BeforeMethod
	@Parameters({"URL"})
	public void Setup(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(URL);
	}

	@Test
	@Parameters({ "Username", "Password", "PIN" })
	public void kiteloginpage(String Username, String Password, String PIN) throws InterruptedException {

		// Enter Username

		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(Username);

		Thread.sleep(2000);

		// Enter Password
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);

		// Click on Login Button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(2000);

		// Enter PIN
		
		driver.findElement(By.id("pin")).sendKeys(PIN);

		// Enter Continue
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String ExpUserID = Username;

		// Get User-ID
		String ActualUserID = driver.findElement(By.xpath("//span[text()='GP8097']")).getText();

		if (ExpUserID.equals(ActualUserID)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.quit();
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
