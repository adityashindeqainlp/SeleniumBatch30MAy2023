package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Sep-2023 4:53:57 pm
 **/
public class P23_ConformationAlert {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement confirmationAlert = driver.findElement(By.xpath("//*[@name='confirmation']"));
		
		confirmationAlert.click();
		
		String msg = driver.switchTo().alert().getText();
		
		System.out.println(msg);
		
		// driver.switchTo().alert().accept();
		
		 driver.switchTo().alert().dismiss();
		
		Thread.sleep(2500);
		driver.quit();
		
		
	}

}
