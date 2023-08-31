package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 31-Aug-2023 5:35:33 pm
 **/
public class P14_RadioButton {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		WebElement button = driver.findElement(By.xpath("(//*[@id='sex'])[3]"));
		
		boolean check1 = button.isDisplayed();
		boolean check2 = button.isEnabled();
		
		if(check1== true && check2 == true) {
			
			button.click();
		}
		
		boolean chcek3 = button.isSelected();
		
		if(chcek3 == true){
			
			System.out.println("Button is clickable and Test case pass");
			
		}
		else {
			
			System.out.println("Button is not clickable and Test case fail");
		}
		
		Thread.sleep(2500);
		
		driver.quit();

	}
}