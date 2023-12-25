package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("345324789");
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'10') and @value=\"10\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2021\"]")).click();
		
		driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
	}

}
