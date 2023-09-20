package SeleniumCore;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 20-Sep-2023 1:18:36 pm
 **/
public class P21_BootStrapDatePicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.id("datepicker1")).click();
		
		Thread.sleep(2500);

		int i = 0;

		while (i == 0) {

			WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));

			String titleFromBuild = title.getText();

			if (!(titleFromBuild.equalsIgnoreCase("June 1996"))) {

				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();

			} else {

				break;
			}

		}
		
		Thread.sleep(2500);

		List<WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));

		for (WebElement day : days) {

			if (day.getText().equals("29")) {

				day.click();
			}

		}

		Thread.sleep(2500);

		driver.quit();

	}

}
