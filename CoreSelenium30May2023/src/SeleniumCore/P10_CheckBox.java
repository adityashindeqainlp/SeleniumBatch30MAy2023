package SeleniumCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 31-Aug-2023 4:40:23 pm
 **/
public class P10_CheckBox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//// Step 1 Launch The browser and Hit the Url
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Step 2 Locate the specific check box 
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));

		//Step 3 check whether located check box is displayed and enabled or Not
		boolean check1 = checkBox.isDisplayed();// true
		boolean check2 = checkBox.isEnabled();// true

		//Step 4 If statement for validation of check box then click
		if (check1 == true && check2 == true) {

			checkBox.click();
		}

		// Step 5 Validate check box is selected or not 
		boolean check3 = checkBox.isSelected();

		if (check3 == true) {

			System.out.println("Check box selected and test case pass");
		} else {

			System.out.println("Check box not selected and test case fail");
		}

		Thread.sleep(2500);

		driver.quit();

	}

}
