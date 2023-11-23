package com.STM.TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.STM.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String correctemail = readconfig.getEmail();
	public String wrongemail = readconfig.getEmail1();
	public String otheremail = readconfig.getEmail2();
	public String correctpassword = readconfig.getPassword();
	public String wrongpassword = readconfig.getPassword1();
	public static WebDriver driver;

	public Logger logger;

	@SuppressWarnings("deprecation")
	@Parameters("browserName")
	@BeforeClass
	
	public void setup(@Optional("chrome")String browserName) throws InterruptedException, AWTException {
		
//		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//		driver=new ChromeDriver();
		
		logger = Logger.getLogger("STM_Test");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		}
		
		else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getMSEdgePath());
			driver=new EdgeDriver();
			EdgeOptions option =new EdgeOptions();
			option.addArguments("--disable-notifications");
			}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		Robot robot = new Robot();
//		for(int i=0;i<2;i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
		Thread.sleep(3000);
		
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
