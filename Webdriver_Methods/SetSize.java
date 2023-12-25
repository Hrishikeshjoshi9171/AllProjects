package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Dimension Size=new Dimension(400,500);
		
		driver.manage().window().setSize(Size);
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
