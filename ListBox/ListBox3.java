package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Thread.sleep(2000);
		
		String dob="27/12/1997"; //Test Data
		String date[]=dob.split("/");
		
		ListBox(day, date[0]);
		
		ListBox(month, date[1]);
		
		ListBox(year, date[2]);
		
		Thread.sleep(3000);
		driver.close();

	}
	public static void ListBox(WebElement element, String value) {
		Select select1 = new Select(element);
		select1.selectByValue(value);
	}
	

}
