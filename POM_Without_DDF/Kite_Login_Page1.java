package POM_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {
	public Kite_Login_Page1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="userid")
	WebElement Userid;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement LoginButton;
	
	public void Userid() {
		Userid.sendKeys("GP8097");
	}
	public void Pass() {
		Password.sendKeys("gms@0110");
	}
	public void loginbutton() {
		LoginButton.click();
	}

}
