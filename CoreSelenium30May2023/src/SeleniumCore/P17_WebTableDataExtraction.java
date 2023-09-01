package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 01-Sep-2023 5:34:08 pm
 **/
public class P17_WebTableDataExtraction {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//tr//td[4]"));

		int number = 0;
		int valueFromMsg = 0;

		for (WebElement value : values) {

			String s = value.getText();

			System.out.println(s);

			number = number + Integer.parseInt(s);

		}

		System.out.println("Sum of all amount : " + number);

		WebElement commentFromBuild = driver.findElement(By.xpath("//div[@class='totalAmount']"));

		String msg = commentFromBuild.getText();

		String[] words = msg.split("\\s");

		for (String word : words) {

			if (word.equals("296")) {

				valueFromMsg = Integer.parseInt(word);
			}
		}

		System.out.println("Value from comment of build : " + valueFromMsg);

		if (number == valueFromMsg) {

			System.out.println("Total Amount and the total calaculation of data is mataching ");

		} else {

			System.out.println("Total Amount and the total calaculation of data is not mataching ");
		}

		driver.quit();

	}

}
