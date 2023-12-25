package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceprogram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement Text=driver.findElement(By.xpath("//h2[contains(text(),'HTML Table Tags')]"));
		
		js.executeScript("arguments[0].scrollIntoView();",Text);
		
		//Number of rows and columns
		List<WebElement>row=driver.findElements(By.xpath("//table[@class=\"ws-table-all notranslate\"]/tbody/tr"));
		System.out.println(row.size());
		
		List<WebElement>col=driver.findElements(By.xpath("//table[@class=\"ws-table-all notranslate\"]/tbody/tr/th"));
		System.out.println(col.size());
	}

}
