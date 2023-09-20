package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Sep-2023 4:40:08 pm
 **/
public class P12_TestNgAnnotationsWorking {

	public static WebDriver driver;
	public static SoftAssert sa;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log("Launching the Browser and Hit the Url" , false);
	}

	@Test(dataProvider = "getData")
	public void loginValidation(String username, String password) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@name='username']")).clear();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).clear();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
		Reporter.log("Closing the Browser" , false);
	}

	@DataProvider(name = "getData")
	public Object[][] getData() {

		Object[][] data = new Object[4][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Addminnn";
		data[1][1] = "admin123";

		data[2][0] = "Admin";
		data[2][1] = "chkhksh";

		data[3][0] = "afggaug";
		data[3][1] = "214sgjga";

		return data;

	}

}
