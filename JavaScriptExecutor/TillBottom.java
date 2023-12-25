package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TillBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		
		//Scrolling By Element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		//ScrollDown
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		
		//ScrollUp
		js.executeScript("document.documentElement.scrollTop=0");
	}

}
