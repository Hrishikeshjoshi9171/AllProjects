package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider = "gettestdata")
	public void kitetest(String Username, String Password) {
		System.out.println("KiteLogin");
		System.out.println(Username);
		System.out.println(Password);
		System.out.println();
	}

	@DataProvider(name = "gettestdata")
	public Object[][] getdata() {

		Object[][] data = new Object[4][2];

		// Correct Username and Correct Password
		// Correct Username and Wrong Password
		// Wrong Username and Correct Password
		// Wrong Username and Wrong Password
		
		data[0][0] = "Correct Username";
		data[0][1] = "Correct Password";
		
		data[1][0] = "Correct Username";
		data[1][1] = "Wrong Password";

		data[2][0] = "Wrong Username";
		data[2][1] = "Correct Password";
		
		data[3][0] = "Wrong Username";
		data[3][1] = "Wrong Password";
		
		return data;
	}
}
