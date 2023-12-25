package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class ScreenShot5_UsingMethod {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Takescreenshot("QQQQ");
		Takescreenshot("SSSS");
		driver.quit();
		
	}
	public static void Takescreenshot(String Filename)throws IOException{
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(3);
		
		File Destination=new File(".\\"+Filename+""+Random+".jpg");
		
		FileHandler.copy(Source, Destination);
	}

}
