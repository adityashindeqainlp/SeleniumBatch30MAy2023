package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 25-Aug-2023 10:53:14 am
 **/
public class P5_BrowserSelectionUtility {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		// Step 2 Create if else Tree to control the execution of program

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver(); // Geko Driver

		} else {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		browserLaunch("chrome");
		
		driver.get("https://mbasic.facebook.com/?_rdr");

		Thread.sleep(2500);

		driver.quit();

	}

}
