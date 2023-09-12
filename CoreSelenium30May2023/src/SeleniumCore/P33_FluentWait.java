package SeleniumCore;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Sep-2023 5:22:27 pm
 **/
public class P33_FluentWait {

	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.id("enable-button")).click();
		
		FluentWait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
		
		
		
		WebElement button = driver.findElement(By.id("disable"));
		
		boolean check = button.isEnabled();
	
		if(check) {
		
		button.click();
		
		System.out.println("Element is Enable And Test case pass");
		
		}
		else {
			
			System.out.println("Element is disable And Test case fail");
		}
	   
		driver.quit();
		
		
	}
}
