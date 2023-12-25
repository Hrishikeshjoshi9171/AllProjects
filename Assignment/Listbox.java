package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(30000);
		
		WebElement skills= driver.findElement(By.id("Skills"));
		Thread.sleep(3000);
		
		Select select=new Select(skills);
		
		List<WebElement>skill_list=select.getOptions();
		System.out.println("Total Skills are: "+skill_list.size());
		for(int i=0;i<skill_list.size();i++) {
			String skillvalues=skill_list.get(i).getText();
			System.out.println(skillvalues);
		}
		select.selectByValue("APIs");
		driver.close();
		}				
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//		
//		Select select1 =new Select(day);
//		List<WebElement>Listday=select1.getOptions();
//		System.out.println("Total Month:"+Listday.size());
//		System.out.println();
//		for(int i=0;i<Listday.size();i++) {
//			String dayValues=Listday.get(i).getText();
//			System.out.print(dayValues+" ");
	}

