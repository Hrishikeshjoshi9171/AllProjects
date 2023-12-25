package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyText {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Tom@123");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Tome123");
		
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	}

}
