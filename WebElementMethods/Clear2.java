package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement Pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Pass.sendKeys("hg@431");
		Thread.sleep(2000);
		Pass.clear();
		
		System.out.println("Validation completed");

	}

}
