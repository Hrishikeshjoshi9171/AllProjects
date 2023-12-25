package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		Thread.sleep(3000);
		
		//1-->Xpath
		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("Test@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		
//		//2-->ID
//		driver.findElement(By.id("login-username")).sendKeys("Test@yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("login-signin")).click();
//		
//		//3-->Name
//		driver.findElement(By.name("username")).sendKeys("Test@yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("signin")).click();
//		
//		//4-->CSS Selector
//		driver.findElement(By.cssSelector("login-username")).sendKeys("Test@Yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input.pure-button.puree-button-primary.challenge-button")).click();
//		
//		//5-->Class-name
//		driver.findElement(By.className("phone-no")).sendKeys("Rohit@yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.className("pure-button")).click();
		
		//6-->LinkText
//		driver.findElement(By.linkText("Forgot username?")).click();
		
		//7-->Partial Link Text
//		driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
