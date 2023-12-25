package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot3_ProjectFolder {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(10);
		
		String Filename="RedBus";
		
		File Destination=new File("C:\\Users\\hrish\\OneDrive\\Desktop\\Selenium\\ScreenShot\\"+Filename+""+Random+".png");
		
//		File Destination=new File(".\\Screenshot"+Filename+""+Random+".jpg");
		
//	    .\\ -->It represents your current project folder directory
		
		FileHandler.copy(Source, Destination);
		
		driver.quit();
	}

}
