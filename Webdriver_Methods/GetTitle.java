package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		String Title= driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(Title);
		
		String ExpectedResult ="Facebook--> log in or sign up";
		
		if(Title.equals(ExpectedResult)) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Wrong Title");
		}
		driver.close();

	}

}
