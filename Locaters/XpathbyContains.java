package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyContains {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Tom@123");
		
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Tome1234");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
	}

}
