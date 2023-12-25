package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"]")).sendKeys("Sharma");
		driver.findElement(By.tagName("textarea")).sendKeys("Automation");
	}

}
