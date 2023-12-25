package TestNG;

import org.testng.annotations.Test;

public class KiteTest7 {
	//Exception timeout
	@Test(timeOut=1000)
	public void infiniteloop() {
		for(;;) {
			System.out.println("Hello");
		}
	}
}
