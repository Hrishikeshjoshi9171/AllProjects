package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//Absolute Xpath
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("Rohit");
		
		//Relative Xpath
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ABC");
	}

}
