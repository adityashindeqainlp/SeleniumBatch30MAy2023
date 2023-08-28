package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 25-Aug-2023 5:49:44 pm
 **/
public class P6_LocatorsOfSelenium {

	public static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Locator ID 
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Thread.sleep(2500);
		
		
		
		driver.quit();
		
	}

}
