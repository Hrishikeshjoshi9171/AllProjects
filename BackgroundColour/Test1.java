package BackgroundColour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(4000);
		
		String Expectedcolor="#4184f3";
		
		WebElement col=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]"));
		
		String backcolor=col.getCssValue("color");
		
		System.out.println(backcolor);
		
		String c=Color.fromString(backcolor).asHex();
		
		System.out.println(c);
		
		if(c.equals(Expectedcolor)) {
			System.out.println("Correct Color");
		}
		else {
			System.out.println("Incorrect Color");
		}
	}

}
