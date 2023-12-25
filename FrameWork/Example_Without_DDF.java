package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_Without_DDF {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		//Enter UserID
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
		
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("gms@0110");
		
		//Click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//Enter PIN
		driver.findElement(By.id("pin")).sendKeys("111000");
		
		//Enter Continue
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String ExpectedUserID="GP8097";
		
		//Get User ID
		String ActualUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		if(ExpectedUserID.equals(ActualUserID)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
