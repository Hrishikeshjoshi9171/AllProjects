package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_With_DDF {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Enter User ID
		FileInputStream file=new FileInputStream("C:\\Users\\hrish\\Downloads\\Zerodha(Automation).xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		String UserID=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(UserID);
		
		Thread.sleep(2000);
		
		//Enter Password
		String pass=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.id("password")).sendKeys(pass);
		
		//Click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//Enter PIN
		String PIN=sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.id("pin")).sendKeys(PIN);
		
		//Enter Continue
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Get User-ID
		String ActualUserid=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		if(UserID.equals(ActualUserid)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
