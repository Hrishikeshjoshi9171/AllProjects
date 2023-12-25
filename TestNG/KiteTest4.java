package TestNG;

import org.testng.annotations.Test;

public class KiteTest4 {
	@Test
	public void loginTest() {
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void Homepage() {
		System.out.println("Login Page");
	}
	@Test(dependsOnMethods="loginTest")
	public void searchpage() {
		System.out.println("Login Page");
	}
	@Test(dependsOnMethods="loginTest")
	public void RegPage() {
		System.out.println("Login Page");
	}
}
