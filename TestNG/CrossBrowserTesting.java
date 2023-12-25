package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void kitelogin(String Browsername) throws InterruptedException{
		if(Browsername.equals("chrome")) {
	        
			System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			
			driver=new ChromeDriver(); //Launch browser
			
		}
		else if(Browsername.equals("Edge")) {
            System.setProperty("webdriver.edge.driver","C:\\Installer\\edgedriver_win64\\msedgedriver.exe");
			
			driver=new EdgeDriver(); //Launch browser
		}
		else if(Browsername.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Installer\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver(); //Launch browser
		}
		
		driver.get("https://kite.zerodha.com/");
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Enter Username
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
		
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("gms@0110");
		
		//Click on Login Button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		
		//Enter PIN
		driver.findElement(By.id("pin")).sendKeys("111000");
		
		//Enter Continue
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String ExpUserID="GP8097";
		
		//Get User-ID
		String ActualUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		if(ExpUserID.equals(ActualUserID)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}
}
