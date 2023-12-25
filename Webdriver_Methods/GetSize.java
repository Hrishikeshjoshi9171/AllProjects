package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getSize());

	}

}
