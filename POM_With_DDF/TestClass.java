package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws  InterruptedException,EncryptedDocumentException,IOException {
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
        
      // To fetch data from excel sheet
        FileInputStream file = new FileInputStream("C:\\Users\\hrish\\Downloads\\Zerodha(Automation).xlsx");
        
        Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		//Create object of pom class 
		Kite_Login_Page1 kp1=new Kite_Login_Page1(driver);
		
		//Fetch username from excel sheet 
		String UserID=sh.getRow(0).getCell(0).getStringCellValue();
		kp1.UserID(UserID);
		
		//Fetch password from excel sheet 
		String Pass=sh.getRow(0).getCell(1).getStringCellValue();
		kp1.Pass(Pass);
		kp1.loginbutton();
		
		//Create object login page 2
		Kite_Login_Page2 kp2 =new Kite_Login_Page2(driver);
		
		//Fetch PIN number from excel sheet 
		String PINnumber=sh.getRow(0).getCell(2).getStringCellValue();
		kp2.Pin(PINnumber);
		kp2.Cbutton();
		
		Kite_Home_Page kh=new Kite_Home_Page(driver);
		
		//Fetch PIN number from excel sheet
		String User=sh.getRow(0).getCell(0).getStringCellValue();
		kh.verifyUserID(User);
		
		//Close Browser
		driver.quit();
		}
	}

