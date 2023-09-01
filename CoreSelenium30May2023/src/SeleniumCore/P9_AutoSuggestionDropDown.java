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

		// Step 1 Launch The browser and Hit the Url
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Step 2 Locate the auto suggestion drop down and perform click to enable the element 
		WebElement autoSuggest = driver.findElement(By.id("autocomplete"));
		
		autoSuggest.click();
		
		//Step 3 Provide set of char in field of drop down
		autoSuggest.sendKeys("ir");
		
		Thread.sleep(1200);
		
		//Step 4 Locate all the elements appeared in the drop down list and store it in list 
		List <WebElement> nations = driver.findElements(By.className("ui-menu-item-wrapper"));
		
		//Step 5 Extract an element from list 
		for(WebElement nation : nations ) {
		
		//Step 6 Use if statement to get desired option of nation and click 	
			if(nation.getText().equalsIgnoreCase("Iran (Islamic Republic of)")) {
				
				nation.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
