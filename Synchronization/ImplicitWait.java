package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//Implicit Wait is always applied globally.
		//It is available for all WebElements on the Webpage.
		//Dynamic in nature
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Rohit@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Rohit@gmail.com");
	}

}
