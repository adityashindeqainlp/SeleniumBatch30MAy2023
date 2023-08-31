package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 31-Aug-2023 4:53:40 pm
 **/
public class P11_CheckBoxSelection {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> checkBoxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		for(WebElement checkBox : checkBoxes ) {
			
			checkBox.click();
		}
		
		Thread.sleep(5000);
	
		driver.quit();
	}
	
}
