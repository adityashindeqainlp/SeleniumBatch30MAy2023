package TestNG;

import org.testng.annotations.Test;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Sep-2023 5:12:05 pm
 **/
public class P2_HelpingAttributes {

	// priority

	//Invocation Count  
	@Test(priority = 0 , invocationCount = 5)
	public static void test() {

		System.out.println("Test Case 1");
	}

	//enabled
	@Test(priority = 1 ,enabled = false)
	public static void aTest() {

		System.out.println("Test case 2");
	}

	@Test(priority = 2)
	public static void bTest() {

		System.out.println("Test case 3");
	}

	//enabled
	@Test(priority = 3 , enabled = true)
	public static void cTest() {

		System.out.println("Test case 2.1 ");
	}

	
	

}
