package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @Author -- Aditya Shinde Java + Selenium 14-Sep-2023 4:16:51 pm
 **/
public class P11_TestNGAnnotations {

  
	//Suite >> Test >> Class >> Method --> State Transport Chief Minister 
	
	@BeforeSuite
	public void initializtion() {
		
		System.out.println("Invoking Database ");		
	}
	
	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("Invoke the browser");
	}
	
	
	@BeforeClass
	public void invokePageObject() {
		
		System.out.println("Invoking the pages from build");
	}
	
	@BeforeMethod
	public void handleCookies() {
		
		System.out.println("Delete all the cookies");
	}
	
	
	@Test
	public void testCase() {
		
		System.out.println("Test case 1 ");
	}
	
	
	@AfterMethod
	public void captureSessionId() {
		
		System.out.println("Session id Collection");
	}
	
	
	
	@AfterClass
	public void generateReports() {
		
		System.out.println("Generates Reports on the basis of classes");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("Close the browser");
	}
	


	@AfterSuite
	public void tearDown() {
		
		System.out.println("Closing the database and closing the server");
	}
	
	





}
