package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Sep-2023 5:36:28 pm
 **/
public class P3_HardAssert {

	public static WebDriver driver;

	@Test(priority = 0)
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority = 1)
	public void validateUrl() {

		String urlFromBuild = driver.getCurrentUrl();

		// boolean check = urlFromBuild.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login123");

		// Assert.assertTrue(check);

		// Assert.assertFalse(check);
		
		Assert.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login123");
	}

	@Test(priority = 2)
	public void tearDown() {

		driver.quit();
	}

}
