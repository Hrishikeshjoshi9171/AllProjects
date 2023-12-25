package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		String Page1=driver.getTitle();
		System.out.println(Page1);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(6000);
		
		String Page2=driver.getTitle();
		System.out.println(Page2);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
	}

}
