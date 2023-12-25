package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Rahul");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("123234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Ketan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
	}

}
