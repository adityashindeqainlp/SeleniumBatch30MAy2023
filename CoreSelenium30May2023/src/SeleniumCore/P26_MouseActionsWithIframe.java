package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Sep-2023 5:48:40 pm
 **/
public class P26_MouseActionsWithIframe {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iframe);

		WebElement handleOfSlider = driver.findElement(By.xpath("//*[@id='slider']//span"));

		Actions action = new Actions(driver);

		action.clickAndHold(handleOfSlider).moveToElement(handleOfSlider, 250, 0).release().build().perform();

	}

}
