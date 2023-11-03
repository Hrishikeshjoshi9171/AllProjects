package com.STM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name ="email") //Finding the element 'email' using Locator
	WebElement txtEmail;

	@FindBy(name ="password") //Finding the element 'password' using Locator 
	WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Login']") //Finding the element 'Login button' using Locator
	WebElement btnSignin;

	public void setEmail(String correctemail) {
		txtEmail.sendKeys(correctemail); //Using the info stored in config.properties
	}
	
	public void setEmail1(String wrongemail) {
		txtEmail.sendKeys(wrongemail); //Using the info stored in config.properties
	}
	
	public void setEmail2(String otheremail) {
		txtEmail.sendKeys(otheremail); //Using the info stored in config.properties
	}

	public void setPassword(String correctpassword) {
		txtPassword.sendKeys(correctpassword); //Using the info stored in config.properties
	}
	
	public void setPassword1(String wrongpassword) {
		txtPassword.sendKeys(wrongpassword); //Using the info stored in config.properties
	}

	public void ClickSignin() {
		btnSignin.click(); 
	}
}
