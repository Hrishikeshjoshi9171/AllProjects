package com.Coursera.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name = "email")
	WebElement useremail;
	
	@FindBy(name = "password")
	WebElement userpassword;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginbtn;
	
	public void setUserEmail(String email)
	{
		useremail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		userpassword.sendKeys(password);
	}
	
	public void clicksubmit()
	{
		loginbtn.click();
	}
}
