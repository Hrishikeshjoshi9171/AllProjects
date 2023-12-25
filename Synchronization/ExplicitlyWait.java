package Synchronization;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Rohit@gmail.com");
		
		Emailname(driver,Email,15,"Rohit");
	}
	public static void Emailname(WebDriver driver,WebElement element,int i,String value) {
		new WebDriverWait(driver,Duration.ofSeconds(20)).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}
