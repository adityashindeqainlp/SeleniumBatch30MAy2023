package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Aug-2023 5:19:31 pm
 **/
public class BrowserLaunch {

	public static void main(String[] args) {


//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

	//	ChromeDriver driver = new ChromeDriver();
		
		
		//WebDriverManager
		
		WebDriverManager.chromedriver().setup();
		
		
		//******
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

}
