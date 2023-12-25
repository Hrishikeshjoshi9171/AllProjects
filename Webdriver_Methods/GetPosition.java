package Webdriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(4000);
		
		Point P=new Point(100,400);
		Thread.sleep(3000);
		
		driver.manage().window().setPosition(P);
		Thread.sleep(10000);
		
		System.out.println(driver.manage().window().getPosition());
	}

}
