package SeleniumCore;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 05-Sep-2023 4:52:03 pm
 **/
public class P19_getWindowHandles {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2500);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Thread.sleep(5000);
		
		Set <String> ids = driver.getWindowHandles();
		
		Iterator <String> it = ids.iterator();
		
		String id1 = it.next(); // id for loginPage 
		String id2 = it.next(); // id for Home page 
		
		System.out.println(id1);
		System.out.println(id2);
		
		driver.switchTo().window(id2);
		
		Thread.sleep(2500);
		driver.switchTo().window(id1);
		
		Thread.sleep(2500);
		driver.switchTo().window(id2);
		
		Thread.sleep(2500);
		
		//driver.findElement(By.xpath("//button[text()='Try it for Free']")).click();
		
		driver.close();
		
		Thread.sleep(2500);

		driver.quit();

	}

}
