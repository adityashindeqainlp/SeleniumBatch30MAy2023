package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 30-Aug-2023 5:01:23 pm
 **/
public class P7_StaticDropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Step 1 Initializing Browser and Hit the Url
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		// Step 2 Locate the drop-down and place it in variable with return type
		// WebElement
		WebElement yearDrop = driver.findElement(By.id("year"));
		WebElement monthDrop = driver.findElement(By.id("month"));
		WebElement dayDrop = driver.findElement(By.id("day"));

		// Step 3 Make an object of Select class and store it in same class reference
		// variable to handle static Drop-down
		Select year = new Select(yearDrop);
		Select month = new Select(monthDrop);
		Select day = new Select(dayDrop);

		//Step 4 using Select class ref. var. invoke
		//** selectByValue(String) , 
		//selectByVisibleText(String)
		//selectByIndex(Index value)
		year.selectByValue("1998");
		Thread.sleep(1000);
		month.selectByVisibleText("Apr");
		Thread.sleep(1000);
		day.selectByIndex(15);
		Thread.sleep(5000);

		//Step 5 Quit the Driver
		driver.quit();

	}

}
