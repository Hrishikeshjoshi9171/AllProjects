package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		boolean b = driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		System.out.println(b);
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		boolean b2=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		System.out.println(b2);

	}

}
