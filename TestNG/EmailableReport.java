package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport {
	@Test
	public void googleTitleTest() {
		Reporter.log("Running Testcase 1", true);
		System.out.println("@Test-->google title test");
	}
	@Test
	public void SearchText() {
		Reporter.log("Running Testcase 2", true);
		System.out.println("@Test-->Search Text");
	}
}
