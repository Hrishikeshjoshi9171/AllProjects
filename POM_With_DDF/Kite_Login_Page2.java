package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page2 {
	@FindBy(id="pin")private WebElement PIN;
	
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement ContinueButton;
	
	public Kite_Login_Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Pin(String PIN1) {
		PIN.sendKeys(PIN1);
	}
	public void Cbutton() {
		ContinueButton.click();
	}
}
