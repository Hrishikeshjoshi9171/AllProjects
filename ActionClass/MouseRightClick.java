package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement Button=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Thread.sleep(2000);
		
		act.contextClick(Button).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
