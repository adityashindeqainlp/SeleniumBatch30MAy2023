package SeleniumCore;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
*@Author -- Aditya Shinde Java + Selenium 
* 08-Sep-2023
* 5:35:43 pm
**/
public class P29_ScreenShot {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		//Take Screen Shot 
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\Aditya Shinde\\Desktop\\screenShot\\sliderScreenShot1.png");
		
		FileHandler.copy(source, target);
		
		driver.quit();

	}

}
