package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 30-Aug-2023 5:47:09 pm
 **/
public class P9_AutoSuggestionDropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement autoSuggest = driver.findElement(By.id("autocomplete"));
		
		autoSuggest.click();
		
		autoSuggest.sendKeys("ir");
		
		Thread.sleep(1200);
		
		List <WebElement> nations = driver.findElements(By.className("ui-menu-item-wrapper"));
		
		for(WebElement nation : nations ) {
			
			if(nation.getText().equalsIgnoreCase("Iran (Islamic Republic of)")) {
				
				nation.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
