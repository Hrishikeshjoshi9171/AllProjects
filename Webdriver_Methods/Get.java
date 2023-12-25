package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		//Step 1
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//get() -->This method is used to open application or to enter URL in a webbrowser.
		
	}

}
