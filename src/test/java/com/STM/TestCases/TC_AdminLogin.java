package com.STM.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.STM.PageObjects.LoginPage;

public class TC_AdminLogin extends BaseClass {

	@Test(priority = 1)
	public void SignupError1() throws InterruptedException {
		// Wrong first name is provided during Sign Up

		driver.findElement(By.xpath("//a[text()='Sign up']")).click();               // Path to Sign up button

		WebElement firstname = driver.findElement(By.name("firstname"));             // Storing the path of First name
		WebElement lastname = driver.findElement(By.name("lastname"));               // Storing the path of Last name
		WebElement email = driver.findElement(By.name("email"));                     // Storing the path of email
		WebElement password = driver.findElement(By.name("password"));               // Storing the path of Password
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword")); // Storing the path of confirm password

		firstname.sendKeys("12345");                     // Sending input to first name
		lastname.sendKeys("Downey");                     // Sending input to last name
		email.sendKeys("robert@meg-nxt.com");            // sending input to email
		password.sendKeys("Robby@1234");                 // sending input to password
		driver.findElement(By.tagName("svg")).click();   // Making the password visible
		confirmpassword.sendKeys("Robby@1234");          // sending input to confirm password
		driver.findElement(By.id("signup")).click();     // Clicking on the sign up button to Sign Up
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//p[text()='must contain only alphabets']")); //Storing path 
		                                                                                                  //of output Data
		
		if (signup.isDisplayed()) {

			// Using assertion to validate the results
			Assert.assertTrue(true);
			logger.info("Signup unsuccessful due to invalid format of First Name");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup is successful with invalid format of First Name");
		}
	}

	@Test(priority = 2)
	public void SignupError2() throws InterruptedException { 
		// Wrong Last Name is provided during Sign up

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

		firstname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		lastname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		confirmpassword.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		firstname.sendKeys("Robert");
		lastname.sendKeys("12234");
		email.sendKeys("robert@meg-nxt.com");
		password.sendKeys("Robby@1234");
		confirmpassword.sendKeys("Robby@1234");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Opps! Signup failed']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup unsuccessful due to invalid format of Last Name");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup is successful with invalid format of Last Name");
		}
	}

	@Test(priority = 3)
	public void SignupError3() throws InterruptedException { // Wrong email is provided

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

		firstname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		lastname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		confirmpassword.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		firstname.sendKeys("Robert");
		lastname.sendKeys("Downey");
		email.sendKeys("robert@meg-xt.com");
		password.sendKeys("Robby@1234");
		confirmpassword.sendKeys("Robby@1234");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Invalid email provided']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup unsuccessful due to invalid format of email");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup is successful even with invalid format of email");
		}
	}

	@Test(priority = 4)
	public void SignupError4() throws InterruptedException { // Email-id is other than meg-nxt.com & ceinsys.com

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

		firstname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		lastname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		confirmpassword.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		firstname.sendKeys("Robert");
		lastname.sendKeys("Downey");
		email.sendKeys("robert@gmail.com");
		password.sendKeys("Robby@1234");
		confirmpassword.sendKeys("Robby@1234");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Invalid email provided']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup unsuccessful as email-id doesn't match meg-nxt.com or ceinsys.com");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup is successful even with invalid format of email");
		}
	}

	@Test(priority = 5)
	public void SignupError5() throws InterruptedException { // Password & Confirm Password doesn't match

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

//		firstname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		lastname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		confirmpassword.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		firstname.sendKeys("Robert");
		lastname.sendKeys("Downey");
		email.sendKeys("robert@meg-nxt.com");
		password.sendKeys("Robby@1234");
		confirmpassword.sendKeys("Robby@12");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//label[text()='Confirm Password']"));
		String rgba=signup.getCssValue("color");
//		String hex=Color.fromString(rgba).asHex();
//		System.out.println("Colour is: " + rgba); //rgba(239, 68, 68, 1)
//		System.out.println("Hex code for the colour is: "+ hex); //#ef4444
		String expectedcolor="rgba(239, 68, 68, 1)";
		if(rgba.equals(expectedcolor))
		{
			Assert.assertTrue(true);
			logger.info("Signup unsuccessful as password & confirm password don't match");
		} 
		else
		{
			Assert.assertTrue(false);
			logger.info("Signup is successful even with password unmatch");
		}
	}

	@Test(priority = 6)
	public void SignupwithoutLastname() throws InterruptedException { // Checking whether it sign's-up without Last name

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

		firstname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		lastname.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		confirmpassword.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		firstname.sendKeys("Rahul");
		lastname.sendKeys(" ");
		email.sendKeys("rahul@meg-nxt.com");
		password.sendKeys("Rahul@123");
		driver.findElement(By.tagName("svg")).click();
		confirmpassword.sendKeys("Rahul@123");
		Thread.sleep(2000);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Signup successfully']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup successful without lastname");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup unsuccessful");
		}
	}

	@Test(priority = 7)
	public void CorrectSignup() throws InterruptedException { // Signing up with all inputs Correct

		driver.findElement(By.id("signupRedirect")).click();

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));

		firstname.sendKeys("Hrishikesh");
		lastname.sendKeys("Joshi");
		email.sendKeys("hrishikesh@ceinsys.com");
		password.sendKeys("Hrishi@123");
		confirmpassword.sendKeys("Hrishi@123");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Signup successfully']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Signup successful");
		} else {
			Assert.assertTrue(false);
			logger.info("Signup unsuccessful");
		}
	}

	@Test(priority = 8)
	public void WrongLogin1() throws InterruptedException { // Login with Wrong Password

		logger.info("URL is Working");

		LoginPage LP = new LoginPage(driver);
		LP.setEmail(correctemail);
		logger.info("Correct Email is entered");

		LP.setPassword(wrongpassword);
		logger.info("Wrong password is entered");
		driver.findElement(By.tagName("svg")).click();
		Thread.sleep(2000);

		LP.ClickSignin();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Invalid credentials']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Login is unsuccessful with wrong credentials");
		} else {
			Assert.assertTrue(false);
			logger.info("Login is successful with wrong credentials");
		}

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void WrongLogin2() throws InterruptedException { // Login with wrong email
		LoginPage LP = new LoginPage(driver);
		LP.setEmail(wrongemail);
		logger.info("Wrong Email is entered");

		LP.setPassword(correctpassword);
		logger.info("Correct Password is entered");
		Thread.sleep(2000);

		LP.ClickSignin();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Invalid credentials']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Login is unsuccessful with wrong credentials");
		} else {
			Assert.assertTrue(false);
			logger.info("Login is successful with wrong credentials");
		}

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void WrongLogin3() throws InterruptedException { // Login with email-is other than meg-nxt.com and
															// ceinsys.com
		LoginPage LP = new LoginPage(driver);
		LP.setEmail(otheremail);
		logger.info("Credentials with other email-id(except ceinsys.com & meg-nxt.com) is entered");

		LP.setPassword(correctpassword);
		logger.info("Correct Password is entered");
		Thread.sleep(2000);

		LP.ClickSignin();
		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//div[text()='Invalid credentials']"));
		if (signup.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Login is unsuccessful with other email-id");
		} else {
			Assert.assertTrue(false);
			logger.info("Login is successful with wrong credentials");
		}

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void UnapprovedLogin() throws InterruptedException{ //Login with recently signup user which is not approved by Admin
		driver.findElement(By.name("email")).sendKeys("rahul@meg-nxt.com");
		driver.findElement(By.name("password")).sendKeys("Rahul@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//div[text()='Your account is not activated yet.Please contact admin.']"));
		if(login.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Login is unsuccessful with unapproved User");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login is successful with unapproved user");
		}
	}

	@Test(priority = 12)
	public void CorrectLogin() throws InterruptedException { // Login with correct input

		LoginPage LP = new LoginPage(driver);
		LP.setEmail(correctemail);
		logger.info("Correct Email is entered");

		LP.setPassword(correctpassword);
		logger.info("Correct Password is entered");
		Thread.sleep(3000);

		LP.ClickSignin();
		Thread.sleep(2000);

		WebElement myproject = driver.findElement(By.xpath("//a[text()='My Projects']"));
		if (myproject.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Login is successful");
		} else {
			Assert.assertTrue(false);
			logger.info("Login is not successful");
		}
		
		driver.findElement(By.id("logout")).click();
	}

}
