package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//1.Click on links
		
//		driver.findElement(By.linkText("Today's Deals")).click();
//		driver.findElement(By.partialLinkText("Today's")).click();
		
		//2.How many links are present on the webpage?
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links present:"+Links.size());
		
		//3.Print all the links
//		for(int i=0;i<Links.size();i++) {
//			System.out.println(Links.get(i).getAttribute("href"));
//		}
		for(WebElement link:Links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}

}
