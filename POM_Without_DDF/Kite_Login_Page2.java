package POM_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page2 {
	public Kite_Login_Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="pin")
	WebElement PIN;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement ContinueButton;
	
	public void pin() {
		PIN.sendKeys("111000");
	}
	public void Cbutton() {
		ContinueButton.click();
	}
}
