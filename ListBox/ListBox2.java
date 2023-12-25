package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

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
		
		//1.Select Element using SelectByVisibleText(String text)
		
//		Select select1=new Select(day);
//		select1.selectByVisibleText("27");
//		
//		Select select2=new Select(month);
//		select2.selectByVisibleText("Dec");
//		
//		Select select3=new Select(year);
//		select3.selectByVisibleText("1997");
//		
//		Thread.sleep(2000);
		
		//2.Select By Index
		
//		Select select4=new Select(day);
//		select4.selectByIndex(26);
//		
//		Select select5 = new Select(month);
//		select5.selectByIndex(11);
//		
//		Select select6 = new Select(year);
//		select6.selectByIndex(25);
		
//		Thread.sleep(2000);
		
		//3.SelectByValue(String Value)
		
		Select select7 = new Select(day);
		select7.selectByValue("27");
		
		Select select8=new Select(month);
		select8.selectByValue("12");
		
		Select select9=new Select(year);
		select9.selectByValue("1997");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
