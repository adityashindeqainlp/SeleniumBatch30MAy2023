package SeleniumCore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Sep-2023 4:40:08 pm
 **/
public class P31_ImplicitWait {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// https://chercher.tech/practice/practice-pop-ups-selenium-webdriver

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/implicit-wait-example"); //5sec  //10 sec 
		//20 sec

		int i=1; 
		
		while(i>0) {
			
			
			driver.findElement(By.xpath("//input[@type='checkbox']["+ i +"]")).click(); //5 sec //10 sec
			i++; //20sec
		}
		
		 
	}

}
