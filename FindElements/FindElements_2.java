package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		//1.
//		List<WebElement> Links=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
//		
//		System.out.println("Number of elements captured: "+Links.size());
//		
//		for(WebElement ele:Links) {
//			System.out.println(ele.getText());
//		}
		
		//2.
		List<WebElement> Links1=driver.findElements(By.xpath("//a[@class=\"nav-  \"]"));
		
		System.out.println("Number of elements captured:"+Links1.size());

	}

}
