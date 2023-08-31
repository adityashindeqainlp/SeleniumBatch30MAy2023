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

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));

		for (WebElement year : years) {

			if (year.getText().equalsIgnoreCase("1996")) {
				System.out.println(year.getText());
				year.click();
				break;
			}
		}

		Thread.sleep(2500);

		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));

		for (WebElement month : months) {

			if (month.getText().equalsIgnoreCase("jun")) {
				System.out.println(month.getText());
				month.click();
				break;
			}
		}

		Thread.sleep(2500);

		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));

		for (WebElement day : days) {

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
