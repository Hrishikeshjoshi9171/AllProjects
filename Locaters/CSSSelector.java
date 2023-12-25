package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		
//		//1.
//		driver.findElement(By.cssSelector("#username")).sendKeys("Test@123");
//		
//		driver.findElement(By.cssSelector("#password")).sendKeys("sfsr@1232");
		
		//2.
//		driver.findElement(By.cssSelector("input#username")).sendKeys("Tom@123");
//		
//		driver.findElement(By.cssSelector("input#password")).sendKeys("31fv");
//		
		//3.
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Rohit@gmail.com");
		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("214dfgfg");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("path.UICheckbox__PrivateCheckboxIconInnerSVG-p67e4e-3.bzZfLb.private-checkbox__icon__inner")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#loginBtn")).click();
	}

}
