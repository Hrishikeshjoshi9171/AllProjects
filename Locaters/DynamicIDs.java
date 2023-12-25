package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicIDs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("wfdc@13413");
		driver.findElement(By.id("pass")).sendKeys("safg453");
		//1-->Dynamic-ID :button
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_d_p4')]")).click();
		
		//2-->starts-with
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();
		
		//3-->ends-with
		//driver.findElement(By.xpath("//button[ends-with(@id,'d_p4')]")).click();
	}

}
