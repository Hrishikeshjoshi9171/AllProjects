package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {
	// 1.
	@FindBy(xpath="//span[text()='GP8097']")WebElement UserID1;
	
	// 2.
	public Kite_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// 3.
	public void verifyUserID(String ExpectedUserid) {
		String ActualUserid=UserID1.getText();
		
		if(ExpectedUserid.equals(ActualUserid)) {
			System.out.println("Correct User-ID");
		}
		else {
			System.out.println("Incorrect User-ID");
		}
	}

}
