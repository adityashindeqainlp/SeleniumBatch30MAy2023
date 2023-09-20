package Globalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 14-Sep-2023 4:54:20 pm
 **/
public class GlobalEnvironmentVariable {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		File path = new File(".\\Resource\\config.properties");

		FileInputStream fis = new FileInputStream(path);

		Properties prop = new Properties();

		prop.load(fis);

		if (prop.getProperty("browser").equalsIgnoreCase("xyz")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
