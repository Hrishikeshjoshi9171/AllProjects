package POM_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		Kite_Login_Page1 kp1=new Kite_Login_Page1(driver);
		kp1.Userid();
		Thread.sleep(2000);
		kp1.Pass();
		Thread.sleep(2000);
		kp1.loginbutton();
		
		Kite_Login_Page2 kp2=new Kite_Login_Page2(driver);
		kp2.pin();
		Thread.sleep(2000);
		kp2.Cbutton();
		
		Kite_Home_page kh=new Kite_Home_page(driver);
		kh.userid1();
	}

}
