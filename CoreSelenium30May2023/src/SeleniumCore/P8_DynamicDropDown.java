package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 30-Aug-2023 5:23:22 pm
 **/
public class P8_DynamicDropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch The browser and Hit the Url
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		
		//Step  2 Capture the entire elements in year drop down and store it in List
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));

		//Step 3  Use the ForEach loop to extract single element from list
		for (WebElement year : years) {

		//Step 4 Use if statement to fetch the expected year and perform click  	
			if (year.getText().equalsIgnoreCase("1996")) {
				System.out.println(year.getText());
				year.click();
				break;
			}
		}

		Thread.sleep(2500);

		
		//Step 5 Capture the entire elements in month drop down and store it in List
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));

		//Step 6  Use the ForEach loop to extract single element from list
		for (WebElement month : months) {

		//Step 7 Use if statement to fetch the expected month and perform click	
			if (month.getText().equalsIgnoreCase("jun")) {
				System.out.println(month.getText());
				month.click();
				break;
			}
		}

		Thread.sleep(2500);

		//Step 8 Capture the entire elements in day drop down and store it in List
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));

		//Step 9  Use the ForEach loop to extract single element from list
		for (WebElement day : days) {

	   //Step 10 Use if statement to fetch the expected day and perform click
			if (day.getText().equals("29")) {
				System.out.println(day.getText());
				day.click();
				break;

			}
		}

		Thread.sleep(2500);

		driver.quit();
	}

}
