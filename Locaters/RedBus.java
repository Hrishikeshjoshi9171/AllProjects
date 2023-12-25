package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@data-id=\"130\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@data-id=\"462\"]")).click();
	    
	    //Current Day
	   // driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	    
	    //Next Day
	    driver.findElement(By.xpath("//td[@class=\"wd day\" and contains(text(),'24')]")).click();
	    
	    driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	}

}
