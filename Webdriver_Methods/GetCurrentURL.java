package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("https://www.facebook.com/")) {
			System.out.println("Correct URL");
		}
		else {
			System.out.println("Incorrect URL");
		}
	}

}
