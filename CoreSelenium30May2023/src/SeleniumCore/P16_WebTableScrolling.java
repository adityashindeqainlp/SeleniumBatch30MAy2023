package SeleniumCore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 01-Sep-2023 5:23:31 pm
 **/
public class P16_WebTableScrolling {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Step 1 Initialize browser and Hit Url 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Step 2  Type Cast Driver to JavaScript Executor Class
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Step 3 Using class reference variable Invoke Execute script method 
		// Step 4 place "Window.scrolBy(x,y)" with args ""
		js.executeScript("window.scrollBy(0,700)", "");

		Thread.sleep(2500);
		
		// Step 5 Using class reference variable Invoke Execute script method 
		// Step 6 place "document.querySelector('cssAddress/Value').scrollBy(x,y)" with args ""
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)", "");
		Thread.sleep(2500);
		
		driver.quit();

	}

}
