package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException{
		//Step 1
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Done");
		//driver.close();
		driver.quit();
	}

}
