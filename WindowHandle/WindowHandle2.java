package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		
		Set<String> WindowID=driver.getWindowHandles();
		
		//First Method-->Iterator
		Iterator<String> it=WindowID.iterator();
		
		String Parentwindow=it.next();
		String Childwindow=it.next();
		
		System.out.println("Parent Window:"+Parentwindow);
		System.out.println("Child Window:"+Childwindow);
		Thread.sleep(3000);
		
		//The getwindowhandles method is used to store all the opened windows-id in the set data.
		
		//Second Method
		
		ArrayList<String> Windowlist=new ArrayList(WindowID);
		String Parent= Windowlist.get(0);
		String child=Windowlist.get(1);
		
		System.out.println("Parent: "+Parent);
		System.out.println("Child: "+child);
	}

}
