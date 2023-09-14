package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Sep-2023 4:40:08 pm
 **/
public class P9_Parameterization {

	public static WebDriver driver;
	public static SoftAssert sa;

	@Test(priority = 0)
	@Parameters({ "browser", "url" })
	public void launchBrowser(String browser, String url) {

		String name = browser;

		if (name.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test(priority = 1)
	public void urlValidation() {

		String urlFromBuild = driver.getCurrentUrl();
		sa = new SoftAssert();
		sa.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		sa.assertAll();
	}

	@Test(priority = 2)
	public void titleValidation() {

		String titleFromBuild = driver.getTitle();
		sa = new SoftAssert();
		sa.assertEquals(titleFromBuild, "OrangeHRM");
		sa.assertAll();
	}

	@Test(priority = 3)
	public void loginValidation() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		String breadCrumbofBuild = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']//h6"))
				.getText();
		sa = new SoftAssert();
		sa.assertEquals(breadCrumbofBuild, "Dashboard");
		sa.assertAll();
	}

	@Test(priority = 4)
	public void tearDown() {

		driver.quit();

	}

}
