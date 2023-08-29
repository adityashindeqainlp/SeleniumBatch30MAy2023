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

         driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		// 7.1) * xpath

		// driver.findElement(By.xpath("//*[@value= 'radio1']")).click();

		// 7.2 ) and Operator with Xpath

		// driver.findElement(By.xpath("//select[@id='dropdown-class-example' and
		// @name='dropdown-class-example']")).click();

		// 7.3) Or operator with xpath

		// driver.findElement(By.xpath("//select[@id='dropdown-class-example' or
		// type='text']")).click();

		// 7.4)Absloute Xpath

		// "/html/body/div[1]/div[3]/fieldset/select"

		// "/html/body/div[1]/div[6]/div/div/div/div/div/div/main/div/div/div/feed-container/turbo-frame/tab-container/div[2]/div[1]/article[1]/div/div[1]/section/form/button"

		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/select")).click();

		// 7.5) Relative Xpath (Parking Lot)

		// 7.6)Xpath following Xpath

		// driver.findElement(By.xpath("//div[@id='checkbox-example']//input[@id='checkBoxOption2']")).click();
		
		// 7.7) Xpath with Text()
		
		//<a href="https://www.udemy.com/course/mobile-automation-using-appiumselenium-3/?referralCode=C46BF551F5B9EAF08E10">Appium</a>
		
		//driver.findElement(By.xpath("//*[text()='Appium']")).click();
		
		//7.8) Xpath with Contains 
		//driver.findElement(By.xpath("//*[contains (@id,'checkBoxOption1')]")).click();
		

		// 8)Css Selector

		// <input value="radio2" name="radioButton" class="radioButton" type="radio">
		// Formula --> Tagname[attribute = 'attributeValue']

		// driver.findElement(By.cssSelector("input[value='radio2']")).click();

		// 8.1) Without tagname

		//driver.findElement(By.cssSelector("[value='radio2']")).click();
		
		// 8.2) css following css [Attribute = 'AttributeVlaue']...singleSpace...[Attribute = 'AttributeVlaue']
		// div[id='radio-btn-example'] input[value='radio3']
		// [id='radio-btn-example'] [value='radio3']
		
		//driver.findElement(By.cssSelector("[id='radio-btn-example'] [value='radio3']")).click();
		
		// 8.3) id locator using css "#idValue"
		
		//driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		
		
		//8.4) class locator using css ".classValue"
		
//		List <WebElement> rdButtons = driver.findElements(By.cssSelector(".radioButton"));
//		
//		for(WebElement rd : rdButtons) {
//			
//			rd.click();
//		}
		

		Thread.sleep(2500);

		driver.quit();

	}

}
