package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		
		Set<String> WindowID=driver.getWindowHandles();
		
		//First Method-->Iterator
		Iterator<String> it=WindowID.iterator();
		
		String Parentwindow=it.next();
		String Childwindow=it.next();
		
		System.out.println("Parent Window:"+Parentwindow);
		System.out.println("Child Window:"+Childwindow);
		Thread.sleep(3000);
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(2000);
		
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		System.out.println("Child window Title: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		System.out.println("Parent window Title: "+driver.getTitle());
		
		driver.switchTo().window(Childwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"Form_submitForm_FullName\"]")).sendKeys("Rohit Sharma");
		
		driver.findElement(By.xpath("//input[@id=\"Form_submitForm_CompanyName\"]")).sendKeys("Google");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		System.out.println("Parent window: "+driver.getTitle());
		
		driver.quit();
	}

}
