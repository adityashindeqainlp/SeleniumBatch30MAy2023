package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Aug-2023 4:40:15 pm
 **/
public class P1_LaunchingTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 Invoke WebDriverManger
		// Invoking ChromeDriver Class
		// Invoking setup method 
		
		//WebDriverManager.chromedriver().setup();
		
		// Step 2 Create Object of ChromeDriver Class AND Store it in WebDriver's Reference 
		WebDriver driver = new ChromeDriver();
		
		//Step  3  Maximize the window 
		driver.manage().window().maximize();
		
		// Step 4  Invoking the get method and pass url as an args
		driver.get("https://www.google.com");
		
		//Step 5 Close the entire browser
		driver.quit();
		
	}

}
