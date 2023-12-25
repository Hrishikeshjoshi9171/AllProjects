package TestNG;

import org.testng.annotations.Test;

public class KiteTest5 {
	@Test(invocationCount=5)
	public void m1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is =="+c);
	}
}
