package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Cheese"+Keys.ENTER);
		
		WebElement value=new WebDriverWait(driver,Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3")));
		
		System.out.println(value.getText());
	}

}
