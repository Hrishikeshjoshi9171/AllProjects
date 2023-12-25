package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

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
		
		//How many rows are there in table?
		
		//First Way
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();		
		System.out.println(row);
		
		//Second Way
		List<WebElement>Row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(Row1.size());
		
		//How many columns are there in the table
		//First Way
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(col);
		
		//Second Way
		List<WebElement>col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(col1.size());
		
		//Retrieve the specific row/column data
		String value=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[3]")).getText();
		System.out.println(value);
		
		String value1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[3]")).getText();
		System.out.println(value1);
		
		//Retrieve all the data from table
		//Outer Loop
		for(int i=2;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"|";
		
		//We cannot pass the variable inside xpath
				System.out.print(data);
			}
			System.out.println();
		}
	}

}
