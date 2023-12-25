package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup7_RediffAlert {
	
	@SuppressWarnings("unlikely-arg-type")

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Rahul");
		
//		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("QWERTY1234");
		
		driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
		
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if(text.equals("Please enter your password")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		driver.quit();

	}

}
