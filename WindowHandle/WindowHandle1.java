package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		String WindowID=driver.getWindowHandle(); //Returns ID of the single browser window
		
		System.out.println(WindowID);
		
		//CDwindow-18755ADD1511D93B082D1994DA51024C
		
		//CDwindow-9589B8D3536746D139AD747272048223
		
		//The getwindowhandle method is used to store the window ID of the single browser.
	}

}
