package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Sep-2023 5:00:38 pm
 **/
public class P24_PromptPopUp {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		WebElement promptPopUp = driver.findElement(By.xpath("//*[@name='prompt']"));
		promptPopUp.click();
		
		driver.switchTo().alert().sendKeys("i am the prompt pop up");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2500);
		driver.quit();
		
		
	}

}
