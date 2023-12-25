package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		//First Step
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		//System --> Class name
		//SetProperty--> Method name
		//Webdriver--> Interface/Version of selenium
		//Chrome--> Name of browser
		
		//P2-->Path of the chrome driver.exe
		
		//ChromeDriver driver =new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
	}

}
