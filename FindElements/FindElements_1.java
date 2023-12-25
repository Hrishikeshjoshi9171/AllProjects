package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		//1.
//		WebElement Searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//		Searchbox.sendKeys("OnePlus");
		
		//2.
		WebElement Links=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
		System.out.println(Links.getText()); //BestSeller
		
		//3.
//		WebElement Links1=driver.findElement(By.xpath("//a[@class=\"nav \"]"));
//		System.out.println(Links1.getText());

	}

}
