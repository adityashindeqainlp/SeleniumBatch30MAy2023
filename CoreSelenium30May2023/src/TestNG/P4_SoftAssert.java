package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Sep-2023 4:21:40 pm
 **/
public class P4_SoftAssert {

	public static WebDriver driver;

	@Test(priority = 0)
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority = 1)
	public void titleValidation() {

		String titleFromBuild = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		boolean check = titleFromBuild.equals("OrangeHRM123");
		sa.assertTrue(check);
		sa.assertAll();

	}

	@Test(priority = 2)
	public void tearDown() {

		driver.quit();
	}
}
