package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Aug-2023 5:34:33 pm
 **/
public class P4_getCurrentUrlAndGetTitle {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/?_rdr");

		String urlFromBuild = driver.getCurrentUrl();
		System.out.println(urlFromBuild);

		if (urlFromBuild.equals("https://mbasic.facebook.com/?_rdr")) {

			System.out.println("Test case is pass and url is matching");

		} else {

			System.out.println("Test case is fail and url is not matching");
		}

		String titleFromBuild = driver.getTitle();

		if (titleFromBuild.equals("Facebook – log in or sign up")) {

			System.out.println("Test case pass & title is matching");

		} else {

			System.out.println("Test case fail & title is not matching ");
		}

		driver.quit();

	}

}
