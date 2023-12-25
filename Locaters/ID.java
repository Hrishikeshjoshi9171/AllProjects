package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Rwe@34534");
		
		driver.findElement(By.id("pass")).sendKeys("qdqe2121");
		
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		//driver.findElement(By.id("u_0_d_yO")).click();
	}

}
