package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("phone-no")).sendKeys("Rohit@123");
		Thread.sleep(3000);
		driver.findElement(By.className("pure-button")).click();
	}

}
