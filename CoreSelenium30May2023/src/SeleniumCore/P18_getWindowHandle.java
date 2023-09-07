package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 05-Sep-2023 4:44:54 pm
 **/
public class P18_getWindowHandle {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2500);
		
		
		String ids = driver.getWindowHandle();
		
		System.out.println(ids);
		
		// CDwindow-162891E29D3AFCD13BCEFD17AC632BA1
		
		// CDwindow-EE35C5E17F6A6A79EB6D2977F2D9A3C3
		
		driver.quit();
	}

}
