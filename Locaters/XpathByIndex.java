package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")).click();
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[5]")).click();
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[6]")).click();
		

	}

}
