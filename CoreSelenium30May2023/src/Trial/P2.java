package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 28-Aug-2023 12:28:56 pm
 **/
public class P2 {

	public static void main(String[] args) {

//		System.setProperty("Webdriver.chrome.driver",
//				"C:\\Users\\Aditya Shinde\\Desktop\\Tools\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions option = new ChromeOptions();
//		option.setBinary("C:\\Users\\Aditya Shinde\\Desktop\\Tools\\chrome-win64\\chrome.exe");

//		WebDriver driver = new ChromeDriver(option);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("selenium");

		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}
}
