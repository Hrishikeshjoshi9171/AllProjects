package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	SoftAssert softassert=new SoftAssert();
	//It will collect the results of all the assertion
	@Test
	public void demotest1() {
		softassert.assertEquals("Welcome","Welcome");
		System.out.println("Execution started");
		softassert.assertEquals("Selenium","Seliny"); //failed
		System.out.println("Successfully passed demotest1");
		
		System.out.println("Successfully Passed demotest1");
		softassert.assertAll();
		//It will collect the result of all the assertion and in case of any failure mark all the test as failed.
		System.out.println();
	}
	@Test
	public void demotest2() {
		softassert.assertEquals("Welcome","elcome"); //false
		System.out.println("Execution started");
		softassert.assertTrue(false);//false
		softassert.assertEquals(false,true); //false
		softassert.assertEquals("Selenium","Seleniy");//false
		System.out.println("Successfully Passed demotest2");
	}
}
