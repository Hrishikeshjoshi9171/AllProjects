package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {
//	 1.Data members/variables should be declared globally with access level private
//     by using @FindBy annotation.
         
	@FindBy(id="userid")private WebElement Userid;
//	WebElement UserID=driver.findElement(By.id("userid"));
	
	@FindBy(id="password")private WebElement Password;
//	WebElement Password=driver.findElement(By.id("Password"));
	
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
//	WebElement loginbutton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	
	//2. Initialize within a constructor, with access level public, using pagefactory class.
	
	public Kite_Login_Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// 3.Utilize within a method with access level public
	public void UserID(String UserID) {
		Userid.sendKeys(UserID);
	}
	public void Pass(String PASSWORD) {
		Password.sendKeys(PASSWORD);
	}
	public void loginbutton() {
		LoginButton.click();
	}
}
