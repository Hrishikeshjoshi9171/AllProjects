package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		Thread.sleep(3000);
		
		WebElement input1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		
		WebElement input2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		
		Thread.sleep(3000);
		
		input1.sendKeys("This is my first Java program");
		
		Actions act=new Actions(driver);		
		Thread.sleep(3000);
		
		//CTRL + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(3000);
		
		//CTRL + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(3000);
		
		//Tab
		act.sendKeys(Keys.TAB);
		act.build().perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(3000);
		
		//Compare Text
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Correctly Copied");
		else
			System.out.println("Not Copied");
	}

}
