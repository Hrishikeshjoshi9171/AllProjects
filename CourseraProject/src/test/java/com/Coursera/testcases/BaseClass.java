package com.Coursera.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Coursera.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getWebsiteURL();
	public String useremail =readconfig.getUserEmail();
	public String userpassword =readconfig.getUserPassword();
	public static WebDriver driver;

	public static Logger logger;
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome")String br) throws InterruptedException, AWTException {
		
		logger=Logger.getLogger("CourseraProject");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable-notifications");
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
			FirefoxOptions option =new FirefoxOptions();
			option.addArguments("--disable-notifications");
		}
		else if(br.equals("msedge")) {
			System.setProperty("webdriver.msedge.driver", readconfig.getMsedgePath());
			driver = new EdgeDriver();
			EdgeOptions option =new EdgeOptions();
			option.addArguments("--disable-notifications");
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
