package SeleniumCore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 08-Sep-2023 5:49:59 pm
 **/
public class P30_StaticWaitVSDynamicWait {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		
		
		driver.findElement(By.cssSelector("[name='alert']")).click();
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().alert().accept();
		
		
	}

}
