package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 25-Aug-2023 5:49:44 pm
 **/
public class P6_LocatorsOfSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1) Locator ID

//		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
//		checkBox.click();

		// 2) Name
//		driver.findElement(By.name("checkBoxOption2")).click();

		// 3) ClassName

//		List<WebElement> buttons = driver.findElements(By.className("radioButton"));

//		for(WebElement button : buttons) {
//			
//			Thread.sleep(1500);
//			
//			button.click();
//			
//		}

//		for (int i = 0; i < buttons.size(); i++) {
//
//			if (i == 1) {
//
//				buttons.get(i).click();
//			}
//
//		}

		// 4) link Text
		// <a href="http://www.restapitutorial.com/"> REST API </a>
//		driver.findElement(By.linkText("REST API")).click();

		// 5) partial link Text
//		driver.findElement(By.partialLinkText("REST")).click();

		// 6) Tagname

		// List <WebElement> nOfLinks= driver.findElements(By.tagName("a"));
		// System.out.println(nOfLinks.size());

		// 7) Xpath
		// <input value="option1" type="checkbox">
		// Formula --> //TagName[@Attribute='AttributeValue']

		driver.findElement(By.xpath("//input[@value='option1']")).click();

		// 7) * xpath

		driver.findElement(By.xpath("//*[@value= 'radio1']")).click();

		Thread.sleep(2500);

		driver.quit();

	}

}
