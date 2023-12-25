package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxWithoutSelectClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		List<WebElement>daylist=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		System.out.println("Total Days: "+daylist.size());
		
		for(int i=0;i<daylist.size();i++) {
			System.out.println(daylist.get(i).getText());
			
			if(daylist.get(i).getText().equals("27")) {
				daylist.get(i).click();
				break;
			}
		}
		System.out.println();
		
		List<WebElement>monthlist=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		System.out.println("Total Months: "+monthlist.size());
		
		for(int i=0;i<monthlist.size();i++) {
			System.out.println(monthlist.get(i).getText());
			
			if(monthlist.get(i).getText().equals("Dec")) {
				monthlist.get(i).click();
				break;
			}
		}
		System.out.println();
		
		List<WebElement>yearlist=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println("Total Years: "+ yearlist.size());
		
		for(int i=0;i<yearlist.size();i++) {
			System.out.println(yearlist.get(i).getText());
			
			if(yearlist.get(i).getText().equals("1997")) {
				yearlist.get(i).click();
				break;
			}
		}
	}

}
