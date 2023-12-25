package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot4_SpecificElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Screen=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File Source=((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(3);
		
		String Filename="Logo";
		
		File Destination=new File(".\\"+Filename+""+Random+".jpg");
		
		FileHandler.copy(Source, Destination);

	}

}
