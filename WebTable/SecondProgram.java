package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement Text=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		js.executeScript("arguments[0].scrollIntoView();",Text);
		
		//How many rows are there in table
		//First Way
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();		
		System.out.println("Total No. of rows are: "+row);
		
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total No. of columns: "+col);
		
		for(int i=2;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String actualvalue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		if(actualvalue.equals("Francisco Chang")) {
			System.out.println("Row no.:"+i+"|"+"Col no.:"+j);
			break;
		}
	}
 }
}

}
