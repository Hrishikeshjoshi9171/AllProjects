package TestNG;

import org.testng.annotations.Test;

public class KiteTest8 {
//	Question-->If you want to handle exception without try catch block, so how will you handle it?
//	Answer--> expectedExceptions = Exceptiontype.class
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Test() {
		System.out.println("HandleNumberFormatException exception");
		
		String s="100A";
		Integer.parseInt(s);
	}
}