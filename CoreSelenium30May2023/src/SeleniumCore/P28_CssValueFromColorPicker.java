package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 08-Sep-2023 5:03:17 pm
 **/
public class P28_CssValueFromColorPicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#colorpicker");

		WebElement iframe = driver.findElement(By.tagName("iframe"));

		driver.switchTo().frame(iframe);

		WebElement handle1 = driver.findElement(By.xpath("//*[@id='red']//span"));
		WebElement handle2 = driver.findElement(By.xpath("//*[@id='green']//span"));
		WebElement handle3 = driver.findElement(By.xpath("//*[@id='blue']//span"));

		Actions action = new Actions(driver);

		action.clickAndHold(handle1).moveToElement(handle1, 255, 0).release().build().perform();

		Thread.sleep(2500);

		action.clickAndHold(handle2).moveToElement(handle2, -9, 0).release().build().perform();

		Thread.sleep(2500);

		action.clickAndHold(handle3).moveToElement(handle3, 68, 0).release().build().perform();

		Thread.sleep(2500);

		// 255 131 128 
		
		WebElement colorValue = driver.findElement(By.id("swatch"));
		
		String rgb = colorValue.getCssValue("background-color");
		
		System.out.println(rgb);
		
		if(rgb.equals("rgba(255, 132, 118, 1)")) {
			
			System.out.println("Test case Pass");
			
		}else {
			
			System.out.println("Test case fail");
		}
		
		driver.quit();

	}
}
