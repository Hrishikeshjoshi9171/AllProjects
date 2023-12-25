package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		act.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		act.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
	}

}
