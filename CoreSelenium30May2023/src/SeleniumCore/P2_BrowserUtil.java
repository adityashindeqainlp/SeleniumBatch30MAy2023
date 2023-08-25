package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Aug-2023 4:52:44 pm
 **/
public class P2_BrowserUtil {

	public static WebDriver driver;

		

	public static void main(String[] args) throws InterruptedException {

		// Step 1 Define String Variable to take input from user
		String browser = "chrome";

		// Step 2 Create if else Tree to control the execution of program

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver(); //Geko Driver 

		} else {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		// Step 3 Hit the Url

		driver.get("https://mbasic.facebook.com/?_rdr");

		Thread.sleep(2500);

		// Step 4 Quit the Browser

		driver.quit();

	}

}
