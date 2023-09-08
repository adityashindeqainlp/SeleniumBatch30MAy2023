package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Sep-2023 5:06:31 pm
 **/
public class P25_MouseActions {

	public static WebDriver driver;
	public static Actions act;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement button1 = driver.findElement(By.id("sub-menu"));

		act = new Actions(driver);

//		WebElement doubleClickButton = driver.findElement(By.id("double-click"));
//		act.doubleClick(doubleClickButton).build().perform();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//			
//		// Hover the mouse cursor on specific element using move to element method 
//		// build -  make the script ready for execution
//		// perform -  execute the action in scripts 
//		act.moveToElement(button1).build().perform();
//
//		Thread.sleep(2500);
//		
//	
//		//Single click
//		WebElement alertButton  = driver.findElement(By.xpath("//*[@name='alert']"));
//		act.click(alertButton).build().perform();
//		driver.switchTo().alert().accept();
//		

		// Right click
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2500);
		WebElement rightClickButton = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(rightClickButton).build().perform();

		driver.quit();

	}

}
