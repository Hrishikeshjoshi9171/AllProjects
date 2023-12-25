package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
//	Hard Assertion: If a hard assertion is getting failed immediately, test case will be marked as failed
//	                and test case will be terminated. 
	@Test
	public void demoTest() {
		
		Assert.assertTrue(true);
		
		System.out.println("False");
		
		Assert.assertEquals("Welcome","elcome"); //Failed
	
		System.out.println("Hello");
		
		Assert.assertEquals("Selenium","Selenium");
	}
	@Test
	public void demoTest1() {
		
		Assert.assertTrue(true);
		
		System.out.println("Good Morning");
		
		Assert.assertEquals("Selenium","Selenium");
		
		System.out.println("Successfully Passed");
		
		System.out.println("Successfully Passed");
	}
}
