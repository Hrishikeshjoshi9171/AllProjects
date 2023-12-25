package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected();
		if(driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected()==false) {
			driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		}
		else
			System.out.println(driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected());
	}

}
