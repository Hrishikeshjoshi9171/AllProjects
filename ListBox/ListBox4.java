package ListBox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select =new Select(day);
		
		//Q1.How will you get total size number
		List<WebElement>ListDay=select.getOptions(); //It will print all the options
		System.out.println("Total Days:"+ListDay.size());
		
		//Q2.How will you print all the values
		for(int i=0;i<ListDay.size();i++) {
			String DayValues =ListDay.get(i).getText();
			System.out.println(DayValues);
			
		//Q3.How will you select specific values from drop down with the help of get method
		if(DayValues.equals("15")) {
			ListDay.get(i).click();
			break;
		}
		}
		System.out.println("==================================================================");
		
		Select select1=new Select(month);
		List<WebElement>Listmonth=select1.getOptions();
		System.out.println("Total Month:"+Listmonth.size());
		System.out.println();
		
		for(int i=0;i<Listmonth.size();i++) {
			String MonthValues=Listmonth.get(i).getText();
			System.out.println(MonthValues);
			if(MonthValues.equals("May")) {
				Listmonth.get(i).click();
				break;
			}
		}
		Select select2=new Select(year);
		List<WebElement>Listyear=select2.getOptions();
		System.out.println("Total Year:"+Listyear.size());
		System.out.println();
		
		for(int i=0;i<Listyear.size();i++) {
			String YearValues=Listyear.get(i).getText();
			System.out.println(YearValues);
			if(YearValues.equals("2012")) {
				Listyear.get(i).click();
				break;
			}
		}

	}

}
