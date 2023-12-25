package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
/*	@BeforeSuite --> Setup system property for chrome --> 1st Preference
	@BeforeTest  --> Launch Browser --> 2nd Preference
	@BeforeClass --> Enter URL --> 3rd Preference
	
	@BeforeMethod --> Login to application 
	@Test --> Google --> Search test
	@Aftermethod --> Logout from application
	
	
	@BeforeMethod --> Login to application
	@Test --> Google Title test
	@Aftermethod --> Logout from application
	
	
	@BeforeMethod --> Login to application
	@Test --> Google logo test
	@Aftermethod -- Logout from application
	
	
	@AfterClass --> Close Browser
	@AfterTest -->  DeleteAllCookies
*/

// 	 Precondition Annotations --> Starts with @Before
	
	@BeforeClass
	public void URL() {
		System.out.println("@BeforeClass --> Enter URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod--> Login to Application");
	}
	
	//TestClass--> Starts with @Test
	@BeforeSuite
	public void setup() {
		System.out.println("BeforeSuite --> Setup system property for chrome");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("@BeforeTest --> Launch Browser");
	}
	
	@Test
	public void GoogleTitleTest() {
		System.out.println("@Test --> Google Title Test");
	}
	
	@Test
	public void Searchtext() {
		System.out.println("@Test --> Google--> Search text");
	}
	
	@Test
	public void GoogleLogoTest() {
		System.out.println("@Test --> Google Logo Test");
	}
	
	//PostCondition -->Starts with @After
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod --> Logout from Application");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("@AfterClass --> Close Browser");
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		System.out.println("@AfterTest--> Delete All Cookies");
	}
}
