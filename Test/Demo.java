package Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
