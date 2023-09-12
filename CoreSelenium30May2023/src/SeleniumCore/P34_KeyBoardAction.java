package SeleniumCore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Sep-2023 5:48:59 pm
 **/
public class P34_KeyBoardAction {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		WebElement firstNameField = driver.findElement(By.xpath("//*[@name='firstname']"));

		Actions act = new Actions(driver);

		act.sendKeys(firstNameField, "tom ").keyDown(Keys.SHIFT).sendKeys("jerry ").
		keyUp(Keys.SHIFT).
		sendKeys("Oggy")
		.build().perform();

	}

}
