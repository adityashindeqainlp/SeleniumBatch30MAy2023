package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Sep-2023 4:40:38 pm
 **/
public class P22_SimpleAlert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement simpleAlert = driver.findElement(By.xpath("//*[@name='alert']"));

		simpleAlert.click();

		Thread.sleep(2000);

		String alertMsg = driver.switchTo().alert().getText();

		System.out.println(alertMsg);

		driver.switchTo().alert().accept();

		driver.quit();

	}

}
