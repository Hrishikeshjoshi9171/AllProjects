package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Take Screenshot and copy into object
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination =new File("C:\\Users\\hrish\\OneDrive\\Desktop\\Screenshot\\sample1.jpg");
		System.out.println(Source);
		FileHandler.copy(Source, destination);

	}

}
