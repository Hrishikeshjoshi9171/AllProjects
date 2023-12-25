package POM_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_page {
	public Kite_Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='GP8097']")
	WebElement UserID1;
	
	public void userid1() {
		String ExpectedUserID="GP8097";
		String ActualUserID=UserID1.getText();
		
		if(ExpectedUserID.equals(ActualUserID)) {
			System.out.println("Valid User-ID");
		}
		else
			System.out.println("Invalid User-ID");
	}
}
